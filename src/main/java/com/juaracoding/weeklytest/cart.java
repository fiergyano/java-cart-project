package com.juaracoding.weeklytest;

public class cart {

    private Product product;
    private int quantity;
    private double subtotal;

    public cart(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getSubtotal() {
        double subtotal = product.getPrice() * quantity;
        if (product.getDiscount() > 0) {
            subtotal = subtotal - (subtotal * product.getDiscount() / 100);
        }
        return subtotal;
    }
}
