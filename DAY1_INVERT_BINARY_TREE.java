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
class DAY1_INVERT_BINARY_TREE {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        TreeNode r = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(r);
        return root;
    }
}
