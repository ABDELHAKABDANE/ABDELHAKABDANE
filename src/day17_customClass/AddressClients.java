package day17_customClass;

public class AddressClients {

    public static void main(String[] args) {

        Address homeAddress = new Address();
        homeAddress.buildingNumber = 1292;
        homeAddress.street = "Circle Road";
        homeAddress.city = "McLean";
        homeAddress.state = "VA";
        homeAddress.zipcode = "22102";
        System.out.println(homeAddress);

        System.out.println();

        Address officeAddress = new Address();
        officeAddress.buildingNumber = 7925;
        officeAddress.street = "Jones Branch Dr";
        officeAddress.city = "McLean";
        officeAddress.state = "VA";
        officeAddress.zipcode = "22012";
        System.out.println(officeAddress);

    }

}
