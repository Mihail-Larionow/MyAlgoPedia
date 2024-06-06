package challenges

import data_structures.TreeNode

class BinaryTreeHasSum {

    fun solve(root: TreeNode?, targetSum: Int): Boolean {
        return helper(root = root, currentSum = 0, targetSum = targetSum)
    }

    private fun helper(root: TreeNode?, currentSum: Int, targetSum: Int): Boolean {
        if(root == null) return false
        if(root.left == null && root.right == null) return currentSum + root.`val` == targetSum

        return helper(root = root.left, currentSum = currentSum + root.`val`, targetSum = targetSum) ||
                helper(root = root.right, currentSum = currentSum + root.`val`, targetSum = targetSum)
    }
}