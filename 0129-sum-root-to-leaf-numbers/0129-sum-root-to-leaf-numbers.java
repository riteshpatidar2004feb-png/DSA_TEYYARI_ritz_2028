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
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }
    public int sum(TreeNode root, int sum){
        if(root == null) return sum;
        int s1 = 0, s2 = 0;
        if(root.left != null || root.right == null) s1 = sum(root.left, sum * 10 + root.val);
        if(root.left == null || root.right != null) s2 = sum(root.right, sum * 10 + root.val);
        if(root.left == null && root.right == null) return s1;
        return s1 + s2;
    }
}