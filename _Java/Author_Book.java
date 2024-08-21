/*
 Problem statement

You are given a certain format of books and their authors.

For example -

NameOfAuthor1 Book1 Book2

NameOfAuthor2 Book1

Your task is to print the given information in the following manner:

1. NameOfAuthor1

    A. Book1

    B. Book2

2. NameOfAuthor2

    A. Book1

You are given a 2D array of strings ‘S’ where each vector is the information about the i-th author, the first index of this vector is the ‘NameOfAuthor’ and the other indexes are the ‘Books’ written by the author. You are supposed to print the Authors and their books in the above mentioned format.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :

2
2
4 ChetanBhagat TwoStates Revolution HalfGirlfriend OneIndianGirl
2 JKRowling HarryPotter FantasticBeasts
1
2 JeffreyArcher OldLove FalseImpression

Sample Output 1 :

1. ChetanBhagat
    A. TwoStates
    B. Revolution
    C. HalfGirlfriend
    D. OneIndianGirl 
2. JKRowling
    A. HarryPotter
    B. FantasticBeasts
1. JeffreyArcher
    A. OldLove 
    B. FalseImpression

Explanation for Sample Input 1 :

For, the first test case, the expected array to be returned is,
[“1. ChetanBhagat”, “B. Revolution”, “C. HalfGirlfriend”, “D. OneIndianGirl”,  “ 2. JKRowling
“, “A. HarryPotter”, “B. FantasticBeasts”]
For, the second test case the expected array to be returned is,
[“1. JeffreyArcher”, “A. OldLove”, “B. FalseImpression”].

Sample Input 2 :

2
1
2 RoaldDahl LambToTheSlaughter TheWitches
1
1 JhumpaLahiri ARealDurwan

Sample Output 2 :

1. RoaldDahl
    A. LambToTheSlaughter
    B. TheWitches
1. JhumpaLahiri
    A. ARealDurwan

*/
import java.util.* ;
import java.io.*; 
public class Solution {
    public static String[] arrangeAuthors(String[][] S) {
        // Write your code here
        List<String> ans= new ArrayList<>();
        int ni=S.length;
        for(int i=0;i<ni ;i++){
            String n=Integer.toString(i+1);
            n=n+". ";
            n=n+S[i][0];
            ans.add(n);
            int m=S[i].length;
            char x='A';
            for(int j=1;j<m;j++){
                String b="";
                b=b+Character.toString(x);
                b=b+". ";
                b=b+S[i][j];
                ans.add(b);
                x++;
            }
           
        }String[] si= new String[ans.size()];
            si=ans.toArray(si);
            return si;
        
    }
}
