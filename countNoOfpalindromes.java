public class countNoOfpalindromes {
    long  mod = (long) (1e9 + 7);
    long  countPS(String str){
        
        long dp[][] = new long [str.length()][str.length()];    
        for(int g=0; g<str.length(); g++){
            int i=0; int j=g;
            while(j<str.length()){
                if(g==0){
                    dp[i][j] = 1;
                }
                else if(g==1){       
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = 3;
                    }else{
                        dp[i][j] = 2;
                    }
                }
                else{
                    if(str.charAt(i)==str.charAt(j)){
                        dp[i][j] = dp[i][j-1] + dp[i+1][j] + 1;
                    }
                    else{
                        dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1];
                    }
                dp[i][j]+=mod;
                dp[i][j]%=mod;
                }
                i++;j++;
            }    
        }
        return dp[0][str.length()-1];
    }
    public static void main(String[] args) {
        String s = "abcd";
        countNoOfpalindromes a = new countNoOfpalindromes();
        long ans = a.countPS(s);
        System.out.println(ans);
    }
}
