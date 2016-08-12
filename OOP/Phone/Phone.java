package OppOne.phone;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Phone {
    private Network network = new Network();
    //Телефонная книга расчитана на 100 номеров
    private String[] phoneBookNumbers = new String[100];
    private String[] phoneBookNames = new String[phoneBookNumbers.length];
    private String number;
    private String name;

    public Phone() {
    }

    public Phone(String number) {
        this.number = number;
        //Регистрация номера в сети происходит во время Активации
        register();
        //Сразу добавляется свой номер телефона в записную книжку
        phoneBookNumbers[0] = getNumber();
        phoneBookNames[0] = "My Number";
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
        phoneBookNumbers[0] = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        phoneBookNames[0] = name;
    }

    private void register() {
        if (!check(getNumber())) {
            System.out.println("Неверный формат номера");
            return;
        }
        network.registerNumber(getNumber());
    }

    public void saveContact(String number, String name) {
        if (!check(number)) {
            System.out.println("Неверный формат номера");
            return;
        }
        for (int i = 0; i < phoneBookNumbers.length; i++) {
            if (phoneBookNumbers[i] == null) {
                phoneBookNumbers[i] = number;
                phoneBookNames[i] = name;
                break;
            }
        }
    }

    public void deleteContact(String name) {
        for (int i = 0; i < phoneBookNames.length; i++) {
            if (name.equals(phoneBookNames[i])) {
                phoneBookNumbers[i] = null;
                phoneBookNames[i] = null;
            }
        }
    }

    public void showPhoneBook() {
        for (int i = 0; i < phoneBookNumbers.length; i++) {
            if (phoneBookNumbers[i] != null) {
                System.out.println(phoneBookNames[i] + " " + phoneBookNumbers[i]);
            }
        }
    }

    public void call(String number) {
        if (!check(number)) {
            System.out.println("Неверный формат номера");
            return;
        }
        if (!network.isNumberExist(number)) {
            System.out.println("Такого номера не существует");
            return;
        }
        for (int i = 0; i < phoneBookNumbers.length; i++) {
            if (number.equals(phoneBookNumbers[i])) {
                System.out.println(phoneBookNames[i] + isOnline());
                return;
            }
        }
        if (network.isNumberExist(number)) {
            System.out.println("Неизвестный абонент" + isOnline());
        }
    }

    private String isOnline() {
        int online = new Random().nextInt(3);
        if (online == 0) return " взял(a) трубку";
        if (online == 1) return " разговаривает, перезвоните позже.";
        return " вне зоны доступа :(";
    }

    //Проверка номера на валидность "999-999-99-99"
    private boolean check(String number) {
        Pattern pattern = Pattern.compile("^[0-9]{3}[-][0-9]{3}[-][0-9]{2}[-][0-9]{2}$");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}