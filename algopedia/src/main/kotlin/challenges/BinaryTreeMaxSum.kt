package challenges

import data_structures.TreeNode
import kotlin.math.max

class BinaryTreeMaxSum {

    private var res = Int.MIN_VALUE

    fun solve(root: TreeNode?): Int {

        helper(root = root)
        return res
    }

    private fun helper(root: TreeNode?): Int {

        if(root == null) return 0

        val leftSum = max(helper(root.left), 0)
        val rightSum = max(helper(root.right), 0)

        res = max(res, leftSum + rightSum + root.`val`)

        return max(leftSum, rightSum) + root.`val`
    }

}