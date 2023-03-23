import java.util.HashMap;

public class majority_element {
    public int majorityElement(int a[], int size) {
        int n= size/2;
        if(a.length==1){
          return a[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++){
          if(map.containsKey(a[i])){
            if(map.get(a[i])>=n){
              return a[i];
            }
            else{
              map.put(a[i] , map.get(a[i])+1);
            }
          }
          else{
            map.put(a[i], 1);
          }
        } 

        return -1;
    }

    public static void main(String[] args) {
        int n = 1;
        int arr[] = {15} ;
        majority_element a = new majority_element();
        int ans = a.majorityElement(arr, n);
        System.out.println(ans); 
    }

}
