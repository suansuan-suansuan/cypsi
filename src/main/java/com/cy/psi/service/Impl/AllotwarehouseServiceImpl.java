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

    //逻辑删除
    @Override
    public Integer DelAllotwarehouse( Integer timeLiness,Integer channelid){
        return allotwarehouseDao.DelAllotwarehouse(timeLiness,channelid);
    }


}
