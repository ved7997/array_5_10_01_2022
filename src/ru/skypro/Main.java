package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание №

        int[] arrayInt = new int[]{1, 2, 3};


        double[] arrayDouble = {2.021, 2.022, 2.023};
        String[] arrayString = {"январь", "февраль", "март"};
        System.out.println();

        //Задание №2
        for (int i = 0;i < arrayInt.length;i++) {
            if (arrayInt[i] == 3){
                System.out.print(arrayInt[i]);
            }else {
                System.out.print(arrayInt[i] + ", ");
            }
        }
            System.out.println();
        for (int i = 0;i < arrayDouble.length;i++) {
            if (arrayDouble[i] == 2.023) {
                System.out.print(arrayDouble[i]);
            } else {
                System.out.print(arrayDouble[i] + ", ");
            }
        }
            System.out.println();

        for (int i = 0;i < arrayString.length;i++) {
            if (arrayString[i] == "март") {
                System.out.println(arrayString[i]);
            }else {
                System.out.print(arrayString[i] + ", ");
            }
        }
        System.out.println();

        //Задание №3
        for (int i = 2;i >= 0;i--) {
            if (arrayInt[i] == 1){
                System.out.print(arrayInt[i]);
            }else {
                System.out.print(arrayInt[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 2;i >= 0;i--) {
            if (arrayDouble[i] == 2.021) {
                System.out.print(arrayDouble[i]);
            } else {
                System.out.print(arrayDouble[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 2;i >= 0;i--) {
            if (arrayString[i] == "январь") {
                System.out.println(arrayString[i]);
            }else {
                System.out.print(arrayString[i] + ", ");
            }
        }
        System.out.println();

        //Задание №4
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 > 0) {
                System.out.print(arrayInt[i] + 1 + ", ");
            } else {
                System.out.print(arrayInt[i] + ", ");
            }
        }


    }
}
