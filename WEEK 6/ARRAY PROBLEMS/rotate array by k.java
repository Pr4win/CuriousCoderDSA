/* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Input: nums = [1,2,3,4,5,6,7], k = 3, Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4] */
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int a []={1,2,3,4,5,6,7};
        int n=a.length,k=3;
        k=k%n;
        int b []=new int[n-k];
        int j=0;
        for(int i=0; i<n-k; i++){
            b[j]=a[i];
            j++;
        }
        int h=0;
        for(int i=n-k; i<n; i++){
            a[h]=a[i];
            h++;
        }
        for(int i=0; i<b.length; i++){
            a[h]=b[i];
            h++;
        }
        System.out.println(Arrays.toString(a));
    }
}
