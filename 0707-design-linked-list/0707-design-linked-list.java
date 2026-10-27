class MyLinkedList {

    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        
    }
    
    public int get(int index) {
       if (index < 0) {
        return -1;
       }

       Node curr = head;

       for (int i = 0; i < index; i++) {
        if (curr == null) {
            return -1;
        }
        curr = curr.next;
       }

       if (curr == null) {
        return -1;
       }

       return curr.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
        
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        
    }
    
    
 public void addAtIndex(int index, int val) {

    if(index < 0){
        addAtHead(val);
        return;
    }

    if(index > size){
        return;
    }

    if(index == 0){
        addAtHead(val);
        return;
    }

    if(index == size){
        addAtTail(val);
        return;
    }

    Node prevNode = head;

    for(int i = 0; i < index - 1; i++){
        prevNode = prevNode.next;
    }

    Node newNode = new Node(val);

    newNode.next = prevNode.next;
    prevNode.next = newNode;

    size++;
 }


    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            
            return;
        }
        if(index == 0){
            deleteHead();
            return;
        }
        if(index == size - 1){
            deleteTail();
            return;
        }

        Node prevNode = head;
        for(int i=0; i<index-1; i++){
            prevNode = prevNode.next;
        }
        prevNode.next = prevNode.next.next;
        size--;
    }
    public void deleteTail(){
        
        if(tail == null){
            
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
     public void deleteHead(){
        if(head == null){
            
            return;
        }
        head = head.next;
        size--;

        if(head == null){
            tail = null;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */