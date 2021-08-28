package OOPS;

public class Product {



        private int id;
        private  String name;
        private int mrp;
        private int selling_price;

        //Constructor
        public Product(){
            System.out.println("Inside Constructor");
        }
        //Parameterised Constructor
        public Product(int id,String n,int mrp,int selling_price){
            this.id = id;
            this.mrp = mrp;
            this.selling_price = selling_price;
            name=n;
        }

        public Product(Product X){
            //Create to the copy
            id = X.id;
            name = X.name; //Array
            mrp = X.mrp;
            selling_price = X.selling_price;
        }

        //Setters
        public void setMrp(int price){
            if(price>0){
                mrp = price;
            }

        }
        public void setSellingPrice(int price){
            //additional checks
            if(price>mrp){
                selling_price = mrp;
            }
            else{
                selling_price = price;
            }
        }
        //Getters
        public int getMrp(){
            return mrp;
        }
        public int getSellingPrice(){
            return selling_price;
        }

        public void showDetails(){
            System.out.println("Name: " + name);
            System.out.println("Id: " + id);
            System.out.println("Selling Price: " + selling_price);
            System.out.println("MRP: " + mrp);
            System.out.println("---------------------------------");

        }

    public static void main(String[] args) {


        Product camera = new Product(101,"GoProHero9",28000,26000);
        //camera.showDetails();

        //Copy is made using a special constructor . Copy Constructor
        Product webcam = new Product(camera);

        //In C++, this work same a copy constructor but in Java, This will give the reference to the same object.
        Product handyCam = camera; //
        handyCam.setMrp(1000);

        camera.showDetails();
        webcam.showDetails();
        handyCam.showDetails();




    }
}
