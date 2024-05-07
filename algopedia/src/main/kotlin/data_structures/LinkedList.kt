package data_structures

class LinkedList<T> {

    private var head: ListNode<T>? = null

    fun append(data: T) {
        if (head == null) {
            head = ListNode(data)
            return
        }
        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = ListNode(data)
    }

    fun toList(node: ListNode<T>? = head): List<T> {
        val result = mutableListOf<T>()
        var current = node
        while (current != null) {
            result.add(current.`val`)
            current = current.next
        }
        return result
    }

    fun getHead(): ListNode<T>? {
        return head
    }

}

data class ListNode<T>(val `val`: T, var next: ListNode<T>? = null)
