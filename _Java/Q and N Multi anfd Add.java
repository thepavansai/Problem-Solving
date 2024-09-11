import java.util.* ;
import java.io.*; 
public class Solution {

	public static long sumOrProduct(int n, int q) {

		// Write your code here
		long li=1000000007;
		long l=0;
		if(q==1){
			l=n*(n+1)/2;
		}
		else{
			l=1;
			for(int i=2;i<=n;i++){
				l=l%li;
				l=l*i;
			}
		}
		return (long)l%li;
	}
}
