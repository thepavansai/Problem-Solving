import java.util.* ;
import java.io.*; 
public class Solution {
	public static void changeCase (StringBuffer str) {
		// Write your code here.
		//System.out.println((int)'a');
		for(int i=0;i<str.length();i++){
			if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90 ){
				int x=(int)str.charAt(i)+32;
				str.setCharAt(i, (char)x); 
			}
			else{
				int x=(int)str.charAt(i)-32;
				str.setCharAt(i, (char)x); 
			}
		}
	}
}