//Number of divisors divisible by 3
/*  Input : 6 , Output: 2
Explanation: 1, 2, 3, 6 are divisors of 6 out of which 3 and 6 are divisible by 3.  */
class Main {
    public static void main(String[] args) {
        int N=6;
        int count=0;
        for(int i=1; i<=Math.sqrt(N); i++){
             int k=N/i;
             if(N%i==0){
                 if(i%3==0){
                     count++;
                 }
                 if(k%3==0 && k!=i){
                     count++;
                 }
             }
        }
        System.out.println(count);
    }
}
