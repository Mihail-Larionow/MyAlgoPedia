package algorithms

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class BinarySearchTest {

    private val array = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    private val bs = BinarySearch()

    @Test
    fun `should return value`(){
        val x = 6

        val expected = 5
        val actual = bs.execute(arr = array, value = x)

        assertEquals(expected, actual)
    }

    @Test
    fun `shouldn't return value`(){
        val x = 11

        val expected = -1
        val actual = bs.execute(arr = array, value = x)

        Assertions.assertEquals(expected, actual)
    }
}