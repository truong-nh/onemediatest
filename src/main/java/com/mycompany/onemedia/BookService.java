/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onemedia;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BookService {

    public BookService() {
    }

    public static void searchProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        String code = sc.next();
        System.out.println(code);
        try {
            Book.searchProduct(code).displayManager();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("San pham ko ton tai");
        }
    }

    public static void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham muon them: ");
        String code = sc.next();
        try {
            if (Book.searchProduct(code) == null) {
                System.out.println("publisher: ");
                String publisher = sc.next();

                System.out.println("author : ");
                String author = sc.next();

                System.out.println("category : ");
                String category = sc.next();

                System.out.println("name : ");
                String name = sc.next();

                System.out.println("purchasePrice : ");
                int purcharPrice = sc.nextInt();

                System.out.println("salePrice : ");
                int salePrice = sc.nextInt();

                System.out.println("remaining : ");
                int remaining = sc.nextInt();

                System.out.println("productPlacement : ");
                String productPlacement = sc.next();

                Book b = new Book(publisher, author, category, code, name, purcharPrice, salePrice, remaining, productPlacement);
            } else {
                System.out.println("San pham da ton tai");
            }

        } catch (Exception e) {
            System.out.println("Dien thong tin khong hop le");
        }
    }

    public static void managerEditProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham muon chinh sua: ");
        String code = sc.next();
        try {
            if (Book.searchProduct(code) != null) {
                System.out.println("publisher: ");
                String publisher = sc.next();

                System.out.println("author : ");
                String author = sc.next();

                System.out.println("category : ");
                String category = sc.next();

                System.out.println("name : ");
                String name = sc.next();

                System.out.println("purchasePrice : ");
                int purcharPrice = sc.nextInt();

                System.out.println("salePrice : ");
                int salePrice = sc.nextInt();

                System.out.println("remaining : ");
                int remaining = sc.nextInt();

                System.out.println("productPlacement : ");
                String productPlacement = sc.next();

                Book.managerEditProduct(publisher, author, category, code, name, purcharPrice, salePrice, remaining, productPlacement);

            } else {
                System.out.println("San pham chua ton tai");
            }

        } catch (Exception e) {
            System.out.println("Dien thong tin khong hop le");
        }
    }
    
    
}
