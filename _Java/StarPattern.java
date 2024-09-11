import java.util.* ;
import java.io.*; 
public class Solution {
	public static void StarPattern(int n){
		// Write your code here.
		int sz=2*n-1;
		for(int i=0;i<n;i++){
			for(int j=0;j<sz/2-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*");
			}
			for(int j=sz/2 -i;j>0;j--){
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
