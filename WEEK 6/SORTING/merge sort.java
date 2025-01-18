// MERGE SORT
class Main{ 
    // Main method to test the Merge Sort
    public static void main(String[] args) {
        int a[]={38,27,43,3,9,82,10};
        System.out.println("original ARRAY");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        mergeSort(a,0,a.length-1);
        System.out.println("Sorted ARRAY");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    // Merge Sort method (recursive)
    static void mergeSort(int[] a,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            // Recursively sort the two halves
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            // Merge the sorted halves
            merge(a,low,mid,high);
        }
    }
    // Method to merge two sorted halves into one sorted array
    static void merge(int[] a,int low,int mid,int high){
        // Find sizes of two subarrays to be merged
        int n1=mid-low+1;
        int n2=high-mid;
        // Create temporary arrays
        int[] leftArray=new int[n1];
        int[] rightArray=new int[n2];
        // Copy data to temporary arrays
        for(int i=0; i<n1; i++){
            leftArray[i]=a[low+i];
        }
        for(int j=0; j<n2; j++){
            rightArray[j]=a[mid+1+j];
        }
        // Merge the temporary arrays back into the original array
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(leftArray[i]<rightArray[j]){
                a[k]=leftArray[i];
                i++;
            }else{
                a[k]=rightArray[j];
                j++;
            }
            k++;
        }
        // Copy the remaining elements of leftArray, if any
        while(i<n1){
            a[k]=leftArray[i];
            i++;
            k++;
        }
        // Copy the remaining elements of rightArray, if any
        while(j<n2){
            a[k]=rightArray[j];
            j++;
            k++;
        }
    }

}
