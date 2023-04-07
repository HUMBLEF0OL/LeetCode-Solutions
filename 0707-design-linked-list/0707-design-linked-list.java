class Node{
    int val;
    Node next;
    Node(int val)
    {
        this.val = val;
        this.next = null;
    }
}
class MyLinkedList {

    private Node root;
    private int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        root=new Node(0);
        size=0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        
        if(index < 0 || index >= size) return -1;
        
        Node node = root;
        int i=0;
        while(i <= index){
            node = node.next;
            i++;
        }
        return node.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        
        if(index < 0 || index > size) return;
        
        Node node = root;
        int i=0;
        while(i < index){
            node = node.next;
            i++;
        }
        Node newNode = new Node(val);
        newNode.next = node.next;
        node.next = newNode;
        size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        
        Node node = root;
        int i=0;
        while(i < index){
            node = node.next;
            i++;
        }
        node.next = node.next.next;
        size--;        
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