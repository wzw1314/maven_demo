package demo;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(test(s));
    }

    public static int test(String s){
        char[] chars = s.toCharArray();
        int ans=0;
        int cL=0,cR=0;
        for(char c:chars)
        {
            if(c=='L')
            {
                cL++;
            }
            else
            {
                cR++;
            }
            if(cL==cR)
            {
                ans++;
            }
        }
        return ans;
    }
}
