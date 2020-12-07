package com.weifu.esb.demo.services;


import com.weifu.esb.demo.entity.HDeliveryRecord;

import java.util.List;

/**
 * HDeliveryRecord接口类
 *
 * @author chengfeng.tong@bosch-si.com
 * @date 2020-11-25
 */
public interface IHDeliveryRecordService {

    /**
     * 查询HDeliveryRecord列表
     *
     * @param hDeliveryRecord HDeliveryRecord Object
     * @return HDeliveryRecord集合
     */
    List<HDeliveryRecord> selectHDeliveryRecordList(HDeliveryRecord hDeliveryRecord);

    /**
     * 查询HDeliveryRecord
     *
     * @param id HDeliveryRecord ID
     * @return HDeliveryRecord Object
     */
    HDeliveryRecord selectHDeliveryRecordById(Integer id);

    /**
     * 新增HDeliveryRecord
     *
     * @param hDeliveryRecord HDeliveryRecord Object
     * @return 结果
     */
    int insertHDeliveryRecord(HDeliveryRecord hDeliveryRecord);

    /**
     * 修改HDeliveryRecord
     *
     * @param hDeliveryRecord HDeliveryRecord Object
     * @return 结果
     */
    int updateHDeliveryRecord(HDeliveryRecord hDeliveryRecord);

    /**
     * 批量HDeliveryRecord
     *
     * @param ids 需要删除的HDeliveryRecord ID
     * @return 结果
     */
    int deleteHDeliveryRecordByIds(Integer[] ids);

    /**
     * 删除HDeliveryRecord
     *
     * @param id HDeliveryRecord ID
     * @return 结果
     */
    int deleteHDeliveryRecordById(Integer id);

    /**
     *清除HDeliveryRecord
     *
     * @return 结果
     */
    int clearHDeliveryRecord(String aedat);

    /**
     *计数HDeliveryRecord
     *
     * @return 结果
     */
    int countHDeliveryRecord();

}
