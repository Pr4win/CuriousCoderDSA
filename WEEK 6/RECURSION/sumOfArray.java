// sum of array
class Main {
    static int sumOfArray(int n,int a[],int i){
        if(i>=n){
            return 0;
        }else{
            return a[i]+sumOfArray(n,a,i+1);
         }
    }
    public static void main(String[] args) {
        int a []={45,87,40,33,27};
        System.out.print(sumOfArray(5,a,0));
    }
}
