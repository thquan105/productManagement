/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thq.product;

/**
 *
 * @author PC
 */
public class Product {
    private String idProduct;
    private String idCategory;
    private String nameProduct;
    private String nameCategory;
    private int price;
    private int amount;



    public Product() {
        
    }

    public Product(String idProduct, String idCategory, String nameProduct, String nameCategory, int price, int amount) {
        this.idProduct = idProduct;
        this.idCategory = idCategory;
        this.nameProduct = nameProduct;
        this.nameCategory = nameCategory;
        this.price = price;
        this.amount = amount;
    }
    
    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }
    
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
