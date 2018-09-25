package Swaps;

public class SwapNode
{


     public class ListNode {
        int val;
         ListNode next;

         ListNode(int x)
         {
             val = x;
         }
     }

    class Swap {
        public ListNode swapPairs(ListNode head)
        {
            ListNode current = head;
            ListNode previous = current;


            while (current != null)
            {
                int firstValue = current.val;
                int secondValue;

                if (current.next != null)
                {
                    secondValue = current.next.val;
                }
            }

        }
    }


}
