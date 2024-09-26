/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.views;
import com.example.controller.StoreController;
import com.example.model.SmartphoneInventoryModel;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author thapa
 */
public class StoreApp {
    ArrayList<SmartphoneInventoryModel> inventoryList = new ArrayList<>();
    
    public static void main(String[] args) {
        StoreApp app = new StoreApp();
        StoreController controller = new StoreController(app.inventoryList);
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add New Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Update Product");
            System.out.println("4. Get Smartphone Info");
            System.out.println("5. Exit");
            
            System.out.println("Choose a option ");
            int option = sc.nextInt();
            sc.nextLine();
            
            switch(option){
                case 1:
                    controller.addNewProduct();
                    break;
                case 2:
                    System.out.println("Enter model code: ");
                    String deleteCode = sc.nextLine();
                    controller.deleteProduct(deleteCode);
                    break;
                    
                case 3:
                    System.out.println("Enter model code: ");
                    String updateCode = sc.nextLine();
                    controller.updateProduct(updateCode);
                    break;
                    
                case 4:
                    System.out.println("Enter model code: ");
                    String productCode = sc.nextLine();
                    controller.getSmartphoneInfo(productCode);
                    break;
                    
                case 5:
                    System.out.println("Exiting ......  ");
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid option . Please try again. ");
            }
        }
    }
}
