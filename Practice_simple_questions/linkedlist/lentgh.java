class Node5{
    int data;
    Node5 next;
    Node5(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList5{
    Node5 head;

    void append(int data){
        Node5 newNode = new Node5(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node5 temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    int countNodes(){
        int count = 0;
        Node5 temp = head;
        while (temp != null) {
           count++;
           temp = temp.next; 
        }
        return count;
    }

    void printList(){
        Node5 temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class lentgth{
    public static void main(String[] args){
        LinkedList5 l1 = new LinkedList5();
        l1.append(10);
        l1.append(19);
        l1.append(12);
        l1.append(18);

        l1.printList();
        System.out.println("total count : "+ l1.countNodes());
    }
}