//kth digit of a number-power & traverse
/* Given two numbers A and B, find Kth digit from right of AB
   Input: A = 3,B = 3,K = 1
   Output: 7
   Explanation: 3^3 = 27 and 1st digit from right is 7   */
class Main{
    public static void main(String[]args){
        int A = 5;
        int B = 3;
        long power=(long)Math.pow(A,B);
        int K = 2;
        int i = 1;
        while(power>0){
            long ans=power%10;
            if(K==i){
                System.out.println(ans);
            }
            i++;
            power=power/10;
        }
    }
}
