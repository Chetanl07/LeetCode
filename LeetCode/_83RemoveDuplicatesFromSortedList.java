public class _83RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode head = new  ListNode(20);
        head.next=new ListNode(20);
        head.next.next=new ListNode(30);
        head.next.next.next=new ListNode(40);
        head.next.next.next.next=new ListNode(40);

        Solution83 sol= new Solution83();
        ListNode result=sol.deleteDuplicates(head);

        while(result!=null)
        {
            System.out.println(result.val);
            result=result.next;
        }


    }
}

class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr= head;

        while(curr !=null && curr.next!=null)
        {
            if(curr.val == curr.next.val)
            {
                curr.next=curr.next.next;
            }
            else curr= curr.next;
        }
        return head;
    }
}


