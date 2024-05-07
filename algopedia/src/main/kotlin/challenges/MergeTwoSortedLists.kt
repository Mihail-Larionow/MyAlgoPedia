package challenges

import data_structures.ListNode

class MergeTwoSortedLists {

    fun solve(list1: ListNode<Int>?, list2: ListNode<Int>?): ListNode<Int>?{
        if(list1 == null && list2 == null){
            return null
        }
        else if(list1 == null){
            return list2
        }
        else if(list2 == null){
            return list1
        }

        val head = if(list1.`val` > list2.`val`) list2 else list1

        var tail: ListNode<Int>? = head
        var node1 = if(head == list1) list1.next else list1
        var node2 = if(head == list2) list2.next else list2

        while(node1 != null || node2 != null){
            if(node1 == null || node1.`val` > (node2?.`val` ?: Int.MAX_VALUE)){
                tail?.next = node2
                node2 = node2?.next
                tail = tail?.next
            }
            else{
                tail?.next = node1
                node1 = node1.next
                tail = tail?.next
            }
        }

        return head
    }
}