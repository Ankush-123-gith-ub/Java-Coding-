class Node2 {
    int data;
    Node2 next;
    Node2(int data){
        this.data =data;
        this.next =null;
    }    
}

class LinkedList2{
    Node2 head;
    void append(int data){
        Node2 newNode2 = new Node2(data);
        if(head == null){
            head = newNode2;
            return;
        }
        Node2 temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode2;

    }


    void delete_pos(int pos){
        if(head == null) return;

        if (pos == 0){
            head = head.next;
            return;
        }

        Node2 temp = head;
        for(int i = 0 ; temp != null && i <pos-1;i++){
            temp = temp.next;
        }
        if(temp == null || temp.next==null) return;
        temp.next = temp.next.next;
    }

    void printList2() {
    Node2 temp = head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("null");
    }



}

class delete_pos{
    public static void main(String[] args) {
       LinkedList2 l2 =new LinkedList2();
       l2.append(10);
       l2.append(15);
       l2.append(17);
       l2.append(19);
       l2.append(14);
       l2.printList2();
       int pos = 2;
       l2.delete_pos(pos);
       l2.printList2();;

    }
}
