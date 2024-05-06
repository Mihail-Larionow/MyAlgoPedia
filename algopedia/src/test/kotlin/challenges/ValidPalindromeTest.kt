package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ValidPalindromeTest {

    private val algorithm = ValidPalindrome()

    @Test
    fun `should return true first`(){
        val str = "A man, a plan, a canal: Panama"

        val expected = true
        val actual = algorithm.solve(s = str)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should return true second`(){
        val str = " p"

        val expected = true
        val actual = algorithm.solve(s = str)

        assertEquals(expected = expected, actual = actual)
    }
    @Test
    fun `should return true third`(){
        val str = " "

        val expected = true
        val actual = algorithm.solve(s = str)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should return false first`(){
        val str = "race a car"

        val expected = false
        val actual = algorithm.solve(s = str)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should return false second`(){
        val str = "0P"

        val expected = false
        val actual = algorithm.solve(s = str)

        assertEquals(expected = expected, actual = actual)
    }

}