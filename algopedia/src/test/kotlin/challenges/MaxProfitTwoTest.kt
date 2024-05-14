package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaxProfitTwoTest {

    val algorithm = MaxProfitTwo()

    @Test
    fun `case 1`(){

        val arr = intArrayOf(7,1,5,3,6,4)

        val actual = algorithm.solve(prices = arr)
        val expected = 7
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){

        val arr = intArrayOf(1,2,3,4,5)

        val actual = algorithm.solve(prices = arr)
        val expected = 4
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){

        val arr = intArrayOf(7,6,4,3,1)

        val actual = algorithm.solve(prices = arr)
        val expected = 0
        assertEquals(expected = expected, actual = actual)
    }
}