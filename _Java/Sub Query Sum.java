/*
Problem statement

You have given a 2-dimensional array ‘ARR’ with ‘N’ rows and ‘M’ columns. The queries are given in a 2-dimensional array ‘Queries’ of size ‘K’, in which Queries[i] contains four integers denoting the left top and right bottom indices of the submatrix whose sum we need to find. Your task is to find the sum of the submatrix for each query given in the array ‘Queries’.

For example:

Consider ARR = [[1 , 2 , 3] , [3 , 4 , 1] , [2 , 1 , 2]] and Queries = [[0 , 0 , 1 , 2]], the submatrix with the left top index (0 , 0) and right bottom index (1 , 2) is  
                      [[1 , 2 , 3] , 
                       [3 , 4 , 1]]. 
The sum of the submatrix is 14. Hence, the answer is 14 in this case.


*/

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> findSubmatrixSum(ArrayList<ArrayList<Integer>> arr, ArrayList<ArrayList<Integer>> queries) {
		int n= arr.size();
		int m=arr.get(0).size();
		// Write your code here
		long [][] psum=new long[n+1][m+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				psum[i][j]=arr.get(i-1).get(j-1)+psum[i-1][j]+psum[i][j-1]-psum[i-1][j-1];
			}
		}
		ArrayList<Integer> res=new ArrayList<>();
		for(ArrayList<Integer> q:queries){
			int ri=q.get(0);
			int ci=q.get(1);
			int rs=q.get(2);
			int cs=q.get(3);
			long sum = psum[rs+1][cs+1];
			if(ri>0){
				sum=sum-psum[ri][cs+1];
			}
			if(ci>0){
				sum=sum-psum[rs+1][ci];
			}
			if(ci>0 && ri>0 ){
				sum=sum+psum[ri][ci];
			}
			res.add((int)sum);
		}		
		return res;
	}
}
