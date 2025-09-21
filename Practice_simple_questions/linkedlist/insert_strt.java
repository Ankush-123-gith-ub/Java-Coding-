class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList3{
    Node3 head;
    void append(int data){
        Node3 newNode3 = new Node3(data);
        if(head == null){
            head = newNode3;
            return;
        }

        Node3 temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next  = newNode3;
    }

    void Insert(int data){
        Node3 newNode3 = new Node3(data);
        newNode3.next = head;
        head = newNode3;
    }

    void printList3(){
        Node3 temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class insert_strt {
    public static void main(String[] args){
        LinkedList3 l3 = new LinkedList3();
        l3.append(10);
        l3.append(15);
        l3.append(12);
        l3.append(16);
        l3.append(11);
        l3.printList3();
        l3.Insert(300);
        l3.printList3();
    }
}
