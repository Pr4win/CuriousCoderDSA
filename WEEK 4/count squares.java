//Consider a sample space consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number n, you have to find the number of integers less than n in the sample space.
/* Input: n = 9 , Output: 2
Explanation: 1 and 4 are the only Perfect Squares less than 9          So, the Output is 2.  */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long count=0;
        for(long i=1;i<=Math.sqrt(n);i++){
            long power=(long)Math.pow(i,2);
            if(power<n){
                count++;
            }
        }
        System.out.println(count);
    }
}
