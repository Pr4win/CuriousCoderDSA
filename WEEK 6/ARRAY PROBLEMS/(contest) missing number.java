/*  You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n, in sorted order. Since there are only n-1 numbers in array, there is one number missing from 1 to n. 
Input Format: n = 5 arr[] = [1, 2, 3, 5]  Output: 4   */
class Main {
    static int missing(int n,int[] arr){
        if(arr[0]!=1){
            return 1;
        }else if(arr[n-2]!=n){
            return n;
        }
        for(int i=0; i<n-2; i++){
            if(arr[i+1]-arr[i]!=1){
                return arr[i]+1;
            }
        }
       return -1; 
    }
    public static void main(String[] args) {
       int n=5;
       int arr []={1,2,3,5};
       int ans=missing(n,arr);
       System.out.print(ans);
    }
}
