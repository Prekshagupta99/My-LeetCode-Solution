/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public int minDepth(TreeNode root) {
//         if(root == null){
//             return 0;
//         }
//         if(root.left == null && root.right == null)
//         int ldepth = minDepth(root.left);
//         int rdepth = minDepth(root.right);
//         return Math.min(ldepth,rdepth) +1;
//     }
// }

class Solution {
    
    public int minDepth(TreeNode node) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 1;
        
        int min = Integer.MAX_VALUE;
        if(node.left!=null)    
            min = minDepth(node.left);
        if(node.right!=null)    
            min = Math.min(minDepth(node.right), min);
        
        return min+1;
    }
}