package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import org.joda.time.DateTime;

import java.util.List;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long order_id;

    @Column(name = "order_date", nullable = false)
    private DateTime orderDate;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

    public Order() {
    }

    public Order(Employee employee, Customer customer, List<OrderDetail> orderDetails) {
        this.orderDate = DateTime.now();
        this.employee = employee;
        this.customer = customer;
        this.orderDetails = orderDetails;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long id) {
        this.order_id = id;
    }

    public DateTime getOrderDate() {
        return orderDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + order_id +
                ", orderDate=" + orderDate +
                ", employee=" + employee +
                ", customer=" + customer +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
