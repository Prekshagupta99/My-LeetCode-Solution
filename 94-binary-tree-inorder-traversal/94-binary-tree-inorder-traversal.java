class Solution {
    void method(List<Integer>list,TreeNode root){
        if(root==null)
            return;
        
        method(list,root.left);
        list.add(root.val);
        method(list,root.right);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        method(list,root);
        return list;
    }
}