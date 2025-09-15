class Node6{
    int data;
    Node6 next;
    Node6(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList6{
    Node6 head;

    void append(int data){
        Node6 newNode = new Node6(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node6 temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void reverse(){
        Node6 prev = null;
        Node6 curr = head;
        Node6 next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    int countNodes(){
        int count = 0;
        Node6 temp = head;
        while (temp != null) {
           count++;
           temp = temp.next; 
        }
        return count;
    }

    void printList(){
        Node6 temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class reverse{
    public static void main(String[] args){
        LinkedList6 l6 = new LinkedList6();
        l6.append(10);
        l6.append(19);
        l6.append(12);
        l6.append(18);

        l6.printList();
        System.out.println("total count : "+ l6.countNodes());
        l6.reverse();
        l6.printList();
    }
}