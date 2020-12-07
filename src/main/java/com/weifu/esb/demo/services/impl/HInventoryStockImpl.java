package com.weifu.esb.demo.services.impl;

import com.weifu.esb.demo.entity.HInventoryStock;
import com.weifu.esb.demo.mapper.HInventoryStockMapper;
import com.weifu.esb.demo.services.IHInventoryStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * HInventoryStock 服务类
 *
 * @author chengfeng.tong@bosch-si.com
 * @date 2020-10-20
 */
@Service
public class HInventoryStockImpl implements IHInventoryStockService {

    @Autowired
    private HInventoryStockMapper hInventoryStockMapper;

    /**
     * 查询HInventoryStock
     *
     * @param id HInventoryStock ID
     * @return HInventoryStock Object
     */

    @Override
    public HInventoryStock selectHInventoryStockById(Integer id)
    {
        return hInventoryStockMapper.selectHInventoryStockById(id);
    }

    /**
     * 查询HInventoryStock列表
     *
     * @param hInventoryStock HInventoryStock Object
     * @return HInventoryStock Object List
     */
    @Override
    public List<HInventoryStock> selectHInventoryStockList(HInventoryStock hInventoryStock)
    {
        return hInventoryStockMapper.selectHInventoryStockList(hInventoryStock);
    }

    /**
     * 新增HInventoryStock
     *
     * @param hInventoryStock HInventoryStock Object
     * @return 结果
     */
    @Override
    public int insertHInventoryStock(HInventoryStock hInventoryStock)
    {
        return hInventoryStockMapper.insertHInventoryStock(hInventoryStock);
    }

    /**
     * 修改HInventoryStock
     *
     * @param hInventoryStock HInventoryStock Object
     * @return 结果
     */
    @Override
    public int updateHInventoryStock(HInventoryStock hInventoryStock)
    {
        return hInventoryStockMapper.updateHInventoryStock(hInventoryStock);
    }

    /**
     * 批量删HInventoryStocks
     *
     * @param ids 需要删除的HInventoryStock ID
     * @return 结果
     */
    @Override
    public int deleteHInventoryStockByIds(Integer[] ids)
    {
        return hInventoryStockMapper.deleteHInventoryStockByIds(ids);
    }

    /**
     * 删除产品-系列-区域对照信息
     *
     * @param id HInventoryStock ID
     * @return 结果
     */
    @Override
    public int deleteHInventoryStockById(Integer id)
    {
        return hInventoryStockMapper.deleteHInventoryStockById(id);
    }

    /**
     *
     * @return 结果
     */
    @Override
    public int clearHInventoryStock()
    {
        return hInventoryStockMapper.clearHInventoryStock();
    }

}
