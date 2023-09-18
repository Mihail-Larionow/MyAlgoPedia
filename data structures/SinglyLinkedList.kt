package structures

class SinglyLinkedList <T> {
    private var head: Node<T>? = null

    fun append(value: T) {
        if (head == null) {
            head = Node(value)
            return
        }
        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = Node(value)
    }

    override fun toString(): String {
        var s = "["
        var node = head
        while (node != null) {
            s += "${node.value}"
            node = node.next
            if (node != null) { s += ", " }
        }
        return s + "]"
    }

    class Node <T>(value: T){
        var value: T = value
        var next: Node<T>? = null
    }

}