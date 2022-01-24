package com.example.sorabi.models;

import io.swagger.annotations.ApiModel;

import javax.persistence.*;

@ApiModel(description="All details about product")
@Entity
@Table(name="tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String nameProduct;

    @Column
    private String price;

    @Column
    private int qty;


    public int getId(){
        return id;
    }

    public String getNameProduct(){
        return nameProduct;
    }

    public void setNameProduct(String inputProduct){
        this.nameProduct = inputProduct;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String inputPrice){
        this.price = inputPrice;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(Integer inputQty){
        this.qty = inputQty;
    }
}
