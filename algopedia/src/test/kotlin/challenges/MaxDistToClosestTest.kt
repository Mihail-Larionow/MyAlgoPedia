package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaxDistToClosestTest {

    private val algorithm = MaxDistToClosest()

    @Test
    fun `case 1`(){
        val arr = intArrayOf(1,0,0,0,1,0,1)

        val expected = 2
        val actual = algorithm.solve(seats = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val arr = intArrayOf(1,0,0,0)

        val expected = 3
        val actual = algorithm.solve(seats = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){
        val arr = intArrayOf(0,1)

        val expected = 1
        val actual = algorithm.solve(seats = arr)

        assertEquals(expected = expected, actual = actual)
    }

}