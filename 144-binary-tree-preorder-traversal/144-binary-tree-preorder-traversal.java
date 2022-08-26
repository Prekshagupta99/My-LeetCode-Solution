class Solution {
    void method(List<Integer>list,TreeNode root){
        if(root==null)
            return;
        list.add(root.val);
        method(list,root.left);
        method(list,root.right);
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        method(list,root);
        return list;
    }
}