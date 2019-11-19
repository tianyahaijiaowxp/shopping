package com.tianya.service.impl;

import com.tianya.eneity.ShoppingCartParam;
import com.tianya.eneity.TOrderForm;
import com.tianya.mapper.TOrderFormMapper;
import com.tianya.service.TOrderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TOrderFormServiceImpl implements TOrderFormService {
    @Autowired
    private TOrderFormMapper orderFormMapper;

    @Override
    public void insertOrderForm(TOrderForm orderForm) {
        orderFormMapper.insertOrderForm(orderForm);
    }

    @Override
    public List<TOrderForm> findOrderFormByUserAndBookId(ShoppingCartParam param) {
        return orderFormMapper.selectOrderFormByUserAndBookId(param);
    }

    @Override
    public void deleteOrderFormByPrimaryKey(Integer id) {
        orderFormMapper.deleteOrderFormByPrimaryKey(id);
    }

    @Override
    public void payAllOrder(Integer id) {
        orderFormMapper.payAllOrder(id);
    }
}
