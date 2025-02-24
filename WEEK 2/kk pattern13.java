//kunal kushwaha(pattern 13)
class Main {
    public static void main(String[] args) {
        int n=5;
        //first line
        for(int i=1; i<=1; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //middle part
        for(int i=1; i<=n-2; i++){
            for(int j=1; j<=n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=i+(i-1); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //last line
        for(int i=1; i<=1; i++){
            for(int j=1; j<=n+(n-1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
