package Trie;

import java.util.HashMap;

class Node{
    char data;
    HashMap<Character,Node> m;
    boolean isTerminal;


    Node(char d){
        m = new HashMap<>();
        data = d;
        isTerminal = false;
    }

//        friend class Trie;
};


public class Trie {


        Node root;

        Trie(){
            root = new Node('\0');
        }
        //Insertion
        void insert(String word){
            Node temp = root;

            for(int i = 0; i < word.length(); i++){
                char ch = word.charAt(i);
                if(!temp.m.containsKey(ch)){
                    Node n = new Node(ch);
                    temp.m.put(ch, n);
                }
                temp = temp.m.get(ch);
            }
            temp.isTerminal = true;
        }
        //Searching

        boolean search(String word){

            Node temp = root;
            for(int i = 0; i < word.length(); i++){
                char ch = word.charAt(i);
                if(!temp.m.containsKey(ch)){
                    return false;
                }
                temp = temp.m.get(ch);
            }
            return temp.isTerminal;
        }



}
