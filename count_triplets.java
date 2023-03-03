import java.util.Arrays;

public class count_triplets {
    long countTriplets(long arr[], int n,int sum){
        Arrays.sort(arr);
        int count=0;
        int i=0;
        
        
        for(i=0; i<n-2; i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(arr[i] + arr[j] + arr[k] <sum){
                    count+=k-j;
                    j++;
                }else{
                    k--;
                }
            }
        }


        // 1 3 4 5 7
        return count;
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = 12;
        long arr[] = {5, 1, 3, 4, 7};
        count_triplets a = new count_triplets();
        long ans = a.countTriplets(arr,n,sum);
        System.out.println(ans);
    }
}
