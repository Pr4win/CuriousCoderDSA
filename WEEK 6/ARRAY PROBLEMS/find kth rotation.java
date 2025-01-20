/*Given an increasing sorted rotated array arr of distinct integers. The array is right-rotated k times. Find the value of k.
Input: arr = [5, 1, 2, 3, 4] , Output: 1
Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3 4 5. We can see that the array was rotated 1 times to the right.        */
class Main {
    public static void main(String[] args) {
        int a []={4,5,1,2,3};
        int x=-1;
        for(int i=0; i<a.length-1; i++){
            if(a[i]>a[i+1]){
                x=i;
                break;
            }
        }
        if(x!=-1){
            x=x+1;
        }else{
            x=0;
        }
        System.out.println("number of rotations");
        System.out.print(x);
    }
}
