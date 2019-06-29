package Chap01_Javacore;

public class Display20SNT {

    public static void main(String[] args) {
        System.out.println("dis play 20 SNT: ");
        int count = 0; //đếm số lượng số nguyên tố
        int N = 1;
        String sout = "";
        while (count <= 20) {
            int dem = 0;    //đếm các ước
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                count++;
                sout += " " + N;
            }
            N++;
        }

        // in ra
        System.out.println("20 số nguyên tố đầu tiên là: " + sout);
    }
}
