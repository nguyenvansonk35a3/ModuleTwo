package Chap06_CollectionFamework.demo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkerList {

    public static void main(String[] args) {
        List<Integer> list_number = new LinkedList<>();      //element Object
        list_number.add(10);
        list_number.add(20);

        //hien thi- interator
        ListIterator<Integer> list_iterator = list_number.listIterator();
        //duyet va hien thi
        while (list_iterator.hasNext()) {
            System.out.println(list_iterator.next());      //next: lay ra phan tu tiep theo       
        }
    }
}
