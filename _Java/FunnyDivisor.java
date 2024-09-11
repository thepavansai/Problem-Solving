import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class FunnyDivisors  {

	public static int findSum(int n, ArrayList<Integer> arr) {
		int x=0;
		// Write your code here
		for(int i: arr){
			if(i%2==0 || i%3==0){
				x+=i;
			}
		}
		return x;

	}
}
