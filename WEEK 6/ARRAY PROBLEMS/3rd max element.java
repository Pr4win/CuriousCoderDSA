/*   Given an array, arr of positive integers. Find the third largest element in it. Return -1 if the third largest element is not found
Input1: arr[] = [2, 4, 1, 3, 5] Output: 3 
Input2: arr[] = [10, 2] Output: -1
Input3: arr[] = [5, 5, 5] Output: 5        */
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        System.out.println("third largest element");
        int arr []={2,4,1,3,5};
        Arrays.sort(arr);
        if(arr.length<3){
            System.out.println(-1);
        }else{
            System.out.println(arr[arr.length-3]);
        }
    }
}
