package ShoppingCart;

import java.util.HashMap;
import java.util.Map;



    class Product{
        int id;
        String name;
        int price;


        public Product(){

        }
        public Product(int u_id, String name,int price){
            id = u_id;
            this.name = name;
            this.price = price;
        }
        String getDisplayName(){
            return name + " : Rs " + (price) + "\n";
        }
        String getShortName(){
            return name.substring(0,1);
        }

//        friend class Item;
//        friend class Cart;
    }

    class Item{
        Product product;
        int quantity;


        //Constructor using a Init List
        public Item(){}
        public Item(Product p, int q){
            this.product = p;
            this.quantity = q;
        }

        int getItemPrice(){
            return quantity * product.price;
        }

        String getItemInfo(){
            return (quantity) + " x " + product.name + " Rs. " + (quantity * product.price) + "\n";
        }

//        friend class Cart;
    };


    class Cart{
        HashMap<Integer,Item> items = new HashMap<>();

        void addProduct(Product product){
            if(!items.containsKey(product.id)){
                Item newItem = new Item(product,1);
                items.put(product.id, newItem);
            }
            else{
                items.get(product.id).quantity += 1;
            }
        }

        int getTotal(){
            //Todo
            int total = 0;
            for(Map.Entry<Integer, Item> itemPair : items.entrySet()){
                Item item = itemPair.getValue();
                total += item.getItemPrice();
            }
            return total;

        }

        String viewCart(){
            if(items.isEmpty()){
                return "Cart is empty";
            }

            String itemizedList = "";
            int cart_total = getTotal();

            for(Map.Entry<Integer, Item> itemPair : items.entrySet()){
                Item item = itemPair.getValue();
                itemizedList += (item.getItemInfo());
            }

            return itemizedList + "\n Total Amount : Rs. " + (cart_total) + '\n';
        }
        //later on
        boolean isEmpty(){
            return items.isEmpty();
        }

    }

