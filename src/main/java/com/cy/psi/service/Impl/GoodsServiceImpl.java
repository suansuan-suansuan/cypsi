package com.cy.psi.service.Impl;

import com.cy.psi.dao.CypsiPuorderDao;
import com.cy.psi.dao.GoodsDao;
import com.cy.psi.entity.Goods;
import com.cy.psi.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 皮皮虾
 */

@Slf4j
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;

    @Override
    public List<Goods> GoselectAll() {
        log.debug("查询所有");
        return goodsDao.GoselectAll();
    }


}
