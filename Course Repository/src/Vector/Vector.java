package Vector;

public class Vector<T> {


        //Data Members
        T[] arr;
        int cs;
        int ms;


        Vector(int max_size){
            cs = 0;
            ms = max_size;
            arr = (T[]) new Object[ms];
        }

        void push_back(final T d){
            //Two Cases
            if(cs==ms){
                //create a new array and delete the old one, double the capacity 
                T[] oldArr = arr;
                ms = 2*ms;
                arr = (T[]) new Object[ms];
                //copy the elements
                for(int i=0;i<cs;i++){
                    arr[i] = oldArr[i];
                }
                //delete 

            }
            arr[cs] = d;
            cs++;
        }

        void pop_back(){
            if(cs>=0){
                cs--;
            }
        }

        boolean isEmpty(){
            return cs==0;
        }

        //Front, Back, At(i), []
        T front() {
            return arr[0];
        }

        T back() {
            return arr[cs-1];
        }

        T at(int i) {
            return arr[i];
        }

        int size() {
            return cs;
        }

        int capacity() {
            return ms;
        }

        T get(int i){
            return arr[i];
        }

}
