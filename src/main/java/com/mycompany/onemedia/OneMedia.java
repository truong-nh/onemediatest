/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.onemedia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */


public class OneMedia {

    public static void main(String[] args) {
        Book b= new Book("Kim Dong", "Nguyen Hong Truong", "Truyen tranh", "BBVNR","Bay vien ngoc rong", 30000, 50000, 10, "kho");
        Book c= new Book("Bach Khoa", "Trinh Thanh Trung", "Lap trinh", "BLTHDT","Lap trinh huong doi tuong", 100000, 150000, 5, "cua hang");

//        Book.searchProduct"BLTHDT");
//        Book.searchProduct("1111");
          Book.managerEditProduct("Kim Dong", "Nguyen Hong Truong", "truyen tranh", "BBVNR", "Bay vien ngoc rong", 30000, 60000, 20, "cua hang");
//          Book.staffEditProduct("BBVNR",40 );
        for(Book i: Book.getListBook() ){
            i.displayManager();
            i.displayStaff();
        }
        


       }
}
