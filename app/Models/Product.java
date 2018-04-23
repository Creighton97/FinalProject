package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;


import play.data.format.*;
import play.data.validation.*;

@Entity
public class Product extends Model {

// Properties
@Id
private Long id;

@Constraints.Required
private String name;

@Constraints.Required
private String category;

@Constraints.Required
private String description;

@Constraints.Required
private int stock;

@Constraints.Required
private double price;

// Default Constructor

public Product() {

}

    //Generic query helper for entity Product with id type Long
    public static Finder<Long,Product> find = new Finder<>(Product.class);

// Constructor to initialise object

public Product(Long id, String category, String name, String description, int stock, double price) {

this.id = id;

this.name = name;

this.category = category;

this.description = description;

this.stock = stock;

this.price = price;

}
    @ManyToOne
    private Category category




    // Accessor methods

    public Long getId() {

    return id;

    }

    public void setId(Long id) {

    this.id = id;

    }

    public String getName() {

    return name;

    }

    public void setName(String name) {
    this.name = name;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


} 