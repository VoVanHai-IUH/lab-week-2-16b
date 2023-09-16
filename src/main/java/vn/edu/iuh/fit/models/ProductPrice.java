package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "product_price")
@IdClass(ProductPrice.ProductPricePK.class)
public class ProductPrice {

    @Id
    private long product_id;
    @Id
    private DateTime price_date_time;
    //    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "note")
    private String note;

    public ProductPrice() {
    }

    public ProductPrice(long product_id, double price, String note) {
        this.product_id = product_id;
        this.price_date_time = DateTime.now();
        this.price = price;
        this.note = note;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long productId) {
        this.product_id = productId;
    }

    public DateTime getPrice_date_time() {
        return price_date_time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "productId=" + product_id +
                ", dateTime=" + price_date_time +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }

    //=========================================================================
    public static class ProductPricePK implements Serializable {
        private long product_id;
        private DateTime price_date_time;

        public ProductPricePK(long product_id, DateTime price_date_time) {
            this.product_id = product_id;
            this.price_date_time = price_date_time;
        }

        public long getProduct_id() {
            return product_id;
        }

        public void setProduct_id(long product_id) {
            this.product_id = product_id;
        }

        public DateTime getPrice_date_time() {
            return price_date_time;
        }

        public void setPrice_date_time(DateTime price_date_time) {
            this.price_date_time = price_date_time;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ProductPricePK)) return false;
            ProductPricePK that = (ProductPricePK) o;
            return getProduct_id() == that.getProduct_id() && Objects.equals(getPrice_date_time(), that.getPrice_date_time());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getProduct_id(), getPrice_date_time());
        }

        @Override
        public String toString() {
            return "ProductPricePK{" +
                    "product_id=" + product_id +
                    ", price_date_time=" + price_date_time +
                    '}';
        }
    }
}
