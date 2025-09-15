class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList1{
    Node1 head;

    void append(int data){
        Node1 newNode = new Node1(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node1 temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    boolean search(int key) {
        Node1 temp = head;
        while (temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    void delete(int key){
        if (head == null){
            return;
        }

        if(head.data == key){
            head = head.next;
        }
        Node1 temp = head;
        while(temp.next != null && temp.next.data != key){
            temp = temp.next;
        }

        if(temp.next == null){
            return;
        }

        temp.next = temp.next.next;
    }
    void printList(){
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class find {
    public static void main(String[] args) {
        LinkedList1 l1 = new LinkedList1();
        l1.append(100);
        l1.append(120);
        l1.append(130);
        l1.append(140);
        l1.append(150);
        l1.printList();

        int key = 100;
        if(l1.search(key)){
            System.out.println(key + "key found");
        }
        else{
            System.out.println(key + "Not found");
        }
        key = 50;
        if(l1.search(key)){
            System.out.println(key + "key found");
        }
        else{
            System.out.println(key + "Not found");
        }
        
        key = 150;
        l1.delete(key);
        l1.printList();

        key = 1200;
        l1.printList();
        l1.delete(key);

        key = 120;
        l1.delete(key);
        l1.printList();
        
        key = 100;
        l1.delete(key);
        l1.printList();
    }
}
