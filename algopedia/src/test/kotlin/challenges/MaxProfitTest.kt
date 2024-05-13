package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaxProfitTest {

    val algorithm = MaxProfit()

    @Test
    fun `case 1`(){

        val arr = intArrayOf(7,1,5,3,6,4)

        val actual = algorithm.solve(prices = arr)
        val expected = 5
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){

        val arr = intArrayOf(7,6,4,3,1)

        val actual = algorithm.solve(prices = arr)
        val expected = 0
        assertEquals(expected = expected, actual = actual)
    }
}