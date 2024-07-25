
class ArrtoBST {
    public Node sortedArrayToBST(int[] nums) {
        // Code here
        int l=nums.length-1;
        int f=0;
        return tree(nums,f,l);
    }
    private Node tree(int[] nums,int f,int l){
        if(f>l){
            return null;
        }
        int m=l+f;
        m=m/2;
        Node root= new Node(nums[m]);
        root.left=tree(nums,f,m-1);
        root.right=tree(nums,m+1,l);
        return root;
    }
}