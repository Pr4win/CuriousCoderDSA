//week3 last digit & divisibility(video 1)
class Main {
    public static void main(String[] args) {
       int A=74356;
        while(A>0){ 
          int ld= A%10;
          System.out.println(ld);
          A=A/10;
        }
    }
}
