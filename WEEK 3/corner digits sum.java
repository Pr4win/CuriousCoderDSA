//first and last digit sum(problem)
class Main {
    public static void main(String[] args) {
        int n=9808;
        if(n<=9){
            System.out.println(n);
        }
        else{
            int ld=n%10;
            while(n>0){
                int fd=n%10;
                n=n/10;
                if(n==0){
                    System.out.println(fd+ld);
                }
            }
        }
    }
}
