import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Time COmplexity -> O(N)
Space COmplexity -> O(N)
*/
class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> ans = new ArrayList<>();
            for (int i=0; i<size; i++) {
                TreeNode curr = q.poll();
                ans.add(curr.val);
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        result.add(ans);
        }
        return result;
    }
}