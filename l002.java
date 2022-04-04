public class l002 {

    public class ListNode{
        int val;
        ListNode next;

        ListNode(){

        }
        
        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null){
            return list1 != null ? list1 : list2;
        }
        
        ListNode c1 = list1,c2 = list2;
        ListNode dummy = new ListNode(-1), prev = dummy;
        
        while(c1 != null && c2 != null){
            if(c1.val < c2.val){
                prev.next = c1;
                c1 = c1.next;
            }
            else{
                prev.next = c2;
                c2 = c2.next;
            }
            prev = prev.next;
        }
        prev.next = c1!=null?c1:c2;
        
        ListNode head = dummy.next;
        dummy.next = null;
        return head;
    }

    //bakwas method
    // O(N.k) - TC
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;

        ListNode ans = null;
        for(ListNode head:lists){
            ans = mergeTwoLists(ans, head);
        }

        return ans;
    }

    public ListNode mergeKLists_optimised(ListNode[] lists) {
        if(lists.length == 0) return null;

        ListNode ans = null;
        for(ListNode head:lists){
            ans = mergeTwoLists(ans, head);
        }

        return ans;
    }



    public static void main(String[] args){

    }
    
}
