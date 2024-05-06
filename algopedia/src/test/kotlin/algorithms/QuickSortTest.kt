package algorithms

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class QuickSortTest {

    private val qs = QuickSort()

    @Test
    fun `should sort an unsorted array`() {
        val array = intArrayOf(5, 3, 9, 7, 1)

        val expected = intArrayOf(1, 3, 5, 7, 9)
        val actual = qs.execute(arr = array)

        assertContentEquals(expected, actual)
    }

    @Test
    fun `should sort a sorted array`() {
        val array = intArrayOf(1, 2, 3, 4, 5)

        val expected = intArrayOf(1, 2, 3, 4, 5)
        val actual = qs.execute(arr = array)

        assertContentEquals(expected, actual)
    }

    @Test
    fun `should sort a reverse sorted array`() {
        val array = intArrayOf(5, 4, 3, 2, 1)

        val expected = intArrayOf(1, 2, 3, 4, 5)
        val actual = qs.execute(arr = array)

        assertContentEquals(expected, actual)
    }

}