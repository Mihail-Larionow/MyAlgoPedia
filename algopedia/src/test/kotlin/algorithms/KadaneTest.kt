package algorithms

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class KadaneTest {

    private val kadane = Kadane()

    @Test
    fun `case 1`(){
        val arr = intArrayOf(7,1,5,3,6,4)

        val expected = 26
        val actual = kadane.execute(arr = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val arr = intArrayOf(7,1,5,3,6,4,-1,-2)

        val expected = 26
        val actual = kadane.execute(arr = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){
        val arr = intArrayOf(7,1,-5,-7,5,3,6,4,-1,-2)

        val expected = 18
        val actual = kadane.execute(arr = arr)

        assertEquals(expected = expected, actual = actual)
    }
}