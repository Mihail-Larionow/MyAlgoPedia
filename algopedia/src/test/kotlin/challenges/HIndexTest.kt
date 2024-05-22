package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HIndexTest {

    val algorithm = HIndex()

    @Test
    fun `case 1`(){
        val arr = intArrayOf(3,0,6,1,5)

        val expected = 3
        val actual = algorithm.solve(citations = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val arr = intArrayOf(1,3,1)

        val expected = 1
        val actual = algorithm.solve(citations = arr)

        assertEquals(expected = expected, actual = actual)
    }

}