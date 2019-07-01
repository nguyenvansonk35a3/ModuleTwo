/**
 * Lop node chua thogn tin ve 1 node trong danh sach lien ket. Lop nay thuoc lop MylinkedList
 */
package Chap06_CollectionFamework.THLinkedListDonGian;

public class Node {

    public Node next;
    public Object data;

    public Node(Object data) {
        this.data = data;
    }

    Object getData() {
        return this.data;
    }
}
