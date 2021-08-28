package OOPS;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class shopping_cart {


    class Product{
        int id;
        String name;
        int price;
        Product(int id,String name,int price){
            this.id = id;
            this.name = name;
            this.price = price;
        }
        int getPrice(){
            return price;
        }
    }

    class Item{
	    final Product product;
        int qty;

        Item(final Product product,int qty){
            this.product = product;
            this.qty = qty;
        }

        int getPrice(){
            return qty*product.getPrice();
        }
    }

    class Cart{
        //Todo : List of Items

    }

    final Product allProducts[] = {
            new Product(1, "Apple", 40),
            new Product(1, "Apple", 40),
            new Product(1, "Apple", 40),
            new Product(1, "Apple", 40),
            new Product(1, "Apple", 40),
    };


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        //Loop
        //Prompt : View Cart / Add Item / Checkout
        // if selection == add item
        char option;
        while(true){
            System.out.print("Choose an option? (v)iew item, (a)dd item, (c)heckout\n");
            option=scn.next().charAt(0);

            if(option=='a'){
                //Todo : Add to Cart

            }
            else if(option=='v'){
                //view cart

            }
            else{
                //option checkout

            }


        }




    }
}
