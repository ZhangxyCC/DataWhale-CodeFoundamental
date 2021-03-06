/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	while(root != null || !stack.isEmpty()) {
	    	while(root!= null) {
	    		stack.push(root);
	    		res.add(root.val);
	    		root = root.left;
	    	}
	    	TreeNode temp = stack.pop();
	    	root = temp.right;
    	}
    	return res;
    } 
    
}