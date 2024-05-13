package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class RemoveDuplicatesTwoTest {

    private val algorithm = RemoveDuplicatesTwo()

    @Test
    fun `case 1`(){
        val arr = intArrayOf(0,0,1,1,1,1,2,3,3)

        val expected = intArrayOf(0,0,1,1,2,3,3,3,3)
        val actual = algorithm.solve(nums = arr)

        assertContentEquals(expected = expected, actual = arr)
    }

    @Test
    fun `case 2`(){
        val arr = intArrayOf(1,1,1,2,2,3)

        val expected = intArrayOf(1,1,2,2,3,3)
        val actual = algorithm.solve(nums = arr)

        assertContentEquals(expected = expected, actual = arr)
    }

    @Test
    fun `case 3`(){
        val arr = intArrayOf(0,0,1,1,1,1,2,2,2,4)

        val expected = intArrayOf(0,0,1,1,2,2,4,2,2,4)
        val actual = algorithm.solve(nums = arr)

        assertContentEquals(expected = expected, actual = arr)
    }

}