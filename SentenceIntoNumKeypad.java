public class SentenceIntoNumKeypad {
    String printSequence(String s) {
        String str[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555",
                "6", "66", "666", "7", "77", "777",
                "7777", "8", "88", "888", "9", "99",
                "999", "9999" };
        String ans ="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)== ' '){
                ans+="0";
            }
            else{
                int ind = s.charAt(i) - 'A';
                ans+=str[ind];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "GFG";
        SentenceIntoNumKeypad a = new SentenceIntoNumKeypad();
        String ans = a.printSequence(s);
        System.out.println(ans);
    }
}
