   public static Node insert(Node head, int data) {
        //Complete this method
        Node n = new Node(data);

        if (head == null) {
            head = n;
            return head;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n;

        //System.out.println("Head data: " + head.data + "Head next: " + head.next);
        return head;
    }

