/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesreports.Model;

import java.util.Date;

/**
 *
 * @author masad
 */
public class ProductModel {
    private String id;
    private String name;
    private String category;
    private int price;
    private int stock;    
    private Date restock;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setRestock(Date restock) {
        this.restock = restock;
    }

    public Date getRestock() {
        return restock;
    }
    
    
}
