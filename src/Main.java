import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] weight = new int [12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for(int i = 0; i < weight.length; i++) {
            System.out.printf((weight[i]) + ", ");
        }
        System.out.println(" ");
        for(int i1 = weight.length-1; i1 >=0; i1--) {
            System.out.printf((weight[i1]) + ", ");
        }
        System.out.println(" ");

        double [] weight2 = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i2 = 0; i2 < weight2.length; i2++) {
            System.out.printf((weight2[i2]) + ", ");
        }
        System.out.println(" ");

            for(int i22 = weight2.length-1; i22 >=0; i22--){
            System.out.printf((weight2[i22])+", ");
        }

        System.out.println(" ");

        int[] cats = {4, 8, 9, 5, 0, 0, 0, 4, 0, 0, 11, 0, 0};
        for(int i3 = 0; i3 < cats.length; i3++) {
            System.out.printf(cats[i3]+", ");
        }
        System.out.println(" ");

        for(int i4 = cats.length-1; i4 >= 0; i4-- ) {
            System.out.printf(cats[i4] + ", ");
        }
        System.out.println(" ");

        int[] arr = {1, 2, 3};
            for(int i5 = 0; i5<arr.length; i5++) {
               if (arr[i5] % 2 == 0) {

               }else {
                   arr[i5] += 1;
               }
                    System.out.printf((arr[i5]) + ", ");
                }
    }
}