package com.cy.psi.service.Impl;

import com.cy.psi.dao.PuordersDao;
import com.cy.psi.entity.CypsiPuorder;
import com.cy.psi.entity.Puorders;
import com.cy.psi.service.PuordersSerice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("PuordersSerice")
public class PuordersSericeImpl implements PuordersSerice {


    @Resource
    private PuordersDao puordersDao;

    @Override
    public void insertPu(Puorders order) {
//        this.puordersDao.insertPu(order);
    }

    @Override
    public void insertPuS(CypsiPuorder saleOrder) {
//        this.puordersDao.insertPu(saleOrder);
    }

    @Override
    public void insertb(List<Puorders> orderdetails) {
        System.out.println("orderdetails=>"+orderdetails.toString());
        //this.puordersDao.insertPu(orderdetails);
    }
}
