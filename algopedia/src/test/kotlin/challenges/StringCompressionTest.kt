package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class StringCompressionTest {

    private val algorithm = StringCompression()

    @Test
    fun `case 1`(){
        val arr = charArrayOf('a','a','b','b','c','c','c')

        val expected = charArrayOf('a','2','b','2','c','3','c')
        val actual = algorithm.solve(chars = arr)

        assertContentEquals(expected = expected, actual = arr)
    }

    @Test
    fun `case 2`(){
        val arr = charArrayOf('a')

        val expected = charArrayOf('a')
        val actual = algorithm.solve(chars = arr)

        assertContentEquals(expected = expected, actual = arr)
    }

    @Test
    fun `case 3`(){
        val arr = charArrayOf('a','b','b','b','b','b','b','b')

        val expected = charArrayOf('a','b','7','b','b','b','b','b')
        val actual = algorithm.solve(chars = arr)

        assertContentEquals(expected = expected, actual = arr)
    }

    @Test
    fun `case 4`(){
        val arr = charArrayOf('a','a','a','b','b','a','a')

        val expected = charArrayOf('a','3','b','2','a','2','a')
        val actual = algorithm.solve(chars = arr)

        assertContentEquals(expected = expected, actual = arr)
    }

}