/*  You are given an array arr[] of non-negative integers. Your task
is to move all the zeros in the array to the right end while
maintaining the relative order of the non-zero elements. The
operation must be performed in place, meaning you should not use
extra space for another array.
Input 1: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0] 
Input 2: arr[] = [10, 20, 30]  Output: [10, 20, 30]
Input 3: arr[] = [0, 0]  Output: [0, 0]       */
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int a []={1,2,0,4,3,0,5,0};
        int n=a.length;
        int j=0;
        for(int i=0; i<n; i++){
            if(a[i]!=0){
                a[j]=a[i];
                j++;
            }
        }
        for(int i=j; i<n; i++){
            a[i]=0;
        }
        System.out.print(Arrays.toString(a));
    }
}
