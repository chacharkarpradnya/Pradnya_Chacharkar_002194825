/*
 * 
o change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;
;
 /*
 * @author Pradnya
 */
public class CarModelList {
    
   // private static CarInformationList carLists;
    private ArrayList<Car> listCar;
    private ArrayList<Car> ListMfg;

    public ArrayList<Car> getListMfg() {
        return ListMfg;
    }

    public void setListMfg(ArrayList<Car> ListMfg) {
        this.ListMfg = ListMfg;
    }
    public CarModelList(){
        this.listCar = new ArrayList<>();
        
        Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true);
        Car car2 = new Car(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true);
        Car car4 = new Car(true, "GM", 2018, 1, 4, 4, "G1", "New York", true);
        Car car5 = new Car(true, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", true);
        Car car6 = new Car(true, "GM", 2017, 1, 4, 6, "G2", "Chicago", true);
        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "", "Seattle", true);
        Car car8 = new Car(true, "BMW", 2016, 1, 4, 8, "X2", "Seattle", true);
        Car car9 = new Car(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", true);
        Car car10 = new Car(true, "GM", 2019, 1, 4, 10, "G3", "Austin", true);
        
        listCar.add(car1);
        listCar.add(car2);
        listCar.add(car3);
        listCar.add(car4);
        listCar.add(car5);
        listCar.add(car6);
        listCar.add(car7);
        listCar.add(car8);
        listCar.add(car9);
        listCar.add(car10);
         
    }
    
    public ArrayList<Car> getListCar() {
        return listCar;
    }

    
    public void setListCar(ArrayList<Car> listCar) {
        this.listCar = listCar;
    }
    
//    private CarInformationList(){
//        
//        listCar = new ArrayList<>();
//        
//        Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true);
//        Car car2 = new Car(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true);
//        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true);
//        Car car4 = new Car(true, "GM", 2018, 1, 4, 4, "G1", "New York", true);
//        Car car5 = new Car(true, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", true);
//        Car car6 = new Car(true, "GM", 2017, 1, 4, 6, "G2", "Chicago", true);
//        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "", "Seattle", true);
//        Car car8 = new Car(true, "BMW", 2016, 1, 4, 8, "X2", "Seattle", true);
//        Car car9 = new Car(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", true);
//        Car car10 = new Car(true, "GM", 2019, 1, 4, 10, "G3", "Austin", true);
//        
//        listCar.add(car1);
//        listCar.add(car2);
//        listCar.add(car3);
//        listCar.add(car4);
//        listCar.add(car5);
//        listCar.add(car6);
//        listCar.add(car7);
//        listCar.add(car8);
//        listCar.add(car9);
//        listCar.add(car10);
//        
//    }

 public Car addCar(){
     Car car = new Car();
     listCar.add(car);
     return car;
 }
  
 
 public void deleteCar(Car car){
     listCar.remove(car);
 }
 
 
 public ArrayList<Car> getMfgList(int manufactured_year){
      ArrayList<Car> mfglist = new ArrayList<>();
     for(Car car : listCar){
            if(car.getManu_year()== manufactured_year){
                mfglist.add(car);
 }
     }return mfglist;
 }
  /*  public Car searchCarByManufacturingDate(int manufactured_year) {
        ArrayList<Car> mfglist = new ArrayList<>();
        for(Car car : listCar){
            if(car.getManufactured_year()== manufactured_year){
                mfglist.add(car);
                return car;
            }
        }return null;
    }*/

 
 
  public ArrayList<Car> getSerialList(int serial_num){
      ArrayList<Car> mfglist = new ArrayList<>();
     for(Car car : listCar){
            if(car.getSerialNo()== serial_num){
                mfglist.add(car);
 }
     }return mfglist;
 }
 
     public ArrayList<Car> getBrandList(String brand){
      ArrayList<Car> brandlist = new ArrayList<>();
     for(Car car : listCar){
            if(car.getBrnd().equals(brand)){
                brandlist.add(car);
 }
     }return brandlist;
 }

     
     public ArrayList<Car> getModelList(String model_number){
      ArrayList<Car> modellist = new ArrayList<>();
     for(Car car : listCar){
            if(car.getModelNo().equals(model_number)){
                modellist.add(car);
 }
     }return modellist;
 }
     
     public ArrayList<Car> getMaintainanceCertificate(){
         
         ArrayList<Car> maintainanceList = new ArrayList<>();
         for(Car car: listCar){
             if(car.isMaint_cert() == false)
                 maintainanceList.add(car);
         }return maintainanceList;
     }
     
    
    
   public ArrayList<Car> getAvailableCarsbyCity(String availble_city){
       ArrayList<Car> availablecity = new ArrayList<>();
       for(Car car: listCar){
           if(car.getAvailbilityCity().equals(availble_city) && car.isAvb()==true)
               availablecity.add(car);
           
       }return availablecity;
   }
    
       public ArrayList<Car> getTotalAvailable(){
               ArrayList<Car> totalavailable = new ArrayList<>();
              
               for(Car car: listCar){
                   if(car.isAvb()==true)
                       totalavailable.add(car);
                   
                  
                   
               }return totalavailable;
              
       
}
       
       
        public ArrayList<Car> getTotalUnAvailable(){
               ArrayList<Car> totalUnavailable = new ArrayList<>();
              
               for(Car car: listCar){
                   if(car.isAvb()==false)
                       totalUnavailable.add(car);
                   
                  
                   
               }return totalUnavailable;
       
       
}

        public ArrayList<Car> getFirstAvailable(){
        ArrayList<Car> fisrtAvailable=new ArrayList<>();
        
        for(Car car: listCar){
            if(car.isAvb()==true)
                fisrtAvailable.add(car);
                break;
        }return fisrtAvailable;
        }
        
        
        
        public ArrayList<Car> getMaxMinList(int max_seats, int min_seats){
            ArrayList<Car> maxminList = new ArrayList<>();
            for(Car car : listCar){
                if(car.getMaxNoseating()<=max_seats && car.getMinSeating()>=min_seats){
                maxminList.add(car);
            }
            }  return maxminList;
        }

       
       public ArrayList<String> getAllBrands(){
           ArrayList<String> allbrands = new ArrayList<>();
           for(Car car: listCar){
               
               if(car.getBrnd()!="")
               allbrands.add(car.getBrnd());
           }
           return allbrands;
       }
       


}