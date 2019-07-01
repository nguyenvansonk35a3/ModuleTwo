package Chap06_CollectionFamework.THLinkedListDonGian;

public class MyLinkedList {

    private Node head;              //Doi tuong lop Node
    private int numNodes = 0;       //so phan tu trong danh sach

    //Khoi tao node dau tien trong danh sach
    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    //Them 1 phan tu moi vao danh sach
    void add(int index, Object data) {          //co index --> them vao vi tri
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    //Them 1 phan tu moi vao dau danh sach
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    //lay 1 phan tu tu vi tri trong danh sach
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //in cac phan tu trong danh sach
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
