package hashtable;

import java.util.ArrayList;

class Node<T>{

    public String key;
    public T value;
    public Node next;

    Node(String key, T value){
        this.key = key;
        this.value = value;
        next = null;
    }
}


public class HashTable<T>{

        ArrayList<Node<T>> table;
        int cs; //total entries that have been inserted
        int ts; // size of table

        int hashFn(String key){

            int idx = 0;
            int power = 1;

            for(int i = 0; i < key.length(); i++){
                char ch = key.charAt(i);
                idx = (idx + ch*power)%ts;
                power = (power*29)%ts;
            }
            return idx;
        }

        void rehash(){
            // Save the ptr to the oldTable and we will do insertions in the new table
            ArrayList<Node<T>> oldTable = table;
            int oldTs = ts;

            //increase the table size
            cs = 0;
            ts = 2*ts + 1;
            table = new ArrayList<>();

            for(int i=0; i<ts; i++){
                table.add(null);
            }

            //Copy elements from old table to new table
            for(int i=0; i<oldTs; i++){

                Node<T> temp = oldTable.get(i);

                while(temp!=null){
                    String key = temp.key;
                    T value = temp.value;
                    //happen in the new table
                    insert(key,value);
                    temp = temp.next;
                }

                //destroy the ith linked list
                if(oldTable.get(i)!=null){
                    oldTable.set(i, null);
                }
            }

        }

        HashTable(int default_size){
            cs = 0;
            ts = default_size;

            table = new ArrayList<>(ts);

            for(int i=0;i<ts;i++){
                table.add(null);
            }

        }
        void insert(String key, T val){
            //Next
            int idx = hashFn(key);

            Node<T> n = new Node<T>(key,val);

            //Insertion at head of the linked list
            n.next = table.get(idx);
            table.set(idx, n);

            cs++;
            float load_factor = cs/(float)(ts);
            if(load_factor > 0.7){
                rehash();
            }

        }

        T search(String key){
            int idx = hashFn(key);

            Node<T> temp = table.get(idx);

            while(temp!=null){
                if(temp.key.equals(key)){
                    return temp.value;
                }
                temp = temp.next;
            }

            return null;
        }

        //HomeWork - Code Exercise
        void erase(String key){
            //find the bucket id
            // iterate over the linked list
            // you have to do


        }


//        T get(String key){
//            //return the value
//            // if key is not found then create a new node and return
//            // return the existing node
//            T valueFound = search(key);
//            if(valueFound==null){
//                T object = null;
//                insert(key,object);
//                valueFound = search(key);
//            }
//
//            return valueFound;
//
//        }

        void print(){
            //Iterate over buckets
            for(int i=0;i<ts;i++){
                System.out.print("Bucket " + i + "->");

                Node<T> temp = table.get(i);
                while(temp!=null){
                    System.out.print(temp.key + "->");
                    temp = temp.next;

                }
                System.out.println();
            }
        }

}
