class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data = data ; 
        this.next = null; 
    }
}

class LinkedList4{
    Node4 head;
    void append(int data){
        Node4 newNode4 = new Node4(data);
        if(head == null){
            head =  newNode4;
            return;
        }
        Node4 temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode4;
    }

    void insert_at(int value,int ipos){
        Node4 temp = head;
        Node4 newValue = new Node4(value);
        
        if(ipos == 0 ){
            newValue.next = head;
            head = newValue;
            return;
        }
        for(int i = 0;temp != null && i < ipos-1;i++){
            temp = temp.next;
        }
        if(temp == null)return;
        newValue.next = temp.next;
        temp.next = newValue;
        }

    void printList4(){
        Node4 temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class insert_specific {
    public static void main(String[] args) {
        
    
    LinkedList4 l4 = new LinkedList4();
    l4.append(1);
    l4.append(2);
    l4.append(3);
    l4.append(4);
    l4.append(5);
    l4.printList4();
    l4.insert_at(7, 3);
    l4.printList4();
}
}
