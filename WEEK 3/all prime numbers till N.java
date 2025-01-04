import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=2; i<=n; i++){
            int flag=1;
            for(int x=2; x<=Math.sqrt(i); x++){
                if(i%x==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.print(i+" ");
            }
        }
    }
}
