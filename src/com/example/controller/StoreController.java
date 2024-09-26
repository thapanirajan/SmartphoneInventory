/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controller;

import java.util.ArrayList;
import java.util.Scanner;
import com.example.model.SmartphoneInventoryModel;
import java.util.Iterator;
/**
 *
 * @author thapa
 */
public class StoreController {
   private ArrayList<SmartphoneInventoryModel> inventoryList;
   
   
   public StoreController(ArrayList<SmartphoneInventoryModel> inventoryList){
       this.inventoryList = inventoryList;
   }
   
   public void addNewProduct() {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter model code: ");
       String modelCode = sc.nextLine();
       
       System.out.println("Enter iphone Stock: ");
       int iphoneStock = sc.nextInt();
       
       System.out.println("Enter Samsung stock: ");
       int samsungStock = sc.nextInt();
       
       System.out.println("Enter Google Pixel Stock:");
       int googlePixelStock = sc.nextInt();

       System.out.println("Enter OnePlus Stock:");
       int onePlusStock = sc.nextInt();

       System.out.println("Enter Huawei Stock:");
       int huaweiStock = sc.nextInt();

       System.out.println("Enter Xiaomi Stock:");
       int xiaomiStock = sc.nextInt();
       
       SmartphoneInventoryModel newProduct = new SmartphoneInventoryModel(modelCode,iphoneStock,samsungStock,googlePixelStock,onePlusStock,huaweiStock,xiaomiStock);
       inventoryList.add(newProduct);
       
       System.out.println("New Products added Successfully");
   }
   
   public void deleteProduct(String modelCode) {
       Iterator<SmartphoneInventoryModel> iterator = inventoryList.iterator();
       boolean found = false;
       
       while(iterator.hasNext()){
           SmartphoneInventoryModel product =  iterator.next();
           if(product.getModelCode().equals(modelCode)){
               iterator.remove();
               System.out.println("Product deleted successfully.");
               found = true;
               break;
           }
       }
       
       if (!found) {
           System.out.println("product with the given model code not found.");
       }
   }
   
   
   public void updateProduct(String modelCode) {
       Scanner sc = new Scanner(System.in);
       boolean found = false;
       
       for (SmartphoneInventoryModel product : inventoryList) {
           if (product.getModelCode().equals(modelCode)) {
               System.out.println("Enter updated iPhone Stock: ");
               product.setIphoneStock(sc.nextInt());
               
               System.out.println("Enter updated Samsung Stock:");
               product.setSamsungStock(sc.nextInt());

               System.out.println("Enter updated Google Pixel Stock:");
               product.setGooglePixelStock(sc.nextInt());

               System.out.println("Enter updated OnePlus Stock:");
               product.setOnePlusStock(sc.nextInt());

               System.out.println("Enter updated Huawei Stock:");
               product.setHuaweiStock(sc.nextInt());

               System.out.println("Enter updated Xiaomi Stock:");
               product.setXiaomiStock(sc.nextInt());
               
               System.out.println("Product updated Successfully ");
               found = true;
               break;
           }
       }
       
       if (!found) {
           System.out.println("Product with the given model code not found.");
       }
   }
    public void getSmartphoneInfo(String modelCode) {
           boolean found = false;
           for (SmartphoneInventoryModel product : inventoryList) {
               if (product.getModelCode().equals(modelCode)) {
                   System.out.println(product);
                   found = true;
                   break;
               }
           }
           
           if(!found) {
               System.out.println("Product with the given model code not found.");
           }
       }
}
