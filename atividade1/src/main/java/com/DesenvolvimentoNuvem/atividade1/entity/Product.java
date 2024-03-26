package com.DesenvolvimentoNuvem.atividade1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="product_name")
    private String product_name;

    @Column(name="brand_name")
    private String brand_name;

    @Column(name="cost_value")
    private double cost_value;

    public Product() {

    }

    public Product(int id, String product_name, String brand_name, double cost_value) {
        this.id = id;
        this.product_name = product_name;
        this.brand_name = brand_name;
        this.cost_value = cost_value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public double getCost_value() {
        return cost_value;
    }

    public void setCost_value(double cost_value) {
        this.cost_value = cost_value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", product_name='" + product_name + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", cost_value=" + cost_value +
                '}';
    }
}
