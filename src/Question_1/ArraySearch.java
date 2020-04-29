package Question_1;

import java.util.HashSet;
import java.util.Set;

public class ArraySearch {
    int arr[];

    public ArraySearch(int arr[]){
        this.arr = arr;
    }

    public void printDuplicate(){

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length;i++){
            if(set.add(arr[i])==false){
                System.out.println(arr[i]);
            }
        }
    }

}
