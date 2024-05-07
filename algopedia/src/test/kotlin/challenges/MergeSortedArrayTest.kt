package challenges

import data_structures.LinkedList
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class MergeSortedArrayTest {

    private val algorithm = MergeSortedArray()

    @Test
    fun `should return merged array`(){
        val arr1 = intArrayOf(1,2,3,0,0,0)
        val arr2 = intArrayOf(2,5,6)
        val m = arr1.size - arr2.size
        val n = arr2.size

        val expected = intArrayOf(1,2,2,3,5,6)

        algorithm.solve(nums1 = arr1, m = m, nums2 = arr2, n = n)

        assertContentEquals(expected = expected, actual = arr1)
    }

    @Test
    fun `should return first array`(){
        val arr1 = intArrayOf(1,2,3,4)
        val arr2 = intArrayOf()
        val m = arr1.size - arr2.size
        val n = arr2.size

        val expected = intArrayOf(1,2,3,4)

        algorithm.solve(nums1 = arr1, m = m, nums2 = arr2, n = n)

        assertContentEquals(expected = expected, actual = arr1)
    }

    @Test
    fun `should return second array`(){
        val arr1 = intArrayOf(0,0,0,0)
        val arr2 = intArrayOf(1,2,3,5)
        val m = arr1.size - arr2.size
        val n = arr2.size

        val expected = intArrayOf(1,2,3,5)

        algorithm.solve(nums1 = arr1, m = m, nums2 = arr2, n = n)

        assertContentEquals(expected = expected, actual = arr1)
    }
}