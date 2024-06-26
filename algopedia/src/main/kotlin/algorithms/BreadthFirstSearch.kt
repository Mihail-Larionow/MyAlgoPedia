package algorithms

class BreadthFirstSearch {

    fun execute(graph: Map<Int, List<Int>>, start: Int): List<Int> {
        val visited = mutableListOf<Int>()
        val queue = ArrayDeque<Int>()
        queue.add(start)
        while(queue.isNotEmpty()){
            val vertex = queue.removeFirst()
            if(vertex !in visited){
                visited.add(vertex)
                graph[vertex]?.let{
                        neighbors -> queue.addAll(neighbors.filterNot{ it in visited })
                }
            }
        }
        return visited
    }

}