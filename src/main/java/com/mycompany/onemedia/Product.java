package com.mycompany.onemedia;

import java.util.Date;

public class Product {

    private String id;// tự tạo
    private String code;
    private String name;
    private long purchasePrice;
    private long salePrice;
    private int remaining;
    private Date addDate; // là thời gian tạo
    private Date updateDate; // khởi tạo để null
    private String updater;// Khởi tạo để null
    private String productPlacement;
    private static String currentID = new String("10000");// biến toàn cục lưu trữ giá trị ID hiện tại;

    public Product(String code, String name, long purchasePrice, long salePrice, int remaining, String productPlacement) {
        this.code = code;
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.remaining = remaining;
        this.productPlacement = productPlacement;
        this.addDate = new Date();
        this.updateDate = null;
        this.updater = null;
        this.id = String.valueOf(Integer.parseInt(currentID) + 1);
        currentID = String.valueOf(Integer.parseInt(currentID) + 1);// tu dong tang ID len 1 
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public long getSalePrice() {
        return salePrice;
    }

    public int getRemaining() {
        return remaining;
    }

    public Date getAddDate() {
        return addDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public String getUpdater() {
        return updater;
    }

    public String getProductPlacement() {
        return productPlacement;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setSalePrice(long salePrice) {
        this.salePrice = salePrice;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public void setProductPlacement(String productPlacement) {
        this.productPlacement = productPlacement;
    }

    public static String getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(String currentID) {
        Product.currentID = currentID;
    }

    public void displayManager() {
        System.out.println("ID san pham:" + id);
        System.out.println("Ma san pham:  " + code);
        System.out.println("Ten san pham:  " + name);
        System.out.println("Gia nhap:  " + purchasePrice);
        System.out.println("Gia ban:  " + salePrice);
        System.out.println("So luong:  " + remaining);
        System.out.println("Thoi gian nhap san pham:  " + addDate);
        System.out.println("Thoi gian cap nhat san pham:  " + updateDate);
        System.out.println("Nguoi cap nhat: " + updater);
        System.out.println("Vi tri dat san pham:  " + productPlacement);
    }

    public void displayStaff() {
        System.out.println("ID san pham: " + id);
        System.out.println("Ma san pham: " + code);
        System.out.println("Ten san pham: " + name);
        System.out.println("Gia ban: " + salePrice);
        System.out.println("So luong: " + remaining);
        System.out.println("Vi tri dat san pham: " + productPlacement);
    }

    public static Product searchProduct(String code){
       return null;
    }
//    public static Product staffEditProduct(String code,int number  ){
//        return null;        
//    }
}
