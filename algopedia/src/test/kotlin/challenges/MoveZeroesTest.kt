package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class MoveZeroesTest {

    private val algorithm = MoveZeroes()

    @Test
    fun `case 1`(){
        val actual = intArrayOf(0,1,0,3,12)

        val expected = intArrayOf(1,3,12,0,0)
        algorithm.solve(nums = actual)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val actual = intArrayOf(0)

        val expected = intArrayOf(0)
        algorithm.solve(nums = actual)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){
        val actual = intArrayOf(1)

        val expected = intArrayOf(1)
        algorithm.solve(nums = actual)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 4`(){
        val actual = intArrayOf(0,1)

        val expected = intArrayOf(1,0)
        algorithm.solve(nums = actual)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 5`(){
        val actual = intArrayOf()

        val expected = intArrayOf()
        algorithm.solve(nums = actual)

        assertContentEquals(expected = expected, actual = actual)
    }

}