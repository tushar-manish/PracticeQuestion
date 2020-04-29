package Question_2;

public class ArraySearch {

    int arr[];

    public ArraySearch(int[] arr) {
        this.arr = arr;
    }

    public int elementCount(int x){

        int count = 0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
}
