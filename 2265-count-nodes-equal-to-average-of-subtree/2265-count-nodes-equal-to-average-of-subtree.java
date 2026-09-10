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
    public int averageOfSubtree(TreeNode root) {
        return findsubtree(root, 0);
    }

    public int findsubtree(TreeNode root, int count){
        if(root == null) return 0;
        int sum = findsum(root);
        int nodes = findnodes(root);
        int avg = sum / nodes;
        count = count + averagenode(root, count, avg);
        int c1 = findsubtree(root.left, 0);
        int c2 = findsubtree(root.right, 0);
        return c1 + c2 + count;
    }

    public int findnodes(TreeNode root) {
        // code here
        if(root == null) return 0;
        int count = findnodes(root.left);
        int count1 = findnodes(root.right);
        return count+count1+1;
    }

    public int findsum(TreeNode root) {
        // code here
        if(root == null) return 0;
        int leftsum = findsum(root.left);
        int rightsum = findsum(root.right);
        return root.val + leftsum + rightsum;
    }

    public int averagenode(TreeNode root, int count, int avg){
        if(root == null) return 0;
        if(root.val == avg) count++;
        averagenode(root.left, count, avg);
        averagenode(root.right, count, avg);
        return count;
    }
}