/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

/**
 *
 * @author thapa
 */
public class SmartphoneInventoryModel {
    private String modelCode;
    private int iphoneStock;
    private int samsungStock;
    private int googlePixelStock;
    private int onePlusStock;
    private int huaweiStock;
    private int xiaomiStock;
    
    // Constructor
    public SmartphoneInventoryModel(String modelCode, int iphoneStock, int samsungStock, int googlePixelStock, int onePlusStock, int huaweiStock, int xiaomiStock){
        this.modelCode = modelCode;
        this.iphoneStock = iphoneStock;
        this.samsungStock = samsungStock;
        this.googlePixelStock = googlePixelStock;
        this.onePlusStock = onePlusStock;
        this.huaweiStock = huaweiStock;
        this.xiaomiStock = xiaomiStock;
    }
    
    //  Getter and setters for each model
    public String getModelCode() {
        return modelCode;
    }
    
    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }
    
    public int getIphoneStock(){
        return iphoneStock;
    }
    
    public void setIphoneStock(int iphoneStock){
        this.iphoneStock = iphoneStock;
    }
    
       public int getSamsungStock() {
        return samsungStock;
    }

    public void setSamsungStock(int samsungStock) {
        this.samsungStock = samsungStock;
    }

    public int getGooglePixelStock() {
        return googlePixelStock;
    }

    public void setGooglePixelStock(int googlePixelStock) {
        this.googlePixelStock = googlePixelStock;
    }

    public int getOnePlusStock() {
        return onePlusStock;
    }

    public void setOnePlusStock(int onePlusStock) {
        this.onePlusStock = onePlusStock;
    }

    public int getHuaweiStock() {
        return huaweiStock;
    }

    public void setHuaweiStock(int huaweiStock) {
        this.huaweiStock = huaweiStock;
    }

    public int getXiaomiStock() {
        return xiaomiStock;
    }

    public void setXiaomiStock(int xiaomiStock) {
        this.xiaomiStock = xiaomiStock;
    }
    @Override
    public String toString() {
        return "Model Code: " + modelCode+
                "\n iPhone Stock: " +iphoneStock+
                "\n samsung stock: "+ samsungStock+
                "\n Google Pixel Stock: " + googlePixelStock +
                "\n onePlus Stock:  " + onePlusStock+
                "\n Huawei Stock: " +huaweiStock+
                "\n Xiaomi Stock: " + xiaomiStock+
                "\n";
    }
}


