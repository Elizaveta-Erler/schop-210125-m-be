package de.telran_1schop._mbe.pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class Product {

    private Long produktId;

    private String name;

    private String deskription;

    private Double price;

    private String imageUrl;

    private  Double dicountPrice;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    private Long categoryId;

    public Long getProduktId() {
        return produktId;
    }

    public String getName() {
        return name;
    }

    public String getDeskription() {
        return deskription;
    }

    public Double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Double getDicountPrice() {
        return dicountPrice;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public Product() {
    }

    public Product(Long produktId, Long categoryId, Timestamp updatedAt, Timestamp createdAt, Double dicountPrice, Double price, String imageUrl, String deskription, String name) {
        this.produktId = produktId;
        this.categoryId = categoryId;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.dicountPrice = dicountPrice;
        this.price = price;
        this.imageUrl = imageUrl;
        this.deskription = deskription;
        this.name = name;
    }

    public void setProduktId(Long produktId) {
        this.produktId = produktId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeskription(String deskription) {
        this.deskription = deskription;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDicountPrice(Double dicountPrice) {
        this.dicountPrice = dicountPrice;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "produktId=" + produktId +
                ", name='" + name + '\'' +
                ", deskription='" + deskription + '\'' +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                ", dicountPrice=" + dicountPrice +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", categoryId=" + categoryId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(produktId, product.produktId) && Objects.equals(name, product.name) && Objects.equals(deskription, product.deskription) && Objects.equals(price, product.price) && Objects.equals(imageUrl, product.imageUrl) && Objects.equals(dicountPrice, product.dicountPrice) && Objects.equals(createdAt, product.createdAt) && Objects.equals(updatedAt, product.updatedAt) && Objects.equals(categoryId, product.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produktId, name, deskription, price, imageUrl, dicountPrice, createdAt, updatedAt, categoryId);
    }
}
