package Chap06_CollectionFamework.THListDonGian;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;                               //xac dinh so phan tu trong danh sach
    private static final int DEFAULT_CAPACITY = 10;     //Luu so phan tu toi da trong  danh sach
    private Object[] elements;                           //Mang doi tuong, chua cac phan tu trong danh sach 

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Thay doi kich thuoc mang
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //Them phan tu vao danh sach
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    //truy cap 1 phan tu trong danh sach, tra ve phan tu vua o vi tri thu i trong danh sach
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + i);
        }
        return (E) elements[i];
    }

}
