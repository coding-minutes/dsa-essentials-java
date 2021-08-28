package Trie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class findPrefixStrings {

    static class node{

        char ch;
        HashMap<Character,node> next;
        boolean isTerminal;
        node(char a){
            ch=a;
            next = new HashMap<>();
            isTerminal=false;
        }
    }

    static class Trie{
        node root= new node('\0');

        void insert(String str){
            node temp=root;
            for(int i=0; i<str.length(); i++){
                if(!temp.next.containsKey(str.charAt(i))){
                    temp.next.put(str.charAt(i),new node(str.charAt(i)));
                }
                temp=temp.next.get(str.charAt(i));
            }
            temp.isTerminal=true;
        }


        void dfs(node temp, ArrayList<String> v, StringBuilder word ){
            if(temp.isTerminal){
                v.add(word.toString());
            }
            if(temp.next.isEmpty()){
                return;
            }
            for(Map.Entry<Character, node> p:temp.next.entrySet()){
                word.append(p.getKey());
                dfs(temp.next.get(p.getKey()),v,word);
                word.deleteCharAt(word.length()-1);
            }
            return;
        }



        ArrayList<String> find(String str){
            ArrayList<String> v = new ArrayList<>();
            node temp=root;
            StringBuilder word= new StringBuilder("");
            for(int i=0; i<str.length(); i++){
                if(!temp.next.containsKey(str.charAt(i))){
                    return v;
                }
                word.append(str.charAt(i));
                temp=temp.next.get(str.charAt(i));
            }

            dfs(temp,v,word);
            Collections.sort(v);
            return v;
        }




    };



    static ArrayList<String> findPrefixStrings(ArrayList<String> words, String prefix){

        Trie t = new Trie();
        for(String s:words){
            t.insert(s);
        }
        return t.find(prefix);
    }



}
