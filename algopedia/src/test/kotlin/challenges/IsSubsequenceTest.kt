package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class IsSubsequenceTest {

    private val algorithm = IsSubsequence()

    @Test
    fun `case 1`(){
        val s = "abc"
        val t = "ahbgdc"

        val expected = true
        val actual = algorithm.solve(s = s, t = t)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val s = "axc"
        val t = "ahbgdc"

        val expected = false
        val actual = algorithm.solve(s = s, t = t)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){
        val s = "acb"
        val t = "ahbgdc"

        val expected = false
        val actual = algorithm.solve(s = s, t = t)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 4`(){
        val s = "acb"
        val t = ""

        val expected = false
        val actual = algorithm.solve(s = s, t = t)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 5`(){
        val s = ""
        val t = "ahbgdc"

        val expected = true
        val actual = algorithm.solve(s = s, t = t)

        assertEquals(expected = expected, actual = actual)
    }

}