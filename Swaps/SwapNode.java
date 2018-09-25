package Swaps;

public class SwapNode
{

    public ListNode swapPairs(ListNode head)
    {
        ListNode answer = head;
        ListNode current = head;
        ListNode previous = current;
        ListNode currentAnswerPointer = answer;

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
                    currentAnswerPointer = current;
                    first = false;
                }
                else
                {
                    currentAnswerPointer.next = current;
                    currentAnswerPointer = currentAnswerPointer.next;
                }

                current = current.next.next.next;
                previous = previous.next;
            }
            else
            {
                previous = current;
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
