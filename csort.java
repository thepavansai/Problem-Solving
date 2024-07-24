import java.util.*;
class csort{
    public static boolean sort(int[] ar){
        boolean x=true;
        for(int i=01;i<ar.length;i++){
            if(ar[i-1]>ar[i]){
                x=false;
            }
        }
        return x;
    }
    public int rd(int[] nums) {
        if(nums.length==0) return 0;
        int i=0;
        for(int y=0;y<nums.length;y++){
            if(nums[i]!=nums[y]){
                i++;
                nums[i]=nums[y];
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the size:");
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements:");
            arr[i]=sc.nextInt();
        }
        boolean x=sort(arr);
        System.out.println("Sorted: "+x+"\n size after removing Duplicates"+rd(arr));
    }
}