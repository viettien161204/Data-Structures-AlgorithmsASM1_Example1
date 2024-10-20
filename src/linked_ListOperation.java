public class linked_ListOperation {
    // Node class for the Linked List
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedListReversal {
        // Head of the Linked List
        Node head;

        // Function to reverse the Linked List
        public void reverseList() {
            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {
                // Store the next node
                next = current.next;

                // Reverse the link
                current.next = prev;

                // Move the pointers
                prev = current;
                current = next;
            }

            // Update the head to the new head of the reversed list
            head = prev;
        }

        // Function to insert a new node at the beginning of the list
        public void insertAtBeginning(String data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Function to print the Linked List
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }


}
