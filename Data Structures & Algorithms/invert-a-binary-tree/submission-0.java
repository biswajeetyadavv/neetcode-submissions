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

class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode curr = new TreeNode();

        curr = root;
        dfs(curr);
        return root;
        
    }
    public void dfs(TreeNode root){
        if(root == null){
            return;
        }

        dfs(root.left);
        dfs(root.right);

        TreeNode node = new TreeNode();
        node = root.left;
        root.left = root.right;
        root.right = node;
    }
}
