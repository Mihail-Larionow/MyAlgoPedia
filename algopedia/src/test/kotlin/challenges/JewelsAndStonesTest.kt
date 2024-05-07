package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class JewelsAndStonesTest {

    private val algorithm = JewelsAndStones()

    @Test
    fun `case 1`(){
        val jewels = "aA"
        val stones = "aAAbbbb"

        val expected = 3
        val actual = algorithm.solve(jewels = jewels, stones = stones)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){
        val jewels = "z"
        val stones = "ZZ"

        val expected = 0
        val actual = algorithm.solve(jewels = jewels, stones = stones)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 3`(){
        val jewels = ""
        val stones = "elLlLfAa"

        val expected = 0
        val actual = algorithm.solve(jewels = jewels, stones = stones)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 4`(){
        val jewels = "aA"
        val stones = ""

        val expected = 0
        val actual = algorithm.solve(jewels = jewels, stones = stones)

        assertEquals(expected = expected, actual = actual)
    }

}