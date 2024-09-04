package bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class Tai {
    public static ArrayList<Integer> importData(ArrayList<Integer> arrayslist) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so luong mang :");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap so thu " + (i + 1) + " la :");
            arrayslist.add(scanner.nextInt());
        }
        return arrayslist;
    }


             public static void printData(ArrayList<Integer> arrayList) {
        System.out.println("//-------------------------//");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print("so thu " + (i + 1) + " la :" + arrayList.get(i));
            System.out.println();
        }
    }
            public static int Max2(ArrayList<Integer> arrayList) {
        int max1, max2;
        if (arrayList.get(0) > arrayList.get(1)) {
            max1 = arrayList.get(0);
            max2 = arrayList.get(1);
        } else {
            max1 = arrayList.get(1);
            max2 = arrayList.get(0);
        }
        for (int i = 2; i < arrayList.size(); i++) {
            int num = arrayList.get(i);
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        return max2;
            }

            public static void deleteOddNumber(ArrayList<Integer> arrayList) {
                arrayList.removeIf(n -> n % 2 != 0);
                System.out.println("so chan la: "+ arrayList);
            }
        }
