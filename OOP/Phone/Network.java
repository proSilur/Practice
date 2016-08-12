
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Network {

    private static String[] array = new String[5];
    
    //Заполняем при старте 5-ю номерами
    public Network() {
        setArray();
    }

    public boolean isNumberExist(String number) {
        for (String anArray : array) {
            if (number.equals(anArray)) return true;
        }
        return false;
    }

    private static void setArray() {
        Network.array[0] = "063-333-33-33";
        Network.array[1] = "063-333-33-34";
        Network.array[2] = "063-333-33-35";
        Network.array[3] = "063-333-33-36";
        Network.array[4] = "063-333-33-37";
    }

    public void registerNumber(String number) {
        if (array[array.length - 1] != null) {
            array = newArray();
        }
        for (int i = 0; i < array.length; i++) {
            if (check(number) && array[i] == null) {
                array[i] = number;
                break;
            }
        }
    }

    //Динамический массив
    private String[] newArray() {
        return Arrays.copyOf(Network.array, Network.array.length + 1);
    }

    //Проверка номера на валидность "999-999-99-99"
    private boolean check(String number) {
        Pattern pattern = Pattern.compile("^[0-9]{3}[-][0-9]{3}[-][0-9]{2}[-][0-9]{2}$");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Network:\n");
        for (String s : array) {
            builder.append(s).append("\n");
        }
        return String.valueOf(builder);
    }
}
