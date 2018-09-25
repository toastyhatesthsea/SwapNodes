package Swaps;

public class SwapNode
{

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
                ListNode nextCurrent = current.next;
                current.next = current.next.next;
                nextCurrent.next = current;

            }
            else
            {
                break;
            }
            current = current.next.next;
        }
        return current;
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


        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(5);

        SwapNode blahs = new SwapNode();



    }
}
