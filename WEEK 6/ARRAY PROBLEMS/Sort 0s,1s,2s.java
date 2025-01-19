// DUTCH NATIONAL FLAG ALGORITHM to sort 0s,1s,2s.
class Main {
    public static void main(String[] args) {
        int arr []={0,1,2,1,2,2,1,0,1,2,0,1,0};
        dutchSort(arr,0,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void dutchSort(int[] arr,int left,int mid,int right){
        while(mid<=right){
            if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==0){
                swap(arr,left,mid);
                left++;
                mid++;
            }else{
                swap(arr,mid,right);
                right--;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
