package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MissingNumberTest {

    private val algorithm = MissingNumber()

    @Test
    fun `case 1`(){
        val arr = intArrayOf(3,0,1)

        val expected = 2
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val arr = intArrayOf(9,6,4,2,3,5,7,0,1)

        val expected = 8
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){
        val arr = intArrayOf(0,1)

        val expected = 2
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

}