package com.weifu.esb.demo.services;


import com.weifu.esb.demo.entity.HInventoryStock;

import java.util.List;

/**
 * HInventoryStock接口类
 *
 * @author chengfeng.tong@bosch-si.com
 * @date 2020-11-25
 */
public interface IHInventoryStockService {

    /**
     * 查询HInventoryStock列表
     *
     * @param hInventoryStock HInventoryStock Object
     * @return HInventoryStock集合
     */
    List<HInventoryStock> selectHInventoryStockList(HInventoryStock hInventoryStock);

    /**
     * 查询HInventoryStock
     *
     * @param id HInventoryStock ID
     * @return HInventoryStock Object
     */
    HInventoryStock selectHInventoryStockById(Integer id);

    /**
     * 新增HInventoryStock
     *
     * @param hInventoryStock HInventoryStock Object
     * @return 结果
     */
    int insertHInventoryStock(HInventoryStock hInventoryStock);

    /**
     * 修改HInventoryStock
     *
     * @param hInventoryStock HInventoryStock Object
     * @return 结果
     */
    int updateHInventoryStock(HInventoryStock hInventoryStock);

    /**
     * 批量HInventoryStock
     *
     * @param ids 需要删除的HInventoryStock ID
     * @return 结果
     */
    int deleteHInventoryStockByIds(Integer[] ids);

    /**
     * 删除HInventoryStock
     *
     * @param id HInventoryStock ID
     * @return 结果
     */
    int deleteHInventoryStockById(Integer id);

    /**
     * 清除HInventoryStock
     *
     * @return 结果
     */
    int clearHInventoryStock();

}
