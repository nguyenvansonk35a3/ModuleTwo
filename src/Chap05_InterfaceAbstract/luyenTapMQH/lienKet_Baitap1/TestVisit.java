package Chap05_InterfaceAbstract.luyenTapMQH.lienKet_Baitap1;

public class TestVisit {

    public static void main(String[] args) {
        Visit visit = new Visit("Son", "30/6/2019");
        visit.setProductExpense(100);
        visit.setServiceExpense(150);

        System.out.println(visit);

    }
}
