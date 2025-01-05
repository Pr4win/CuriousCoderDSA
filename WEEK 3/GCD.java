class Main {
    public static void main(String[] args) {
        int a=42, b=108, min=0;
        if(a<b){
            min=a;
        }
        else{
            min=b;
        }
        int gcd=1;
        for(int i=1; i<=min; i++){
             if(a%i==0 && b%i==0){
                 gcd=i;
                 }
             }
        System.out.println(gcd);
    }
}
