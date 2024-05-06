package algorithms

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BinarySearchTest {

    private val bs = BinarySearch()

    @Test
    fun `should return a key first`(){
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val x = 10

        val expected = 9
        val actual = bs.execute(arr = array, value = x)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should return a key second`(){
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val x = 5

        val expected = 4
        val actual = bs.execute(arr = array, value = x)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should return a key third`(){
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val x = 1

        val expected = 0
        val actual = bs.execute(arr = array, value = x)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `shouldn't return a key`(){
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val x = 11

        val expected = -1
        val actual = bs.execute(arr = array, value = x)

        assertEquals(expected = expected, actual = actual)
    }
}