package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HouseRobberTest {

    val algorithm = HouseRobber()

    @Test
    fun `case 1`(){
        val arr = intArrayOf(1,2,3,1)
        val expected = 4
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val arr = intArrayOf(2,7,9,3,1)
        val expected = 12
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){
        val arr = intArrayOf(1)
        val expected = 1
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 4`(){
        val arr = intArrayOf(2,1,1,2)
        val expected = 4
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 5`(){
        val arr = intArrayOf(1,3,1)
        val expected = 3
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }
}