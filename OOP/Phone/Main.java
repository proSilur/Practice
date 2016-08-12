package OppOne.phone;


public class Main {
    public static void main(String[] args) {
        Phone vasia = new Phone("067-480-97-93");
        Phone petya = new Phone("067-480-97-91");
        Phone masha = new Phone("067-480-97-31");

        vasia.saveContact(petya.getNumber(), "Petya");
        vasia.saveContact(masha.getNumber(), "Masha");
        vasia.saveContact("067-999-99-99", "Johnny");
//        vasia.deleteContact("Johnny");


//      Существующему абоненту можно дозвонится а можно и не дозвонится, результат разный

//        Звоним Пете
        vasia.call(petya.getNumber());
//        Звоним Маше
        vasia.call(masha.getNumber());

//        Звоним на существующий номер
        vasia.call("063-333-33-34");

//        Звоним Johnny которого нет в базе
        vasia.call("067-999-99-99");

//        Неправильный номер
        vasia.call("067-480-97200");


//        vasia.showPhoneBook();
//        petya.showPhoneBook();
//        masha.showPhoneBook();

//        Тут можно глянуть всю базу номеров
//        Network network = new Network();
//        System.out.println(network.toString());

    }
}
