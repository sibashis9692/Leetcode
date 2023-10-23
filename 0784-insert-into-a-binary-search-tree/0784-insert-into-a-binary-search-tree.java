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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode newNode = new TreeNode(val);
            return newNode;
        }
        TreeNode ptr = null;
        TreeNode brother_of_root = root;
        while(brother_of_root != null){
            ptr = brother_of_root;

            if(brother_of_root.val > val){
                brother_of_root = brother_of_root.left;
            }

            else{
                brother_of_root = brother_of_root.right;
            }
        }

        TreeNode newNode = new TreeNode(val);

        if(ptr.val > val){
            ptr.left = newNode;
        }
        else{
            ptr.right = newNode;
        }

        return root;
    }
}