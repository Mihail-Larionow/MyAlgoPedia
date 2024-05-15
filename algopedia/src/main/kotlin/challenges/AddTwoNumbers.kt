package challenges

import data_structures.ListNode

class AddTwoNumbers {

    fun solve(l1: ListNode<Int>?, l2: ListNode<Int>?): ListNode<Int>? {

        if(l1 == null && l2 == null) return null
        var list1 = l1
        var list2 = l2

        var a = list1?.`val` ?: 0
        var b = list2?.`val` ?: 0
        list1 = list1?.next
        list2 = list2?.next

        var c = (a + b) % 10
        var d = (a + b) / 10

        val head = ListNode(c)
        var node: ListNode<Int>? = head

        while(list1 != null || list2 != null) {

            if(list1 != null){
                a = list1.`val`
                list1 = list1.next
            }
            else{
                a = 0
            }

            if(list2 != null){
                b = list2.`val`
                list2 = list2.next
            }
            else{
                b = 0
            }
            c = (d + a + b) % 10
            d = (d + a + b) / 10

            node?.next = ListNode(c)
            node = node?.next
        }

        if(d != 0) node?.next = ListNode(d)

        return head
    }
}