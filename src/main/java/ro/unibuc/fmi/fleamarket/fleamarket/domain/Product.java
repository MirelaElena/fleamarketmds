package ro.unibuc.fmi.fleamarket.fleamarket.domain;


import ro.unibuc.fmi.fleamarket.fleamarket.domain.enumeration.Category;
import ro.unibuc.fmi.fleamarket.fleamarket.domain.enumeration.ProductStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Optional;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private Category category;

    //@JsonIgnore
    @Column(name = "publish_date")
    private LocalDate publishDate;

    //@JsonIgnore
    @Enumerated(EnumType.STRING)
    @Column(name = "product_status")
    private ProductStatus productStatus;

    @Column(name ="picture")
    private String imageUrl;

    @ManyToOne
    private Person person;

    public Person getPerson() {
        return person;
    }

    public Product person(Person person) {
        this.person = person;
        return this;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Product imageUrl(String imageUrl){
        this.imageUrl = imageUrl;
        return this;
    }
}
