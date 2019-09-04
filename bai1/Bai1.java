/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.IOException;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try ( // TODO code application logic here
               /* int a,b;
        System.out.println("Nhập giá trị a ,b");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Tổng hai số là = " +(a+b));
        System.out.println((a>b) && (a!=b));// trả về true or false
        // các lớp trong Math
        int x = 90;
        double x1 = Math.toRadians(x);// chuyển sang radian
        System.out.println(x1);
        int a = 10;
        System.out.println(Math.abs(a));*/
        int[] a = new int[100];
        System.out.print("Nhập số phần tử của mảng : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        nhap(n, a);
        max_min(n, a);
        xuat(n, a);
        arr_ascend(n, a);
        System.out.print("\n");
        xuat(n, a);
                
        }

    }

    public static void arr_ascend(int n, int a[]) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void nhap(int n, int a[]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = input.nextInt();
        }
    }

    public static void xuat(int n, int a[]) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "   ");
        }
    }

    public static void max_min(int n, int a[]) {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("GTLN = " + max);
    }

}
