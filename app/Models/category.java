package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;


import play.data.format.*;
import play.data.validation.*;

//entity managed by ORM
@Entity 
public class Category extends Model {

//properties
//ID is the primary key
@ID 
private long id;

@constraints .required 
private String name; 

@OneToMany
private List<Product> products;

//Default Constructor
public  Category() {

}
public Category(Long id, String category, String name, String description, int stock, double price) {

    this.id = id;
    this.name = name;
    this.category = category;
    this.description = description;
    this.stock = stock;
    this.price = price;
}

//Query helper for entity Category with ID Long 
public static Finder<long, Category> find = new Finder<Long, Category>(Category.class);

//find all categories in the database in ascending order by name 
public static List<Category> findAll(){
    return Category.Find.query().where().orderBy("name asc").findList();
}

}