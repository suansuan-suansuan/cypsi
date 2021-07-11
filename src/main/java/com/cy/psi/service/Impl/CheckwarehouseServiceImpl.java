package com.cy.psi.service.Impl;


import com.cy.psi.dao.CheckwarehouseDao;
import com.cy.psi.entity.Checkwarehouse;
import com.cy.psi.service.CheckwarehouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Checkwarehouse)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 10:12:25
 */
@Service("checkwarehouseService")
public class CheckwarehouseServiceImpl implements CheckwarehouseService {
    @Resource
    private CheckwarehouseDao checkwarehouseDao;

    /**
     查询所有
     */
    @Override
    public List<Checkwarehouse> selectCheckwarehouse() {
        return checkwarehouseDao.selectCheckwarehouse();
    }

    /**
     * 通过主键删除数据
     *
     * @param checkid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer checkid) {
        return this.checkwarehouseDao.deleteById(checkid) > 0;
    }
}
