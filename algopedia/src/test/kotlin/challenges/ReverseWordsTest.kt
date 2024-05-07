package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReverseWordsTest {

    private val algorithm = ReverseWords()

    @Test
    fun `case 1`(){
        val s = "Let's take LeetCode contest"

        val expected = "s'teL ekat edoCteeL tsetnoc"
        val actual = algorithm.solve(s = s)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val s = "Mr Ding"

        val expected = "rM gniD"
        val actual = algorithm.solve(s = s)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){
        val s = " L"

        val expected = " L"
        val actual = algorithm.solve(s = s)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 4`(){
        val s = "a "

        val expected = "a "
        val actual = algorithm.solve(s = s)

        assertEquals(expected = expected, actual = actual)
    }

}