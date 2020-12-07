package com.weifu.esb.demo.mapper;

import com.weifu.esb.demo.entity.HInventoryStock;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * HInventoryStock Mapper接口
 *
 * @author chengfeng.tong@bosch-si.com
 * @date 2020-11-25
 */
@Mapper
public interface HInventoryStockMapper {

    /**
     * 查询HInventoryStock
     *
     * @param id HInventoryStock ID
     * @return HInventoryStock对象
     */
    HInventoryStock selectHInventoryStockById(Integer id);

    /**
     * 查询HInventoryStock列表
     *
     * @param hInventoryStock HInventoryStock对象
     * @return HInventoryStock对象集合
     */
    List<HInventoryStock> selectHInventoryStockList(HInventoryStock hInventoryStock);

    /**
     * 新增HInventoryStock
     *
     * @param hInventoryStock HInventoryStock对象
     * @return 结果
     */
    int insertHInventoryStock(HInventoryStock hInventoryStock);

    /**
     * 修改HInventoryStock
     *
     * @param hInventoryStock HInventoryStock对象
     * @return 结果
     */
    int updateHInventoryStock(HInventoryStock hInventoryStock);

    /**
     * 删除HInventoryStock
     *
     * @param id OHInventoryStock ID
     * @return 结果
     */
    int deleteHInventoryStockById(Integer id);

    /**
     * 批量删除HInventoryStocks
     *
     * @param ids 需要删除的HInventoryStock ID
     * @return 结果
     */
    int deleteHInventoryStockByIds(Integer[] ids);

    /**
     * 清除HInventoryStocks
     *
     * @return 结果
     */
    int clearHInventoryStock();
}
