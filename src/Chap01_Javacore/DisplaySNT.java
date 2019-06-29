package Chap01_Javacore;

public class DisplaySNT {

    public static void main(String[] args) {
        System.out.println("Hien thi cac so nguyen to <100");
        String sout = "";
        int i = 1;
        while (i <= 100) {
            int count = 0; //đếm số lượng số nguyên tố
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sout += " " + i;
            }
            i++;
        }

        // in ra
        System.out.println(sout);
    }
}
