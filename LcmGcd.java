//{ Driver Code Starts
import java.io.*;
import java.util.*;

class LcmGcd {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long gcd=1L;
        Long lcm=1L;
        if(A==0 || B==0){
            return new Long[]{A,B};
        }
        Long d=Math.min(A,B);
        Long divd=Math.max(A,B);
        while(divd%d>0){
            Long t=divd;
            divd=d;
            d=t%divd;
        }
        gcd =d;
        lcm=(A*B)/gcd;
        return new Long []{lcm,gcd};
    }
};