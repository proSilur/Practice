package fourth;

/*
 4) Напишите метод который реализует линейный поиск элемента в массиве
 целых чисел. Если такой элемент в массиве есть то верните его индекс,
 если нет то метод должен возвращать число - «-1»
 */
public class InlineSearch {
    public static void main(String[] args) {
        int[] someArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(search(4, someArray));
        System.out.println(search(8, someArray));
    }

    static int search(int searchValue, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }


}
