class SLarge {
    public static int lar(List<Integer> arr){
        int l=arr.get(0);
        int sec=-1;
        for (int i=1;i<arr.size();i++){
            if(arr.get(i)>l){
                sec=l;
                l=arr.get(i);
            }
            else if(arr.get(i)<l && arr.get(i)>sec){
                sec=arr.get(i);
            }
        }
        return sec;
    }
    public int print2largest(List<Integer> arr) {
        return lar(arr);
    }
}