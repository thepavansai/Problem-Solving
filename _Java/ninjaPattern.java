import java.util.* ;
import java.io.*; 
public class Solution {

	public static void ninjaPattern(int n) {

		// Write your code here.
		int size= 2*n-1;
		int c= size;
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(i==j || j==c-i-1){
					if(i<n){
						System.out.print(i+1);
					}
					else{
						System.out.print(c-i);
					}
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}
}