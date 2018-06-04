package com.gtja.finance.pojo;

import java.io.Serializable;

public class Orderdetail implements Serializable {
    private Integer id;

    private Integer orderid;

    private Integer itemsid;

    private Integer itemsnum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public Integer getItemsnum() {
        return itemsnum;
    }

    public void setItemsnum(Integer itemsnum) {
        this.itemsnum = itemsnum;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orderdetail other = (Orderdetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getItemsid() == null ? other.getItemsid() == null : this.getItemsid().equals(other.getItemsid()))
            && (this.getItemsnum() == null ? other.getItemsnum() == null : this.getItemsnum().equals(other.getItemsnum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getItemsid() == null) ? 0 : getItemsid().hashCode());
        result = prime * result + ((getItemsnum() == null) ? 0 : getItemsnum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderid=").append(orderid);
        sb.append(", itemsid=").append(itemsid);
        sb.append(", itemsnum=").append(itemsnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}