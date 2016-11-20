package four;


import java.util.Arrays;

public class Person {

    private String name;
    private String surname;
    private String[] phones;
    private String[] sites;
    private Address address;

    public Person() {
    }

    @Override
    public String toString() {
        return name + '\n' +
                surname + '\n' +
                Arrays.toString(phones) + '\n' +
                Arrays.toString(sites) + '\n' +
                address;
    }
}
