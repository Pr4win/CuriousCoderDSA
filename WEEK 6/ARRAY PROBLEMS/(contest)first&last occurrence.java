// Aloka is stuck in an island, she has a solve a problem to get out of the island. You are given n numbers in sorted order, you need to find the first and last occurrence of the number x and print them. If occurrence of a number is not found, then print -1.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n=6;
        int a []={2,3,4,4,5,6};
        int x=4;
        for(int i=0; i<n; i++){
            if(a[i]==x){
                System.out.println(i);
                break;
            }
        }
        int j=-1;
        for(int i=0; i<n; i++){
            if(a[i]==x){
                j=i;
            }
        }
        System.out.println(j);  
    }
}
