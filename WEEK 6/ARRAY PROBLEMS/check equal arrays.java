/* Given two arrays a[] and b[] of equal size, the task is to find whether the elements in the arrays are equal.
Input1: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]  Output: true
Explanation: Both the array can be rearranged to [0,1,2,4,5]
Input2: a[] = [1, 2, 5], b[] = [2, 4, 15]  Output: false
Explanation: a[] and b[] have only one common value.   */
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int a []={1,2,4,5,0};
        int b []={0,2,5,4,1};
         if(a.length!=b.length){
            System.out.print("FALSE");
        }else{
            Arrays.sort(a);
            Arrays.sort(b);
            int x=-1;
            for(int i=0; i<a.length; i++){
                if(a[i]!=b[i]){
                    x=i;
                    break;
                }
            }
            if(x==-1){
                System.out.print("TRUE");
            }else{
                System.out.print("FALSE");
            }
        }
    }
}
