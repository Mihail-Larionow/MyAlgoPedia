package challenges

import data_structures.LinkedList
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class MergeTwoSortedListsTest {

    private val algorithm = MergeTwoSortedLists()


    @Test
    fun `should return merged list`(){
        val list1 = LinkedList<Int>()
        val list2 = LinkedList<Int>()

        listOf(1,2,4).forEach { list1.append(it) }
        listOf(1,3,4).forEach { list2.append(it) }

        val expected = listOf(1, 1, 2, 3, 4, 4)

        val actual = list1.toList(algorithm.solve(list1 = list1.getHead(), list2 = list2.getHead()))

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should return list1`(){
        val list1 = LinkedList<Int>()
        val list2 = LinkedList<Int>()

        listOf(1,2,4).forEach { list1.append(it) }

        val expected = listOf(1,2,4)

        val actual = list1.toList(algorithm.solve(list1 = list1.getHead(), list2 = list2.getHead()))

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should return list2`(){
        val list1 = LinkedList<Int>()
        val list2 = LinkedList<Int>()

        listOf(1,3,4).forEach { list2.append(it) }

        val expected = listOf(1,3,4)

        val actual = list1.toList(algorithm.solve(list1 = list1.getHead(), list2 = list2.getHead()))

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should return empty list`(){
        val list1 = LinkedList<Int>()
        val list2 = LinkedList<Int>()

        val expected = emptyList<Int>()

        val actual = list1.toList(algorithm.solve(list1 = list1.getHead(), list2 = list2.getHead()))

        assertContentEquals(expected = expected, actual = actual)
    }

}