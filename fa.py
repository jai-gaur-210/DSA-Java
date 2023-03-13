import math


class LongestRepeatingCharReplace :
    def  characterReplacement(self, s,  k) :
        c = list(s)
        l = 0
        h = 1
        n = len(c)
        max = 0
        while (h < n) :
            if (c[l] != c[h]) :
                if (k != 0) :
                    max = max(max,h - l + 1)
                    h += 1
                else :
                    l += 1
                    h = l + 1
            else :
                max = max(max,h - l + 1)
                h += 1
        return max
    @staticmethod
    def main( args) :
        s = "ABAB"
        k = 1
        a = LongestRepeatingCharReplace()
        ans = a.characterReplacement(s, k)
        print(ans)
    

if __name__=="__main__":
    LongestRepeatingCharReplace.main([])