package homework3;


public class Main {
    // метод main является точкой входа в программу
    public static void main(String[] args) {
        // Создаем список: 1 -> 26 -> 45 -> 42 -> 55 -> null
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(26);
        ListNode third = new ListNode(45);
        ListNode fourth = new ListNode(42);
        ListNode five = new  ListNode(55);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;

        // Выводим исходный список
        printList(head);

        // Разворачиваем список
        LinkedListReversal reversal = new LinkedListReversal();
        ListNode reversedHead = reversal.reverse(head);

        // Выводим развернутый список
        printList(reversedHead);
    }

    public static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
}
