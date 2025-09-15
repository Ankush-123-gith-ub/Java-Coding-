class Node7{
    int data;
    Node7 next;
    Node7(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList7{
    Node7 head;

    void append(int data){
        Node7 newNode = new Node7(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node7 temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void reverse(){
        Node7 prev = null;
        Node7 curr = head;
        Node7 next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    boolean checkcycle(){
        Node7 slow = head;
        Node7 fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    int countNodes(){
        int count = 0;
        Node7 temp = head;
        while (temp != null) {
           count++;
           temp = temp.next; 
        }
        return count;
    }

    void createcycle(){
        if (head == null) return;
        
    }

    void printList(){
        Node7 temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class loop{
    public static void main(String[] args){
        LinkedList7 l7 = new LinkedList7();
        l7.append(10);
        l7.append(19);
        l7.append(12);
        l7.append(18);

        l7.printList();
        if(l7.checkcycle()){
            System.out.println("yes this is a lopp");
        }
        else{
            System.out.println("no not this is not a loop");
        }
        
    }
}