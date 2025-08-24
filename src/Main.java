import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание 1, 2
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i <= weight.length - 1; i++) {
            System.out.printf(String.valueOf(weight[i]));

            if (i < weight.length - 1) {
                System.out.printf(", ");
            }
        }
        System.out.println(" ");

        double[] weight2 = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i2 = 0; i2 <= weight2.length - 1; i2++) {
            System.out.printf(String.valueOf(weight2[i2]));

            if (i2 < weight2.length - 1) {
                System.out.printf(", ");
            }
        }

        System.out.println(" ");

        int[] cats = {4, 8, 9, 5, 0, 0, 0, 4, 0, 0, 11, 0, 0};
        for (int i3 = 0; i3 <= cats.length - 1; i3++) {
            System.out.printf(String.valueOf(cats[i3]));

            if (i3 < cats.length - 1) {
                System.out.printf(", ");
            }
        }
        System.out.println("\n\nЗадание №3");

        //Задание №3
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.printf(String.valueOf(weight[i]));

            if (i > 0) {
                System.out.printf(", ");
            }
        }
        System.out.println(" ");
        for (int i22 = weight2.length - 1; i22 >= 0; i22--) {
            System.out.printf(String.valueOf(weight2[i22]));

            if (i22 > 0) {
                System.out.printf(", ");
            }
        }

        System.out.println(" ");


        for (int i4 = cats.length - 1; i4 >= 0; i4--) {
            System.out.printf(String.valueOf(cats[i4]));

            if (i4 > 0) {
                System.out.printf(", ");
            }
        }
        System.out.println("\n\nЗадание №4");

        int[] arr = {1, 2, 3};
        for (int i5 = 0; i5 < arr.length; i5++) {
            if (arr[i5] % 2 != 0) {
                arr[i5] = arr[i5] + 1;
            }
        }
        System.out.printf(Arrays.toString(arr));

        //Часть 2
        System.out.println("\n\n\nЧасть 2\nЗадача №1");

        //Задача №1

        int[] salary2 = new int[5];
        salary2[0] = 20000;
        salary2[1] = 10000;
        salary2[2] = 5000;
        salary2[3] = 10000;
        salary2[4] = 8000;
        int sum = 0;
        for (int salary = 0; salary < salary2.length; salary++) {
            sum += salary2[salary];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("\n\nЗадача №2");

        //Задача №2
        int[] expensesWeek = {2000, 3000, 16000, 2600, 500};
        int maxExpensesWeek = -1;
        int min = 10000;
        for (final int current : expensesWeek) {
            if (current > maxExpensesWeek) {
                maxExpensesWeek = current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " +maxExpensesWeek +" рублей");

        for (final int current1 : expensesWeek) {
            if(current1 < min) {
                min = current1;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min +" рублей");

        System.out.println("\n\nЗадание №3");
        int[] mony = {10000, 2000, 5600, 3070, 7000};
        int sum2 = 0;
        for (int week = 0; week < mony.length; week++) {
                sum2 += mony[week];

        }
        sum2 = sum2/mony.length ;
        System.out.println(" Средняя сумма трат за месяц составила "+sum2+" рублей");
        System.out.println("\n\nЗадание №4\n");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int f = reverseFullName.length - 1; f >= 0; f--) {
            System.out.printf(String.valueOf(reverseFullName[f]));
        }
    }
}