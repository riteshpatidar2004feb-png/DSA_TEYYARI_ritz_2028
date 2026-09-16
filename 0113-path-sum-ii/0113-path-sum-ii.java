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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> pathsum = new ArrayList<>();
        targetsum(root, pathsum, 0, targetSum, new ArrayList<Integer>(), false);
        return pathsum;
    }

    public boolean targetsum(TreeNode root, List<List<Integer>> pathsum, int sum, int target, ArrayList<Integer> list, boolean hai){
        if(root == null) return false;
        else if(root.left == null && root.right == null){
            sum += root.val;
            if(sum != target){
                list.clear();
                return false;
            }
            else{
                list.add(root.val);
                pathsum.add(list);
                return true;
            }
        }
        sum += root.val;
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        list1.addAll(list);
        list1.add(root.val);
        list2.addAll(list);
        list2.add(root.val);
        boolean sum1 = targetsum(root.left, pathsum, sum, target, list1, false);
        boolean sum2 = targetsum(root.right, pathsum, sum, target, list2, false);
        

        return sum1 || sum2;
    }
}
















