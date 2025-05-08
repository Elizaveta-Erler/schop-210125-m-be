package de.telran_1schop._mbe.pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class Order {

    private Integer orderId;

    private Integer userId;

    private Timestamp createdAt;

    private String deliveryAddress;

    private String contactPhone;

    private String deliveryMethod;

    private Enum status;

    private Timestamp upsendedAt;

    public Order() {
    }

    public Order(Integer orderId, Integer userId, Timestamp createdAt, String deliveryAddress, String contactPhone, String deliveryMethod, Enum status, Timestamp upsendedAt) {
        this.orderId = orderId;
        this.userId = userId;
        this.createdAt = createdAt;
        this.deliveryAddress = deliveryAddress;
        this.contactPhone = contactPhone;
        this.deliveryMethod = deliveryMethod;
        this.status = status;
        this.upsendedAt = upsendedAt;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public Timestamp getUpsendedAt() {
        return upsendedAt;
    }

    public void setUpsendedAt(Timestamp upsendedAt) {
        this.upsendedAt = upsendedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId) && Objects.equals(userId, order.userId) && Objects.equals(createdAt, order.createdAt) && Objects.equals(deliveryAddress, order.deliveryAddress) && Objects.equals(contactPhone, order.contactPhone) && Objects.equals(deliveryMethod, order.deliveryMethod) && Objects.equals(status, order.status) && Objects.equals(upsendedAt, order.upsendedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, userId, createdAt, deliveryAddress, contactPhone, deliveryMethod, status, upsendedAt);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", createdAt=" + createdAt +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", deliveryMethod='" + deliveryMethod + '\'' +
                ", status=" + status +
                ", upsendedAt=" + upsendedAt +
                '}';
    }
}
