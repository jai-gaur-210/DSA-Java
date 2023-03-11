
import java.util.*;


public class extraaaaa {
    public List<List<String>> groupAnagram(String[] strs) {
       
        List<List<String>> alist = new ArrayList<>();
        if(strs.length==0 || strs==null ){
            return alist;
        }
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] as=s.toCharArray(); 
            Arrays.sort(as);
            String sd=new String(as);
            if( !map.containsKey(sd)){ 
                map.put(sd,new ArrayList<String>());
            }
            map.get(sd).add(s);
        }
    return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String arr[] = {"eat","tea","tan","ate","nat","bat"};
        extraaaaa a = new extraaaaa();
        List<List<String>> lst = a.groupAnagram(arr);
        System.out.println(lst);
    }
}
