package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class RemoveElementTest {

    private val algorithm = RemoveElement()

    @Test
    fun `case 1`(){
        val actual = intArrayOf(3,2,2,3)
        val k = 2

        val expected = intArrayOf(3,3,2,2)
        algorithm.solve(nums = actual, `val` = k)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val actual = intArrayOf(1)
        val k = 1

        val expected = intArrayOf(1)
        algorithm.solve(nums = actual, `val` = k)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){
        val actual = intArrayOf(2)
        val k = 1

        val expected = intArrayOf(2)
        algorithm.solve(nums = actual, `val` = k)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 4`(){
        val actual = intArrayOf(3,1)
        val k = 3

        val expected = intArrayOf(1,3)
        algorithm.solve(nums = actual, `val` = k)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 5`(){
        val actual = intArrayOf()
        val k = 2

        val expected = intArrayOf()
        algorithm.solve(nums = actual, `val` = k)

        assertContentEquals(expected = expected, actual = actual)
    }
}