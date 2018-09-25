package Swaps;

public class SwapNode
{

    public ListNode swapPairs(ListNode head)
    {
        ListNode current = head;
        ListNode previous = current;
        ListNode nextCurrent;

        boolean first = true;


        while (current != null)
        {
            if (current.next != null)
            {
                ListNode newNode = new ListNode(current.val);
                ListNode nextNode = new ListNode(current.next.val);

                newNode.next = current.next.next;
                nextNode.next = newNode;

                previous.next.next = newNode;

                previous = current;


                if (first)
                {
                    head = nextNode;
                    first = false;
                }
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


        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(5);

        l1.next.next.next.next = l2;

        SwapNode blahs = new SwapNode();
        ListNode head = blahs.swapPairs(l1);


    }
}
