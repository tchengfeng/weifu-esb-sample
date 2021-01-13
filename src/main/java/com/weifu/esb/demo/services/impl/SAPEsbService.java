package com.weifu.esb.demo.services.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.weifu.esb.demo.entity.HDeliveryRecord;
import com.weifu.esb.demo.entity.HInventoryStock;
import com.weifu.esb.demo.http.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * ASP ESB服务类
 *
 * @author chengfeng.tong@bosch-si.com
 * @date 2020-11-25
 */
@Service
public class SAPEsbService {

    @Autowired
    private HInventoryStockImpl hInventoryStock;

    @Autowired
    private HDeliveryRecordImpl hDeliveryRecord;

    private static String urlStr  = "http://esb.weifu.com.cn:7080/restStandard";

    /**
     * 插入HInventoryStock對象到DB
     *
     * @throws Exception
     */
    public void insertHInventoryStockObj(String curTime) throws Exception {
        List<HInventoryStock> hInventoryStockList = getHInventoryStockData();

        for(HInventoryStock hInventoryStockObj : hInventoryStockList){
            hInventoryStockObj.setUpdate_time(curTime);
            hInventoryStock.insertHInventoryStock(hInventoryStockObj);
        }
    }

    /**
     * 清除HInventoryStock
     */
    public void clearHInventoryStock() {
        hInventoryStock.clearHInventoryStock();
    }

    /**
     * 插入HDeliveryRecord對象到DB
     *
     * @throws Exception
     */
    public void insertHDeliveryRecordObj(String dateStr) throws Exception {
        List<HDeliveryRecord> hDeliveryRecordList = getHDeliveryRecordData(dateStr);

        for(HDeliveryRecord HDeliveryRecordObj : hDeliveryRecordList){
            hDeliveryRecord.insertHDeliveryRecord(HDeliveryRecordObj);
        }
    }

    /**
     * 清除HDeliveryRecord
     */
    public void clearHDeliveryRecord(String aedat) {
        hDeliveryRecord.clearHDeliveryRecord(aedat);
    }

    /**
     * 计数HDeliveryRecord
     */
    public int countHDeliveryRecord() {
        return hDeliveryRecord.countHDeliveryRecord();
    }


    /**
     * 获取HInventoryStock原始数据（02002000000202）
     *
     * @return
     * @throws Exception
     */
    public List<HInventoryStock> getHInventoryStockData() throws Exception {
        String result = getASPDataFromESB("02033", "02002000000202", "20201120105305", null);
        List<HInventoryStock> hInventoryStockList = pkgObjectList(result, HInventoryStock.class);
        return hInventoryStockList;
    }

    /**
     * 获取HDeliveryRecord原始数据（02002000e000203）
     *
     * @return HDeliveryRecord列表
     * @throws Exception
     */
    public List<HDeliveryRecord> getHDeliveryRecordData(String dateStr) throws Exception {
        String result = getASPDataFromESB("02033", "02002000000203", "20201120110105", dateStr);
        List<HDeliveryRecord> hDeliveryRecordList = pkgObjectList(result, HDeliveryRecord.class);
        return hDeliveryRecordList;
    }

    /**
     *
     * 获取ASP原始数据
     *
     * @param sourceSysID
     * @param ServiceID
     * @param SerialNO
     * @param i_AEDAT
     * @return
     * @throws Exception
     */
    public String getASPDataFromESB(String sourceSysID, String ServiceID, String SerialNO, String i_AEDAT) throws Exception {
        JSONObject Route = new JSONObject();

        Route.put("SourceSysID", sourceSysID);
        Route.put("ServiceID", ServiceID);
        Route.put("SerialNO", SerialNO);

        JSONObject Request = new JSONObject();
        if(i_AEDAT != null & i_AEDAT != ""){
            Request.put("I_AEDAT", i_AEDAT);
        } else {
            Request.put("Request", "");
        }

        JSONObject Data = new JSONObject();
        Data.put("Request", Request);

        JSONObject Service = new JSONObject();
        Service.put("Route", Route);
        Service.put("Data", Data);

        JSONObject paramJson = new JSONObject();
        paramJson.put("Service",Service);

        String result = HttpUtil.doPost(urlStr, paramJson.toString());

        return result;
    }

    /**
     * 封装原始ASP数据为对象
     *
     * @param originalStr
     * @param tClass
     * @param <T>
     * @return
     */
    public <T> List<T> pkgObjectList(String originalStr, Class<T> tClass){
        JSONObject jsonObject = JSONObject.parseObject(originalStr);

        String serviceStr = jsonObject.getString("Service");
        JSONObject serviceJson = JSONObject.parseObject(serviceStr);

        String dataStr = serviceJson.getString("Data");
        JSONObject dataJson = JSONObject.parseObject(dataStr);

        String responseStr = dataJson.getString("Response");
        JSONObject responseJson = JSONObject.parseObject(responseStr);

        JSONArray itemStr = responseJson.getJSONArray("T_ITEM");
        List<T> tList = JSONArray.parseArray(itemStr.toString(),tClass);

        return tList;
    }

}
