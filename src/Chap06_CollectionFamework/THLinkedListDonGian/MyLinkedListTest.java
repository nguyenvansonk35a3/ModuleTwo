package Chap06_CollectionFamework.THLinkedListDonGian;

public class MyLinkedListTest {

    public static void main(String[] args) {
        System.out.println("------TESTING----------");
        MyLinkedList myLinkedList = new MyLinkedList("Son");
        myLinkedList.addFirst("Van");
        myLinkedList.addFirst("Nguyen");

        myLinkedList.printList();

        System.out.println("");

        myLinkedList.add(-1, "First");
        myLinkedList.add(2, "2");

        myLinkedList.printList();

    }
}
