package com.juaracoding.weeklytest;

public class Product {

     private int id;
  private String name;
  private double price;
  private double discount;
  private int stock;
  private int limitStock = 5;

  public Product(int id, String name, double price, double discount, int stock) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.discount = discount;
    this.stock = stock;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public boolean isStockAvailable() {
    return stock > 0 && stock <= limitStock;
  }
}