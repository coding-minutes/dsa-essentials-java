package hashtable;

public class TestHashtable {


    public static void main(String[] args) {


        HashTable<Integer>  h = new HashTable<>(5);
        h.insert("Mango",100);
        h.insert("Apple",120);
        h.insert("Banana",140);
        h.insert("Orange",200);
        h.insert("Kiwi",210);
        h.insert("Papapya",220);
        h.insert("Litchi",30);
        h.print();

        String fruit = "Watermelon";

        Integer price = h.search(fruit);
        if(price!=null){
            System.out.println("Price of fruit is " + price);
        }
        else{
            System.out.println("Fruit is not present");
        }

        //Supercool functionality!
//        h["newFruit"] = 200;
//        cout<<"New fruit cost : "<<h["newFruit"]<<endl;
//        h["newFruit"] += 20;
//
//        cout<<"New fruit updated cost : "<<h["newFruit"]<<endl;
//
//
//
//
//
//
//        return 0;
    }

}
