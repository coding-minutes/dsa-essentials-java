package Heap;

import java.util.ArrayList;
import java.util.Collections;

public class heap {



        ArrayList<Integer> v = new ArrayList<>();

        void heapify(int i){

            int left = 2*i;
            int right = 2*i + 1;

            int minIdx = i;
            if(left < v.size() && v.get(left) < v.get(i)){
                minIdx = left;
            }
            if(right < v.size() && v.get(right) < v.get(minIdx)){
                minIdx = right;
            }

            if(minIdx!=i){
                Collections.swap(v, i,minIdx);
                heapify(minIdx);
            }
        }

        heap(int default_size){
            v = new ArrayList<>(default_size+1);
            v.add(-1);
        };

        void push(int data){

            //ad data to end of the heap
            v.add(data);

            int idx = v.size() - 1;
            int parent = idx/2;

            while(idx>1 && v.get(idx) < v.get(parent)){
                Collections.swap(v, idx, parent);
                idx = parent;
                parent = parent/2;
            }
        }
        //return min element
        int top(){
            return v.get(1);
        }
        //Remove min element
        void pop(){
            //1. Swap first and last element
            int idx = v.size() - 1;
            Collections.swap(v, 1,  idx);
            v.remove(v.size()-1);
            heapify(1);
        }

        boolean empty(){
            return v.size()==1;
        }

}
