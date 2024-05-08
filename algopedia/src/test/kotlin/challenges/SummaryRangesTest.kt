package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class SummaryRangesTest {

    private val algorithm = SummaryRanges()

    @Test
    fun `should return right endings`(){
        val nums = intArrayOf(0,1,2,4,5,7)

        val expected = listOf("0->2","4->5","7")
        val actual = algorithm.solve(nums = nums)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should return right beginnings`(){
        val nums = intArrayOf(0,2,3,4,6,8,9)

        val expected = listOf("0","2->4","6","8->9")
        val actual = algorithm.solve(nums = nums)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should work with integer limits`(){
        val nums = intArrayOf(-2147483648,-2147483647,2147483647)

        val expected = listOf("-2147483648->-2147483647", "2147483647")
        val actual = algorithm.solve(nums = nums)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should return an empty list`(){
        val nums = intArrayOf()

        val expected = listOf<String>()
        val actual = algorithm.solve(nums = nums)

        assertContentEquals(expected = expected, actual = actual)
    }

}