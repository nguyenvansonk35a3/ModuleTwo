package Chap05_InterfaceAbstract.luyenTapMQH.lienKet_Baitap1;

public class Visit {

    //Khai bao quan he Visit-Customer: 1-1
    private Customer customer;

    String date;
    private double serviceExpense = 0;
    private double productExpense = 0;

    public Visit(String name, String date) {
        customer = new Customer(name);
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    //getTotal : tong chi phi
    public double getTotalExpense() {
        return getProductExpense() + getServiceExpense();
    }

    @Override
    public String toString() {
        return "Name Customer: " + customer.getName() + ", serviceExpense: " + getServiceExpense()
                + ", productExpense: " + getProductExpense() + ", Total: " + getTotalExpense();
    }

}
