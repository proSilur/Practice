package fourth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by George on 04.08.2016.
 */
public class Perestanovki {
    public static void main(String[] arg) {
        int[] a = { 0, 1, 2, 3, 4,6,7,8 };
        boolean flag = true;
        int i = 0;
        int j = 0;
        int var = 0;
        long t = System.currentTimeMillis();
        for (; flag;) {
            printmass(a);
            var++;
            i = findminI(a);
            j = findminJ(a, a[i]);
            if (j != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                inverse(a, i + 1);
            } else {
                flag = false;
            }

        }
        System.out.println(System.currentTimeMillis() - t + " ms");
        System.out.println("Perestanovok = " + var);
    }

    static int findminI(int[] a) {
        int i = 0;
        for (int j = a.length - 1; j > 0; j--) {
            if (a[j] > a[j - 1]) {
                i = j - 1;
                break;
            }
        }
        return i;
    }

    static int findminJ(int[] a, int mini) {
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] > mini) {
                return i;
            }
        }
        return 0;
    }

    static void inverse(int[] a, int start) {
        Arrays.sort(a, start, a.length);
    }

    static void printmass(int[] a) {
        for (int b : a) {
            System.out.print(b + "  ");
        }
        System.out.println();
    }
}
