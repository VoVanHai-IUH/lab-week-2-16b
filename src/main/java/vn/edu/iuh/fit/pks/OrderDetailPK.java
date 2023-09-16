package vn.edu.iuh.fit.pks;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderDetailPK implements Serializable {
    @Column(name = "order_id")
    private long order_id;
    @Column(name = "product_id")
    private long product_id;

    public OrderDetailPK() {
    }

    public OrderDetailPK(long order_id, long product_id) {
        this.order_id = order_id;
        this.product_id = product_id;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long orderId) {
        this.order_id = orderId;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long productId) {
        this.product_id = productId;
    }

    @Override
    public String toString() {
        return "OrderDetailPK{" +
                "orderId=" + order_id +
                ", productId=" + product_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDetailPK)) return false;
        OrderDetailPK that = (OrderDetailPK) o;
        return getOrder_id() == that.getOrder_id() && getProduct_id() == that.getProduct_id();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrder_id(), getProduct_id());
    }
}