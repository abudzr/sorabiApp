package com.example.sorabi.models;

import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.util.Date;

@ApiModel(description="All details about transaction")
@Entity
@Table(name="tbl_transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private int userId;

    @Column
    private int productId;

    @Column
    private int qty;

    @Column
    private String total;

    @Column
    private Date date;

    public int getId(){
        return id;
    }

    public int getUserId(){
        return userId;
    }
    public void setUserId(Integer inputUserId){
        this.userId = inputUserId;
    }

    public int getProductId(){
        return productId;
    }
    public void setProductId(Integer inputProductId){
        this.productId = inputProductId;
    }

    public int getQty(){
        return qty;
    }
    public void setQty(Integer inputQty){
        this.qty = inputQty;
    }

    public String getTotal(){
        return total;
    }


    public Date getDate(){return  date;}
    public void setDate(Date inputDate){this.date = inputDate;}
}
