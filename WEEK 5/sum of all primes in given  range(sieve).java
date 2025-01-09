/*sum of all primes in a given range(SIEVE OF ERATOSTHENES)
  Given a range[L,R].The task is to find the sum of all the prime numbers in the given range from L to R both inclusive.
  Input: L=10 , R=20 , Output: Sum=60
  Explanation: Prime numbers between [10,20] are: 11,13,17,19
  Therefore,sum=11+13+17+19=60  */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER L");
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        System.out.println("ENTER R");
        int R=sc.nextInt();
        System.out.println("INPUT OVER");
        int a[]=new int[R];
        for(int i=2;i<=Math.sqrt(R);i++){
            if(a[i]==0){
                for(int j=i*2;j<R;j=j+i){
                    a[j]=1;
                }
            }
        }
        int sum=0;
        for(int i=L;i<R;i++){
            if(a[i]==0){
                sum=sum+i;
            }
        }
        System.out.println("Sum = "+sum);
    }
}
