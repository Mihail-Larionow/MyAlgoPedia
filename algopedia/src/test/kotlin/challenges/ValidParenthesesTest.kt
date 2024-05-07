package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ValidParenthesesTest {

    private val algorithm = ValidParentheses()

    @Test
    fun `case 1`(){
        val str = "()"

        val expected = true
        val actual = algorithm.solve(s = str)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val str = "()[]{}"

        val expected = true
        val actual = algorithm.solve(s = str)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){
        val str = "(]"

        val expected = false
        val actual = algorithm.solve(s = str)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 4`(){
        val str = "("

        val expected = false
        val actual = algorithm.solve(s = str)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 5`(){
        val str = "]"

        val expected = false
        val actual = algorithm.solve(s = str)

        assertEquals(expected = expected, actual = actual)
    }

}