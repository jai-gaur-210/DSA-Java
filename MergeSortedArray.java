import java.util.Arrays;

public class MergeSortedArray {
    public void merge(long arr1[], long arr2[], int n, int m) 
    {
        int a1=n-1;
        int a2=0;
        while(a1>=0 && a2<m){
            if(arr1[a1]>arr2[a2]){
                long x=arr2[a2];
                arr2[a2]=arr1[a1];
                arr1[a1]=x;
                a1--;
                a2++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    
    public static void main(String[] args) {
        int n=4;
        int m=5;
        long arr1[] = {1,3,5,7};
        long arr2[] = {0,2,6,8,9};
        MergeSortedArray a = new MergeSortedArray();
        a.merge(arr1, arr2, n, m);

    }
}
