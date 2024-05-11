package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestSubarrayTest {

    private val algorithm = LongestSubarray()

    @Test
    fun `case 1`(){
        val arr = intArrayOf(1,1,0,1)

        val expected = 3
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val arr = intArrayOf(0,1,1,1,0,1,1,0,1)

        val expected = 5
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){
        val arr = intArrayOf(1,1,1)

        val expected = 2
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 4`(){
        val arr = intArrayOf(0,0,0)

        val expected = 0
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 5`(){
        val arr = intArrayOf(0,0,1,1)

        val expected = 2
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

}