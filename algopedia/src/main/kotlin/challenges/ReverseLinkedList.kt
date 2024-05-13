package challenges

import data_structures.ListNode

class ReverseLinkedList {

    fun solve(head: ListNode<Int>?): ListNode<Int>? {

        if(head == null) return null

        var tail = head
        var current = head.next

        while(current != null) {
            val next = current.next
            current.next = tail
            tail = current
            current = next
        }
        head.next = null
        return tail
    }
}