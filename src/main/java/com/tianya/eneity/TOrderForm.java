package com.tianya.eneity;

import java.sql.Timestamp;

public class TOrderForm extends BasicEntity {
    private Integer id;
    private String orderNumber;
    private Integer count;
    private Integer status;
    private Timestamp createTime;
    private TBook book;
    private TUser user;

    public TOrderForm() {
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TBook getBook() {
        return book;
    }

    public void setBook(TBook book) {
        this.book = book;
    }

    public TUser getUser() {
        return user;
    }

    public void setUser(TUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "TOrderForm{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", count=" + count +
                ", status=" + status +
                ", createTime=" + createTime +
                ", book=" + book +
                ", user=" + user +
                '}';
    }
}
