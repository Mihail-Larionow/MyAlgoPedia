package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemoveDuplicatesTest {

    private val algorithm = RemoveDuplicates()

    @Test
    fun `case 1`(){
        val arr = intArrayOf(1,1,2)

        val expected = 2
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val arr = intArrayOf(0,0,1,1,1,2,2,3,3,4)

        val expected = 5
        val actual = algorithm.solve(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

}