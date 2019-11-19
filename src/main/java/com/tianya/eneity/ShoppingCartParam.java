package com.tianya.eneity;

public class ShoppingCartParam extends BasicEntity {
    private Integer userId;
    private Integer status;

    public ShoppingCartParam() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ShoppingCartParam{" +
                "userId=" + userId +
                ", status=" + status +
                '}';
    }
}
