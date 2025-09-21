class Node8{
    int data;
    Node8 next;
    Node8(int data){
        this.data = data;
        this.next = null;
    }
}
    
public class merged_list{
    public static Node8 mergetwolists(Node8 l1 , Node8 l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        Node8 head;
        Node8 tail;
        if(l1.data <= l2.data ){
            head = l1;
            l1 = l1.next;
        }
        else{
            head = l2;
            l2 = l2.next;
        }
        tail = head;

        while(l1 != null  && l2 != null){
            if(l1.data <= l2.data){
                tail.next = l1;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if(l1 != null){
            tail.next = l1;
        }
        else if (l2 != null){
            tail.next = l2;
        }
        return head;
    }

    public static void printlist(Node8 head){
        Node8 curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node8 l1 = new Node8(1);
        l1.next = new Node8(3);
        l1.next.next = new Node8(5);

         // Second List: 2 → 4 → 6
        Node8 l2 = new Node8(2);
        l2.next = new Node8(4);
        l2.next.next = new Node8(6);

        Node8 merged = mergetwolists(l1, l2);
        
        System.out.print("Merged List: ");
        printlist(merged);  // Output: 1 2 3 4 5 6

    }
}