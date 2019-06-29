package Chap02_Array_Method.TH;

public class CharXuatHienString {

    public static void main(String[] args) {
        String str = "NguyenVanSon";
        char ch = str.charAt(5);  // tra ve ki tu o vi tri thu i trong vhuoi
        System.out.println("so lan xuat hien cua ky tu " + ch + " trong chuoi la: " + dem(str, ch));

    }

    public static int dem(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
