package com.weifu.esb.demo.services.impl;

import com.weifu.esb.demo.entity.HDeliveryRecord;
import com.weifu.esb.demo.mapper.HDeliveryRecordMapper;
import com.weifu.esb.demo.services.IHDeliveryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * HDeliveryRecord 服务类
 *
 * @author chengfeng.tong@bosch-si.com
 * @date 2020-10-20
 */
@Service
public class HDeliveryRecordImpl implements IHDeliveryRecordService {

    @Autowired
    private HDeliveryRecordMapper hDeliveryRecordMapper;

    /**
     * 查询HDeliveryRecord
     *
     * @param id HDeliveryRecord ID
     * @return HDeliveryRecord Object
     */
    @Override
    public HDeliveryRecord selectHDeliveryRecordById(Integer id)
    {
        return hDeliveryRecordMapper.selectHDeliveryRecordById(id);
    }

    /**
     * 查询HDeliveryRecord列表
     *
     * @param hDeliveryRecord HDeliveryRecord Object
     * @return HDeliveryRecord Object List
     */
    @Override
    public List<HDeliveryRecord> selectHDeliveryRecordList(HDeliveryRecord hDeliveryRecord)
    {
        return hDeliveryRecordMapper.selectHDeliveryRecordList(hDeliveryRecord);
    }

    /**
     * 新增HDeliveryRecord
     *
     * @param hDeliveryRecord HDeliveryRecord Object
     * @return 结果
     */
    @Override
    public int insertHDeliveryRecord(HDeliveryRecord hDeliveryRecord)
    {
        return hDeliveryRecordMapper.insertHDeliveryRecord(hDeliveryRecord);
    }

    /**
     * 修改HDeliveryRecord
     *
     * @param hDeliveryRecord HDeliveryRecord Object
     * @return 结果
     */
    @Override
    public int updateHDeliveryRecord(HDeliveryRecord hDeliveryRecord)
    {
        return hDeliveryRecordMapper.updateHDeliveryRecord(hDeliveryRecord);
    }

    /**
     * 批量删HDeliveryRecords
     *
     * @param ids 需要删除的HDeliveryRecord ID
     * @return 结果
     */
    @Override
    public int deleteHDeliveryRecordByIds(Integer[] ids)
    {
        return hDeliveryRecordMapper.deleteHDeliveryRecordByIds(ids);
    }

    /**
     * 删除产品-系列-区域对照信息
     *
     * @param id HDeliveryRecord ID
     * @return 结果
     */
    @Override
    public int deleteHDeliveryRecordById(Integer id)
    {
        return hDeliveryRecordMapper.deleteHDeliveryRecordById(id);
    }

    /**
     *清除HDeliveryRecord
     *
     * @return 结果
     */
    @Override
    public int clearHDeliveryRecord(String aedat)
    {
        return hDeliveryRecordMapper.clearHDeliveryRecord(aedat);
    }

    /**
     *计数HDeliveryRecord
     *
     * @return 结果
     */
    @Override
    public int countHDeliveryRecord()
    {
        return hDeliveryRecordMapper.countHDeliveryRecord();
    }

}
