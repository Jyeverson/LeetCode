package JAVA;

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
