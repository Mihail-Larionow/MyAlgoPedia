package challenges

import data_structures.ListNode

class LinkedListCycleTwo {

    fun solve(head: ListNode<Int>?): ListNode<Int>? {
        var slow = head
        var fast = head

        while(fast?.next != null){
            slow = slow!!.next
            fast = fast.next!!.next

            if(slow == fast){
                break
            }
        }

        if(fast?.next == null) return null

        slow = head
        while(slow != fast){
            slow = slow!!.next
            fast = fast!!.next
        }

        return slow
    }

}