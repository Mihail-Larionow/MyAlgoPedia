package algorithms

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BoyerMooreMajorityVoteTest {

    val bmmv = BoyerMooreMajorityVote()

    @Test
    fun `case 1`(){

        val arr = intArrayOf(2, 2, 1, 1, 1, 2, 2)

        val expected = 2
        val actual = bmmv.execute(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `case 2`(){

        val arr = intArrayOf(3,2,3)

        val expected = 3
        val actual = bmmv.execute(nums = arr)

        assertEquals(expected = expected, actual = actual)
    }
}