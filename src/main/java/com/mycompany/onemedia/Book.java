/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onemedia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Book extends Product{
    private String publisher;
    private String author;
    private String category;
    private static List<Book> books=new ArrayList<>() ;
        

    public Book(String publisher, String author, String category, String code, String name, long purchasePrice, long salePrice, int remaining, String productPlacement) {
        super(code, name, purchasePrice, salePrice, remaining, productPlacement);
        this.publisher = publisher;
        this.author = author;
        this.category = category;
        books.add(this);
    }

    public static List<Book> getListBook() {
        return books;
    }
    
    
    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public void displayManager(){
        super.displayManager();
        System.out.println("Nha xuat ban: "+publisher);
        System.out.println("Tac gia : "+author);
        System.out.println("The loai: "+category);
        System.out.println("-------------------------");
    }
    
    @Override
    public void displayStaff() {
        super.displayStaff();
        System.out.println("Nha xuat ban: "+publisher);
        System.out.println("Tac gia : "+author);
        System.out.println("The loai: "+category);
        System.out.println("-------------------------");
    }
    

    public static boolean searchProduct(String code){
        boolean test = false;
        for(Book i: Book.getListBook() ){
         if( i.getCode()== code ){
             test= true;
             i.displayManager();
             return true;
         }   
      }  
        if(test==false){
        System.out.println("Khong ton tai sach");
        }
        return  test;
    }

    
    
    // chinh sua sau khi ban san pham; neu ma san pham ko ton tai hoac so luong lon hon hang ton thi tra ve true

    public static boolean staffEditProduct(String code,int number  ){
        boolean test = false;
        for(Book i: Book.getListBook() ){
         if( i.getCode()== code ){
             if(i.getRemaining()>= number){
             i.setRemaining(i.getRemaining()-number);
             return true;
             }
             else{
                 System.out.println("Khong du so luong sach");
                 return false;
             }
         }   
      }  
        if(test==false){
        System.out.println("Khong ton tai sach");
        }
        return  test;      
        
    }
    
        public static boolean managerEditProduct(String publisher, String author, String category,
    String code, String name, long purchasePrice, long salePrice, int remaining, String productPlacement){
        boolean test = false;
        for(Book i: Book.getListBook() ){
         if( i.getCode()== code ){
             test= true;
             if(publisher!=null){
             i.setPublisher(publisher);
             }
             if(author!=null){
             i.setAuthor(author);
             }
             if(category!=null){
             i.setCategory(category);
             }
             if(name!=null){
             i.setName(name);
             }           
             i.setPurchasePrice(purchasePrice);
             i.setSalePrice(salePrice);       
             i.setRemaining(remaining);
             if(productPlacement!= null){
             i.setProductPlacement(productPlacement);
             }
             i.setUpdateDate(new Date());
             return test;
         }   
      }  
        if(test==false){
        System.out.println("Khong ton tai sach");
        }
        return  test;
    }

    
}



