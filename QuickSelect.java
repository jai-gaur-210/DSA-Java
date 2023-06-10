class QucikSelect{
	
	
	public int partition( int[]arr , int low ,int high){
		int x = arr[high];
		int i =low;
		for(int j=low; j<high; j++){
			if(arr[j]<=x){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high]= temp;
		
		return i;
		
	}
	public int kthLargest(int[]arr, int low ,int high , int k){
		if (k > 0 && k <= high - low + 1){
			int n = arr.length;
			int p = partition(arr , low , high);
			if(p == n - k){
				return arr[p];
			}
			else if(p < n-k){
				return kthLargest(arr , p+1 , high,k );
			}
			else{
				return kthLargest(arr, low, p-1, k-(high-p));
			}
		}
		else{
			return -1;
		}
	}
	public static void main (String[] args){
        int arr[] = {7, 0, 25, 6, 16, 17, 0};
        QucikSelect a = new QucikSelect();
        int ans = a.kthLargest(arr , 0 ,5,2 );
        System.out.println(ans);   
    }
}


