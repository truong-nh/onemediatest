/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onemedia;

import java.util.Date;
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
        System.out.print("Nhap ma san pham muon tim kiem: ");
        String code = sc.nextLine();
        try {
            Book.searchProduct(code).displayManager();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("San pham ko ton tai");
        }
    }

    public static void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham muon them: ");
        String code = sc.nextLine();
        try {
            if (Book.searchProduct(code) == null) {
                System.out.print("publisher(nha xuat ban): ");
                String publisher = sc.nextLine();
                
                
                System.out.print("author(tac gia) : ");
                String author = sc.nextLine();
                
               
                System.out.print("category(the loai) : ");
                String category = sc.nextLine();
                
               
                System.out.print("name(ten san pham): ");
                String name = sc.nextLine();
                
                
                System.out.print("purchasePrice(gia nhap) : ");
                int purcharPrice = sc.nextInt();
                
               
                System.out.print("salePrice(gia ban) : ");
                int salePrice = sc.nextInt();
                
                
                System.out.print("remaining(so luong) : ");
                int remaining = sc.nextInt();
                
               
                System.out.print("productPlacement(noi de san pham) : ");
                String productPlacement = sc.nextLine();

                Book b = new Book(publisher, author, category, code, name, purcharPrice, salePrice, remaining, productPlacement);
            } else {
                    System.out.println("------San pham da ton tai------");
                    Book.searchProduct(code).displayManager();
                try {
                    System.out.print("Nhap so luong san pham muon them: ");
                    int number = sc.nextInt();
                    Book.searchProduct(code).setRemaining(number + Book.searchProduct(code).getRemaining());
                    Book.searchProduct(code).setUpdateDate(new Date());
                } catch (Exception e) {
                    System.out.println("Dien thong tin khong hop le");
                }

            }

        } catch (Exception e) {
            System.out.println("Dien thong tin khong hop le");
        }
    }

    public static void managerEditProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham muon chinh sua: ");
        String code = sc.nextLine();
        try {
            if (Book.searchProduct(code) != null) {
                System.out.println("publisher(nha xuat ban): " +Book.searchProduct(code).getPublisher() );
                System.out.print("publisher(nha xuat ban): ");
                String publisher = sc.nextLine();
                
                System.out.println("author(tac gia): " +Book.searchProduct(code).getAuthor() );
                System.out.print("author(tac gia) : ");
                String author = sc.nextLine();
                
                System.out.println("category(the loai): " +Book.searchProduct(code).getCategory() );
                System.out.print("category(the loai) : ");
                String category = sc.nextLine();
                
                System.out.println("name(ten san pham): " +Book.searchProduct(code).getName() );
                System.out.print("name(ten san pham) : ");
                String name = sc.nextLine();
                
                System.out.println("purchasePrice(gia nhap): " +Book.searchProduct(code).getPurchasePrice() );
                System.out.print("purchasePrice(gia nhap) : ");
                int purcharPrice = sc.nextInt();
                
                System.out.println("salePrice(gia ban) " +Book.searchProduct(code).getSalePrice() );
                System.out.print("salePrice(gia ban) : ");
                int salePrice = sc.nextInt();
                
                System.out.println("remaining(so luong): " +Book.searchProduct(code).getRemaining() );
                System.out.print("remaining(so luong) : ");
                int remaining = sc.nextInt();
                
                System.out.println("productPlacement(noi de san pham): " +Book.searchProduct(code).getProductPlacement() );
                System.out.print("productPlacement(noi de san pham) : ");
                String productPlacement = sc.nextLine();              
                
                Book.searchProduct(code).setUpdateDate(new Date());
                Book.managerEditProduct(publisher, author, category, code, name, purcharPrice, salePrice, remaining, productPlacement);
                     
            } else {
                System.out.println("San pham chua ton tai");
            }

        } catch (Exception e) {
            System.out.println("Dien thong tin khong hop le");
        }
    }

}
