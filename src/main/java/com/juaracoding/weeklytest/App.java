package com.juaracoding.weeklytest;

import java.util.HashSet;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
         HashSet<cart> carts = new HashSet<>();  

         carts.addAll(List.of(
                
                new cart(new Product(1, "RTX 5080", 799, 30, 80), 1)));
        

        double total = 0;
        for (cart cart: carts) {

            System.out.println("Nama Produk : " + cart.getProduct().getName());
            System.out.println("Harga Before Discount = $" + cart.getProduct().getPrice());
            System.out.println("Discount = " + cart.getProduct().getDiscount() + "%");
            System.out.println("Potongan Harga Produk = $" + cart.getSubtotal() * 0.30);
            System.out.println("Harga After Discount = $" + cart.getSubtotal());
            total = total + cart.getSubtotal();
            System.out.println("===================================");
        }
            System.out.printf("Total Belanjaan Anda = $%.2f\n ", total);
    }
}    
  
