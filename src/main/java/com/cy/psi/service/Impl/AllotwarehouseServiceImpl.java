package com.cy.psi.service.Impl;

import com.cy.psi.entity.Allotwarehouse;
import com.cy.psi.dao.AllotwarehouseDao;
import com.cy.psi.service.AllotwarehouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Allotwarehouse)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 11:19:16
 */
@Service("allotwarehouseService")
public class AllotwarehouseServiceImpl implements AllotwarehouseService {
    @Resource
    private AllotwarehouseDao allotwarehouseDao;
    /**
     分页查询所有
     */
    @Override
    public List<Allotwarehouse> selectAllotwarehouse() {
        return allotwarehouseDao.selectAllotwarehouse();
    }

    /**
     高级查询
     */
    @Override
    public List<Allotwarehouse> selectBylikeAllotwarehouse(String serialNumber, String documentmaker, String depotName) {
        return allotwarehouseDao.selectBylikeAllotwarehouse(serialNumber,documentmaker,depotName);
    }

    /**
     * 通过主键删除数据
     *
     * @param channelid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer channelid) {
        return this.allotwarehouseDao.deleteById(channelid) > 0;
    }
}
