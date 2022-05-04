/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        ListNode res = head;
        ListNode ans = null;
        while (res != null){
            ListNode temp = res.next;
            res.next = ans;
            ans = res;
            res = temp;
        }
        return ans;
    }
}