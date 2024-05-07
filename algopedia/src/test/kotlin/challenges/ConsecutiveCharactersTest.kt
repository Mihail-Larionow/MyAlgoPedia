package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class ConsecutiveCharactersTest {

    private val algorithm = ConsecutiveCharacters()

    @Test
    fun `case 1`(){
        val str = "leetcode"

        val actual = algorithm.solve(s = str)
        val expected = 2
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val str = "tourist"

        val actual = algorithm.solve(s = str)
        val expected = 1
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){
        val str = ""

        val actual = algorithm.solve(s = str)
        val expected = 0
        assertEquals(expected = expected, actual = actual)
    }
}