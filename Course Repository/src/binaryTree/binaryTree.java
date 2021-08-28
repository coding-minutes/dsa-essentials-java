package binaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class binaryTree {


    static Scanner scanner = new Scanner(System.in);
    static class Node{


        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
            left = right = null;
        }
    };
//Preorder Build of the Tree Root, Left, Right Tree
    static Node  buildTree(){


        int d = scanner.nextInt();

        if(d==-1){
            return null;
        }

        Node  n = new Node(d);
        n.left = buildTree();
        n.right = buildTree();
        return n;
    }

    static void printPreorder(Node  root){
        if(root==null){
            return;
        }
        System.out.println(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }
    static void printInorder(Node  root){
        if(root==null){
            return;
        }
        printInorder(root.left);
        System.out.println(root.data + " ");
        printInorder(root.right);
    }

    static void postOrder(Node   root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    static void printRoot2LeafPaths(Node root, ArrayList<Integer> path){

        if(root==null){
            return;
        }

        if(root.left==null && root.right==null){
            //print the vector
            for(int node:path){
                System.out.print(node + ".");
            }
            System.out.println(root.data + ".");
            return;
        }

        //rec case
        path.add(root.data);
        printRoot2LeafPaths(root.left,path);
        printRoot2LeafPaths(root.right,path);
        //backtracking
        path.remove(path.size()-1);

    }


    public static void main(String[] args) {



        Node root = buildTree();
        printPreorder(root);
        System.out.println();

        printInorder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        ArrayList<Integer> path= new ArrayList<>();
        printRoot2LeafPaths(root,path);

    }



}
