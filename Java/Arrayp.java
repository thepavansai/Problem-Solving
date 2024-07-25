package Java;

import java.util.*;
class Arrayp {

    public static int fmissingnuminsortedarray(int[] a) {
        int n = a.length;
        int sum = (n * (n + 1))/2;
        int ms = 0;
        for (int i =0;i<n-1;i++) {
            ms = ms + a[i];
        }
        return sum-ms;

    }
    public static int cone(int []a){
        int res=0;
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                c=c+1;
            }
            else{
                c=0;
            }
            res=Math.max(c,res);
        }
        return res;
    }

    public static ArrayList<Integer> union(int[] x, int[] y) {
        HashSet<Integer> z = new HashSet<>();
        for (int i : x) {
            z.add(i);
        }
        for (int i : y) {
            z.add(i);
        }
        ArrayList<Integer> a = new ArrayList<>();
        for (int l : z) {
            a.add(l);
        }
        return a;
    }

    public static int lsearch(int[] a, int x) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int[] movez(int[] a) {
        int n = a.length;
        int x = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                x = i;
                break;
            }
        }
        if (x == -1) {
            return a;
        }
        for (int j = x + 1; j < n; j++) {
            if (a[j] != 0) {
                int temp = a[j];
                a[j] = a[x];
                a[x] = temp;
                x++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] v = {1, 0, 3, 6, 0, 2};
        int[] x = movez(v);
        for (int i : x) {
            System.out.print(i + " ");
        }
        int [] ti={1,2,0,2,1,1,1,0,1,1,1,1,1,7};
        System.out.println("\nNo of consecutive one's:");
        System.out.println(cone(ti));
        try {
            Scanner si = new Scanner(System.in);
            System.out.println("\nEnter the element to search in above array :");
            int f = si.nextInt();
            System.out.println("Index is : " + lsearch(x, f));
            int[] a1 = {1, 2, 3, 2, 1, 5, 6, 7};
            int[] a2 = {4, 2, 6, 8, 9, 3, 9, 2};
            System.out.println("Arrays before Union:");
            for (int i : a1) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
            for (int i : a2) {
                System.out.print(i + " ");
            }
            ArrayList<Integer> vi = union(a1, a2);
            System.out.println("\nArrays After Union:");
            for (int i : vi) {
                System.out.print(i + " ");
            }
            System.out.println("\n\nEnter arrary size:");
            int sz=si.nextInt();
            int [] pl = new int[sz];
            System.out.println("Enter arrary in Sorted with one missing one digit:");
            for(int i=0;i<sz;i++){
                pl[i]=si.nextInt();

            }
            System.out.println("Element is : "+fmissingnuminsortedarray(pl));
            si.close();

        } catch (Exception e) {
            System.out.println("Invalid Input || " + e);
        }
    }
}
