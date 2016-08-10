package fourth;

/*
 2) Число-палиндром с обеих сторон (справа налево и слева направо)
 читается одинаково. Самое большое число-палиндром, полученное
 умножением двух двузначных чисел – 9009 = 91 × 99.
 Найдите самый большой палиндром, полученный умножением двух
 трехзначных чисел. (4 часа)
 */

public class Palindrome {
    public static void main(String[] args) {
        //Вычисляет палиндром из произведения любых чисел, по этому немного длиннее методы
        System.out.println(palindrome(999, 999));
        System.out.println(palindrome(9999, 99999));
    }

    static String palindrome(int a, int b) {
        int palindrome = 0;
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int x = 0;
        int y = 0;
        for (int i = a; i > 0; i--) {
            if (i * i < palindrome) break;
            for (int j = b; j > 0; j--) {
                if (isPalindrome(i * j)) {
                    if (i * j < palindrome) break;
                    palindrome = i * j;
                    x = i;
                    y = j;
                }
            }
        }
        return palindrome + " is maximum palindrome of numbers " + x + " and " + y;
    }

    static boolean isPalindrome(int value) {
        char[] array = String.valueOf(value).toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
