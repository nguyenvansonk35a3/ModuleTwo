package Chap05_InterfaceAbstract.demoTongHop;

public class Address {

    private String street;
    private String city;
    private String post_Code;
    private String country;

    public Address(String street, String city, String post_Code, String country) {
        this.street = street;
        this.city = city;
        this.post_Code = post_Code;
        this.country = country;
    }

    public void setPost_Code(String post_Code) {
        this.post_Code = post_Code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //show thong tin
    public void AddressInfo() {
        System.out.println("Street: " + this.street + ", City: " + this.city
                + ", Pot_Code: " + this.post_Code + ", Country: " + this.country);
    }

}
