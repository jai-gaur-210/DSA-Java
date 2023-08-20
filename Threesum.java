import java.util.*;

class Threesum{
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public void twoSum( int i, int j, int[]nums , int t){
        int a= nums[i-1];
        while(i<j){
            if(nums[i]+nums[j]<t){
                i++;
            }
            else if(nums[i]+nums[j]>t){
                j--;
            }
            else{
                List<Integer> lst = new ArrayList<Integer>();
                lst.add(a); lst.add(nums[i]); lst.add(nums[j]);
                ans.add(lst);

                while(i<j && nums[i] == nums[i+1]) {i++;}
                while(i<j && nums[j] == nums[j-1]) {j--;}
                i++;
                j--;
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i==0 || nums[i-1]!=nums[i]){
                twoSum(i+1 , nums.length-1, nums , 0-nums[i]);
            }
            
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        Threesum a = new Threesum();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans = a.threeSum(arr);
        System.out.println(ans);
    }
}