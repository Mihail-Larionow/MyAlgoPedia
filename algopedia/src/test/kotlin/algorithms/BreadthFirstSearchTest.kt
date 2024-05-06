package algorithms

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class BreadthFirstSearchTest {

    private val bfs = BreadthFirstSearch()

    @Test
    fun `should return vertices in the right order`(){
        val graph = mapOf(
            1 to listOf(2, 3, 4),
            2 to listOf(5, 6),
            3 to listOf(),
            4 to listOf(7, 8),
            5 to listOf(),
            6 to listOf(),
            7 to listOf(),
            8 to listOf()
        )
        val start = 1

        val expected = listOf(1, 2, 3, 4, 5, 6, 7, 8)
        val actual = bfs.execute(graph = graph, start = start)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should return part of the vertices`(){
        val graph = mapOf(
            1 to listOf(2, 3, 4),
            2 to listOf(5, 6),
            3 to listOf(),
            4 to listOf(7, 8),
            5 to listOf(),
            6 to listOf(),
            7 to listOf(),
            8 to listOf()
        )

        val start = 4

        val expected = listOf(4, 7, 8)
        val actual = bfs.execute(graph = graph, start = start)

        assertContentEquals(expected = expected, actual = actual)
    }

    @Test
    fun `should return only one vertex`(){
        val graph = mapOf(
            1 to listOf(2, 3, 4),
            2 to listOf(5, 6),
            3 to listOf(),
            4 to listOf(7, 8),
            5 to listOf(),
            6 to listOf(),
            7 to listOf(),
            8 to listOf()
        )

        val start = 3

        val expected = listOf(3)
        val actual = bfs.execute(graph = graph, start = start)

        assertContentEquals(expected = expected, actual = actual)
    }
}