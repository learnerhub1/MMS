package com.example.MMS.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = " Veg_details")
@Data
public class Vegetables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "veg_name")
    private String Vegetablename ;

    @Column(name = "category")
    private String category ;

    @Column(name = "price_per_unit", nullable = false)
    private Float pricePerUnit;

    @Column(name = "stock_quantity", nullable = false)
    private Float stockQuantity;

    public Vegetables(){

    }
    public  Vegetables(String vegetablename,String category,float pricePerUnit,float stockQuantity){
        this.Vegetablename=vegetablename;
        this.category=category;
        this.pricePerUnit=pricePerUnit;
        this.stockQuantity=stockQuantity;


    }
}
