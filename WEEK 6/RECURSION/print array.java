// print array elements
class Main {
    static void printArray(int n,int a[],int i){
        if(i>=n){
            return ;
        }else{
            System.out.print(a[i]+" ");
            printArray(n,a,i+1);
         }
    }
    public static void main(String[] args) {
        int a []={45,87,40,33,27};
        Main.printArray(5,a,0);
    }
}
