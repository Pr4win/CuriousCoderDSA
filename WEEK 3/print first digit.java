//print first digit ofthe number and count the n value
class Main {
    public static void main(String[] args) {
        int n=123456, count=0;
        while(n>0){
            int fd=n%10;
            count=count+1;
            n=n/10;
            if(n==0){
            System.out.println(fd);
            }
        }
         System.out.println(count); 
    }
}
