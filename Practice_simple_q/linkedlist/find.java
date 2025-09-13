class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    void append(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    boolean search(int key) {
        Node temp = head;
        while (temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class find {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(100);
        l1.append(120);
        l1.append(130);
        l1.printList();

        int key = 20;
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
    }
}
