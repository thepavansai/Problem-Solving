import java.util.Scanner;

public class YetanotherPattern {

	public static void main(String[] args)  
	{	Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
	    while(n>0){
			// Write your code 
			//Scanner sc= new Scanner(System.in);
			int x=sc.nextInt();
			for(int i=0;i<=x;i++){
				for(int j=0;j<i;j++){
					System.out.print(" ");
				}
				for(int j=x-i;j>0;j--){
					System.out.print("*");
				}
				System.out.print("\n");
			}
			n--;
		}
	}
}
