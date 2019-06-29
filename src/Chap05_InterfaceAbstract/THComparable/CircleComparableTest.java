package Chap05_InterfaceAbstract.THComparable;

import java.util.Arrays;

public class CircleComparableTest {
    
    public static void main(String[] args) {
        CircleComparable[] circleComparables = new CircleComparable[3];
        circleComparables[0] = new CircleComparable(3.0);
        circleComparables[1] = new CircleComparable();
        circleComparables[2] = new CircleComparable(4.0, "red", true);
        
        System.out.println("-----Before--------");
        for (CircleComparable circleComparable : circleComparables) {
            System.out.println(circleComparable);
        }
        
        System.out.println("-----After--------");
        Arrays.sort(circleComparables);
        for (CircleComparable circleComparable : circleComparables) {
            System.out.println(circleComparable);
        }
    }
}
