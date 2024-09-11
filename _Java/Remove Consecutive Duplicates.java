
public class Solution {
	public static String removeConsecutiveDuplicates(String s) {

		// Write your code here
		String res="";
		//res=res+s.charAt(0);
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)!=s.charAt(i+1)){
				res=res+s.charAt(i);
			}
		}
		
		return res+s.charAt(s.length()-1);
	}

}
