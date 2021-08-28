package Trie;

public class TrieTest {

    public static void main(String[] args) {
        String words[] = {"hello","he","apple","aple","news"};
        Trie t = new Trie();

        for(String word:words){
            t.insert(word);
        }

        String key = "hello";
        System.out.println(t.search(key));

    }
}
