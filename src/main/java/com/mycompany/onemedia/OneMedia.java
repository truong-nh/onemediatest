/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.onemedia;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class OneMedia {

    public static void select() {
        System.out.println("Danh sach cac chuc nang");
        System.out.println("select 0: Ket thuc ");
        System.out.println("select 1: Tim kiem san pham");
        System.out.println("select 2: Nhap vao kho san pham");
        System.out.println("select 3: Chinh sua san pham");

    }

    public static void main(String[] args) {
        Book b = new Book("Kim Dong", "Nguyen Hong Truong", "Truyen tranh", "BBVNR", "Bay vien ngoc rong", 30000, 50000, 10, "nha kho");
        Book c = new Book("Bach Khoa", "Trinh Thanh Trung", "Lap trinh", "BLTHDT", "Lap trinh huong doi tuong", 100000, 150000, 5, "cua hang");

        int select=100 ;
        do {

            Scanner sc = new Scanner(System.in);
            select();
            try {
                
                System.out.println("-------------------------------------");
                System.out.print("Chon chuc nang:");
                select = sc.nextInt();

            } catch (InputMismatchException ex) {
                System.out.println("Nhap gia tri ko hop le");
                select=100;
            } catch (Exception e) {
                e.printStackTrace();
                select=100;
            }

            switch (select) {
                case 1:
                    BookService.searchProduct();
                    break;
                case 2:
                    BookService.addProduct();
                    break;
                case 3:
                    BookService.managerEditProduct();
                    break;
            }
            System.out.println("-------------------------------------");

        } while (select != 0);

    }
}
