package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "product_image ")
@IdClass(ProductImage.ProductImagePK.class)
public class ProductImage {
    @Id
    private long product_id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long image_id;
    @Column(length = 250, nullable = false)
    private String path;
    @Column(length = 250)
    private String alternative;

    @ManyToOne
    private Product product;

    public ProductImage() {
    }

    public ProductImage(long product_id, String path, String alternative) {
        this.product_id = product_id;
        this.path = path;
        this.alternative = alternative;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public long getImage_id() {
        return image_id;
    }

    public void setImage_id(long image_id) {
        this.image_id = image_id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "product_id=" + product_id +
                ", image_id=" + image_id +
                ", path='" + path + '\'' +
                ", alternative='" + alternative + '\'' +
                '}';
    }


    public static class ProductImagePK implements Serializable {
        private long product_id;
        private long image_id;

        public ProductImagePK() {
        }

        public ProductImagePK(long product_id, long image_id) {
            this.product_id = product_id;
            this.image_id = image_id;
        }

        public long getProduct_id() {
            return product_id;
        }

        public void setProduct_id(long product_id) {
            this.product_id = product_id;
        }

        public long getImage_id() {
            return image_id;
        }

        public void setImage_id(long image_id) {
            this.image_id = image_id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ProductImagePK)) return false;
            ProductImagePK that = (ProductImagePK) o;
            return getProduct_id() == that.getProduct_id() && getImage_id() == that.getImage_id();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getProduct_id(), getImage_id());
        }

        @Override
        public String toString() {
            return "ProductImagePK{" +
                    "product_id=" + product_id +
                    ", image_id=" + image_id +
                    '}';
        }
    }
}
