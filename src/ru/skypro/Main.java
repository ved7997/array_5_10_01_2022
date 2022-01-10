package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание №1
        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        double[] arrayDouble = {2.021, 2.022, 2.023};
        String[] arrayString = {"январь", "февраль", "март"};
        System.out.println();

        //Задание №2
        String b = ", ";
        System.out.println(arrayInt[0] + b + arrayInt[1] + b + arrayInt[2]);
        System.out.println(arrayDouble[0] + b + arrayDouble[1] + b + arrayDouble[2]);
        System.out.println(arrayString[0] + b + arrayString[1] + b + arrayString[2]);
        System.out.println();

        //Задание №3
        String bb = ", ";
        System.out.println(arrayInt[2] + bb + arrayInt[1] + bb + arrayInt[0]);
        System.out.println(arrayDouble[2] + bb + arrayDouble[1] + bb + arrayDouble[0]);
        System.out.println(arrayString[2] + bb + arrayString[1] + bb + arrayString[0]);
        System.out.println();

        //Задание №4
        for (int i = 0; i < arrayInt.length; i++)
            if (arrayInt[i] % 2 > 0){
            System.out.print(arrayInt[i] +1 + ", ");
            }else {
                System.out.print(arrayInt[i] + ", ");
            }



    }
}
