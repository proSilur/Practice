package four;


public class Address {
    private String country;
    private String city;
    private String street;

    public Address() {
    }

    @Override
    public String toString() {
        return  country + '\n' +
          city + '\n' +
          street + '\n';
    }
}
