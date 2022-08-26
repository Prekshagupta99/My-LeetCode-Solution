class Solution {
    void method(List<Integer>list,TreeNode root){
        if(root==null)
            return;
        method(list,root.left);
        method(list,root.right);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        method(list,root);
        return list;
    }
}