package Swaps;

public class SwapNode
{

    /**Given a linked list, swap every two adjacent nodes and return its head.
     Example:
     Given 1->2->3->4, you should return the list as 2->1->4->3.
     *
     * @param head ListNode
     * @return ListNode
     */
    public ListNode swapPairs(ListNode head)
    {
        ListNode answer = head;
        ListNode current = head;
        ListNode previous = current;
        ListNode beforePrevious = current;
        boolean first = true;

        while (current != null)
        {
            if (previous != current)
            {
                previous.next = current.next;
                current.next = previous;

                if (first) // Get head of new linked list
                {
                    answer = current;
                    first = false;
                }
                else
                {   //Connects the node before previous to the node that was swapped
                    beforePrevious.next = current;
                }
                //checks to make sure loop is not at the end of the node and there are more nodes to swap
                if (previous.next != null)
                {
                    beforePrevious = previous;
                    current = current.next.next.next; //moves current pointer for the current node to be swapped with 'previous' pointer
                    previous = previous.next;
                }
                else
                {
                    break;
                }
            }
            else
            {
                current = current.next;
            }
        }
        return answer;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x)
    {
        val = x;
    }
}

class SwapTesters
{
    public static void main(String[] argsgs)
    {
        SwapNode blahs = new SwapNode();


        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);

        ListNode l1List = blahs.swapPairs(l1);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(5);
        l2.next.next.next.next = new ListNode(7);
        l2.next.next.next.next.next = new ListNode(9);

        l1.next.next.next.next = l2;

        ListNode head = blahs.swapPairs(l1);


    }
}
