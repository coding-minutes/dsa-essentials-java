package ShoppingCart;

import java.util.Scanner;

public class CardMain {


    static Product[] allProducts = new Product[]{
            new Product(1,"apple",26),
            new Product(3,"mango",16),
            new Product(2,"guava",36),
            new Product(5,"banana",56),
            new Product(4,"strawberry",29),
            new Product(6,"pineapple",20),
    };

    static Product chooseProduct(){

        Scanner scn = new Scanner(System.in);
        //Display the list of products
        String productList = "";
        System.out.println("Available Products ");

        for(Product product : allProducts){
            productList += (product.getDisplayName());
        }

        System.out.println(productList);
        System.out.println("--------------------");

        String choice = scn.nextLine();

        for(int i=0; i< allProducts.length; i++){
            if(allProducts[i].getShortName().equals(choice)){
                return allProducts[i];
            }
        }
        System.out.println("Product not found");
        return null;
    }

    static boolean checkout(Cart cart){
        Scanner scn = new Scanner(System.in);
        if(cart.isEmpty()){
            return false;
        }

        int total = cart.getTotal();
        System.out.println("Pay in Cash");

        int paid = scn.nextInt();


        if(paid>=total){
            System.out.println("Change " + (paid - total));
            System.out.println("Thank you for shopping!");
            return true;
        }

        else{
            System.out.println("Not enough cash!");
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        char action;
        Cart cart = new Cart();

        while(true){
            System.out.println("Select an action -  (a)dd item, (v)iew cart, (c)heckout");
            action = scn.nextLine().charAt(0);

            if(action=='a'){
                //Todo: Add to Cart
                // View All Products + Choose Product + Add to the Cart
                Product product = chooseProduct();
                if(product!=null){
                    System.out.println("Added to the cart " + product.getDisplayName());
                    cart.addProduct(product);
                }

            }
            else if(action=='v'){
                // View the Cart
                System.out.println("---------------------");
                System.out.println(cart.viewCart());
                System.out.println("---------------------");
            }
            else{
                // Checkout
                cart.viewCart();
                if(checkout(cart)){
                    break;
                }
            }
        }

    }

}
