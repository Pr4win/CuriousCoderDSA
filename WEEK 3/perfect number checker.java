//perfect number or not?
class Main {
    public static void main(String[] args) {
        int n=28;
        int sum=1;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
              sum=sum+i;
              if(n/i!=i){
                  sum=sum+(n/i);
              }
            }
        }
         if(sum==n){
             System.out.println("IT IS A PERFECT NUMBER");
         }
        else{
            System.out.println("IT IS not A PERFECT NUMBER");
         }
}
}
