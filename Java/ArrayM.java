

class ArrayM{
    public static String tsum(int [] a,int k){
        Arrays.sort(a);
        int l=0;
        int r=a.length-1;
        while(l<r){
            int s=a[l]+a[l+1];
            if(s==k) return "Yes";
            else if(s<k){
                l++;
            }
            else r--;
        }
        return "No";
    }
    public static void sort0(int []a){
        //int n=a.length;
        int t=0,o=0,z=0;
        for(int i:a){
            if(i==0) z++;
            else if(i==1) o++;
            else t++;
        }
        //a=null;
        for(int i=0;i<z;i++) System.out.print("0 ");
        for(int i=0;i<o;i++) System.out.print("1 ");
        for(int i=0;i<t;i++) System.out.print("2 ");

    }
    public static void main(String [] args){
    int []a={1,4,5,3,5,2,0};
    System.out.println("Output: "+tsum(a,5));
    //ArrayList<Integer> v=Lists.newArrayList(1,2,3,6,9);
    int [] p={0,1,2,0,1,2,2,2,0};
    sort0(p);
    }
}