package Chap06_CollectionFamework.THListDonGian;

public class MyListTest {
    
    public static void main(String[] args) {
        /**
         * Truong hop 1: tao doi tuong listInteger chua danh sach cac so nguyen
         * Hien thi cac phan tu duoc them vao list theo vij tri va phan tu vuot
         * qua so phan tu duoc them vao
         */
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(10);
        listInteger.add(15);
        listInteger.add(20);
        listInteger.add(25);
        listInteger.add(30);
        
        System.out.println("Element 4: " + listInteger.get(4));
        System.out.println("Element 1: " + listInteger.get(1));
        System.out.println("Element 2: " + listInteger.get(2));

        //listInteger.add(9);
        //System.out.println("Element 6: " + listInteger.get(6));
        /**
         * Truong hop 2: hien thi phan tu o vi tri -1
         */
        listInteger.get(-1);
        System.out.println("Element -1: " + listInteger.get(-1));
    }
}
