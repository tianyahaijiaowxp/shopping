package com.tianya.mapper;

import com.tianya.eneity.ShoppingCartParam;
import com.tianya.eneity.TOrderForm;

import java.util.List;

public interface TOrderFormMapper {

    void insertOrderForm(TOrderForm orderForm);

    List<TOrderForm> selectOrderFormByUserAndBookId(ShoppingCartParam param);

    void deleteOrderFormByPrimaryKey(Integer id);

    void payAllOrder(Integer id);
}
