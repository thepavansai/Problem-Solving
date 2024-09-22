//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        Stack<String> st= new Stack<String>();
        String s="";
        String temp="";
        
        for(int i=0;i<str.length();i++){
            //
            if(str.charAt(i)=='.'){
                st.push(temp);
                temp="";
            }
            else{
                temp=temp+str.charAt(i);
            }
        }
        s=s+temp;
        while(!st.empty()){
            s=s+'.'+(String)st.pop();
        }
     return s ;   
    }
}

/*Using inbuilt functions
String [] s=str.split("\\.");
Collections.reverse(Arrays.asList(s));
return String.join(".",s);
 
*/