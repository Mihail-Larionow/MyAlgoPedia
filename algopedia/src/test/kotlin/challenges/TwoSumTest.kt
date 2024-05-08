package challenges

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class TwoSumTest {

    private val algorithm = TwoSum()

    @Test
    fun `case 1`(){
        val nums = intArrayOf(2,7,11,15)
        val target = 9

        val expected = intArrayOf(0,1)
        val actual = algorithm.solve(nums = nums, target = target)

        assertTrue(expected.toList().containsAll(elements = actual.toList()))
    }

    @Test
    fun `case 2`(){
        val nums = intArrayOf(3,2,4)
        val target = 6

        val expected = intArrayOf(1,2)
        val actual = algorithm.solve(nums = nums, target = target)

        assertTrue(expected.toList().containsAll(elements = actual.toList()))
    }

    @Test
    fun `case 3`(){
        val nums = intArrayOf(3,3)
        val target = 6

        val expected = intArrayOf(0,1)
        val actual = algorithm.solve(nums = nums, target = target)

        assertTrue(expected.toList().containsAll(elements = actual.toList()))
    }

}