package Question_2;

public class ArrayMAin2 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,1,2,3,1,1};

        ArraySearch obj = new ArraySearch(arr);

        System.out.println(obj.elementCount(1));
    }
}
