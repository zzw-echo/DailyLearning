package demo.demo0805;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] start = new int[count];
        int[] end = new int[count];

        for (int i = 0; i < count; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }








    }
}




//        for (int i = 0; i < count; i++) {
//            String input = sc.nextLine();
//            String stringArray[] = input.split(" ");
//            int num[] = new int[stringArray.length];
//            start[i] = Integer.parseInt(stringArray[1]);
//            end[i] = Integer.parseInt(stringArray[2]);
//        }


//        for (int i = 0; i < start.length; i++) {
//            System.out.print(start[i] + " ");
//        }

//        String input = sc.nextLine();
//        String stringArray[] = input.split(" ");
//        int num[] = new int[stringArray.length];
//        for (int i = 0; i < stringArray.length; i++) {
//            num[i] = Integer.parseInt(stringArray[i]);
//        }