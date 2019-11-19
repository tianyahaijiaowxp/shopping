package com.tianya.service;

import com.tianya.eneity.ShoppingCartParam;
import com.tianya.eneity.TOrderForm;

import java.util.List;

public interface TOrderFormService {

    public void insertOrderForm(TOrderForm orderForm);

    public List<TOrderForm> findOrderFormByUserAndBookId(ShoppingCartParam param);

    public void deleteOrderFormByPrimaryKey(Integer id);

    public void payAllOrder(Integer id);
}
