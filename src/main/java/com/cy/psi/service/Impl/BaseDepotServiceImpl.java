package com.cy.psi.service.Impl;

import com.cy.psi.dao.BaseDepotDao;
import com.cy.psi.entity.BaseDepot;
import com.cy.psi.entity.BaseProduct;
import com.cy.psi.service.BaseDepotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class BaseDepotServiceImpl implements BaseDepotService {

    @Resource
    private BaseDepotDao baseDepotDao;

    /**
     * 分页查询仓库数据
     * @return
     */
    @Override
    public List<BaseDepot> SelectAll(){
        return baseDepotDao.selectAll();
    }


    @Override
    public List<BaseDepot> selectAll100() {

        return baseDepotDao.selectAll100();
    }

}
