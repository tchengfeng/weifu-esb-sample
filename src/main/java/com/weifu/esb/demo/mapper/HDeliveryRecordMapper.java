package com.weifu.esb.demo.mapper;

import com.weifu.esb.demo.entity.HDeliveryRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * HDeliveryRecord Mapper接口
 *
 * @author chengfeng.tong@bosch-si.com
 * @date 2020-11-25
 */
@Mapper
public interface HDeliveryRecordMapper {

    /**
     * 查询HDeliveryRecord
     *
     * @param id HDeliveryRecord ID
     * @return HDeliveryRecord对象
     */
    HDeliveryRecord selectHDeliveryRecordById(Integer id);

    /**
     * 查询HDeliveryRecord列表
     *
     * @param hDeliveryRecord HDeliveryRecord对象
     * @return HDeliveryRecord对象集合
     */
    List<HDeliveryRecord> selectHDeliveryRecordList(HDeliveryRecord hDeliveryRecord);

    /**
     * 新增HDeliveryRecord
     *
     * @param hDeliveryRecord 新增HDeliveryRecord对象
     * @return 结果
     */
    int insertHDeliveryRecord(HDeliveryRecord hDeliveryRecord);

    /**
     * 修改HDeliveryRecord
     *
     * @param hDeliveryRecord 修改HDeliveryRecord对象
     * @return 结果
     */
    int updateHDeliveryRecord(HDeliveryRecord hDeliveryRecord);

    /**
     * 删除HDeliveryRecord
     *
     * @param id HDeliveryRecord ID
     * @return 结果
     */
    int deleteHDeliveryRecordById(Integer id);

    /**
     * 批量删除HDeliveryRecords
     *
     * @param ids 需要删除的HDeliveryRecord ID
     * @return 结果
     */
    int deleteHDeliveryRecordByIds(Integer[] ids);

    /**
     * 清除HDeliveryRecord
     *
     * @return 结果
     */
    int clearHDeliveryRecord(String aedat);

    /**
     * 清除HDeliveryRecord
     *
     * @return 结果
     */
    int countHDeliveryRecord();

}
