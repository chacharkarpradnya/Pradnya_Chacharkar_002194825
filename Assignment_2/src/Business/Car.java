/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Pradnya
 */
public class Car {
    
    private boolean avb;
    private String brnd;
    private int manacyear;
    private int minSeating;
    private int maxSeating;
    private int serialNo;
    private String modelNo;
    private String availbilityCity;
    private boolean maint_cert;
    private Date CreatOn;

    public Date getCreatOn() {
        return CreatOn;
    }

   public Car(boolean available, String brand, int manyear, int min_seats, int max_seats, int serial_num, String model_num, String availble_city, boolean maintenance_certificate) {
        this.avb = available;
        this.brnd = brand;
        this.manacyear = manyear;
        this.minSeating = min_seats;
        this.maxSeating = max_seats;
        this.serialNo = serial_num;
        this.modelNo = model_num;
        this.availbilityCity = availble_city;
        this.maint_cert = maintenance_certificate;
        this.CreatOn=new Date();
                
    }

    public Car(){
        this.CreatOn=new Date();
    }
    
    public boolean isAvb() {
        return avb;
    }

    public void setAvb(boolean avb) {
        this.avb = avb;
    }

    public String getBrnd() {
        return brnd;
    }

    public void setBrnd(String brnd) {
        this.brnd = brnd;
    }

    public int getManu_year() {
        return manacyear;
    }

    public void setManacyear(int manacyear) {
        this.manacyear = manacyear;
    }

    public int getMinSeating() {
        return minSeating;
    }

    public void setMinSeating(int minSeating) {
        this.minSeating = minSeating;
    }

    public int getMaxNoseating() {
        return maxSeating;
    }

    public void setMaxSeating(int maxSeating) {
        this.maxSeating = maxSeating;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getAvailbilityCity() {
        return availbilityCity;
    }

    public void setAvailbilityCity(String availbilityCity) {
        this.availbilityCity = availbilityCity;
    }

    public boolean isMaint_cert() {
        return maint_cert;
    }

    public void setMaint_cert(boolean maint_cert) {
        this.maint_cert = maint_cert;
    }
    
    @Override
    public String toString(){
       return String.valueOf(this.brnd);
    }
    
}
