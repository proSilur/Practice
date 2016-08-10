package fourth;

/*
 5) Напишите метод который вернет количество слов в строке текста.
 */

public class WordsCounter {
    public static void main(String[] args) {
        String someLine = "Карл у Клары украл доллары";
        System.out.println(counter(someLine));
    }

    static int counter(String line) {
        String[] array = line.split("[ ]");
        return array.length;
    }
}
