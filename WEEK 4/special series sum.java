//Special Series Sum
/* Given the value of n, we need to find the sum of the series
where i-th term is sum of first i natural numbers.
NOTE: Sum of the series 1 + (1+2) + (1+2+3) + (1+2+3+4) + ……+ (1+2+3+4+…+n)
Input: n = 5,Output: 35 
Explanation: 1 + (1+2) + (1+2+3).. = 35
Hence sum of the series is 35.   */
import java.util.Scanner;
class Main{
    public static void main(String[] args){
          System.out.println("ENTER N"); 
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int sum=0,seriesTerm=0;
          for(int i=1;i<=n;i++){
            sum=sum+i;
            seriesTerm=seriesTerm+sum;
          }
          System.out.println(seriesTerm);    
    }
}
