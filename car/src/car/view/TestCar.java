
package car.view;

import car.controller.CarController;
import car.model.car;
import java.sql.SQLException;
import java.util.Scanner;


public class TestCar {

    public static void main(String[] args) throws SQLException {
        
        Scanner input = new Scanner(System.in);
        int mainMenu;
         CarController CarCtrl = new CarController();
         
         try {
            CarCtrl.connectCarShowRoom("org.apache.derby.jdbc.EmbeddedDriver",
                    "jdbc:derby://localhost:1527/CarShowroom", "mycar", "mycar");
            CarCtrl.selectAllCars("select * from carshowroom");
        } catch (ClassNotFoundException cf) {
            System.out.println(cf);
            
        } catch (SQLException sql) {
            System.out.println(sql);
        
        }
        
      
            
        
        System.out.println("----|Northpole911 usedcar showroom|----");
        System.out.println("*********-|Main Menu|-*********");
        System.out.println("1.- Insert Car Detail");
        System.out.println("2.- Change Car Engine");
        System.out.println("3.- Delete Car Detail");
        System.out.println("4.- Search Car ByCarId");
        System.out.println("0.- Exit   The Program");
        System.out.println("Please Select Menu");
      
        mainMenu=input.nextInt();
        
        while (mainMenu !=0) {
            
            if (mainMenu == 1) {
                car carDetail = new car();
                System.out.println("carId");
                carDetail.setCarId(input.nextInt());
                
                System.out.println("engineCC");
                carDetail.setEngineCC(input.nextInt());
                
                System.out.println("model");
                carDetail.setModel(input.next());
                
                System.out.println("brand");
                carDetail.setBrand(input.next());
                
                System.out.println("fuelType");
                carDetail.setFuelTypes(input.next());
                
                System.out.println("engineType");
                carDetail.setEngineTypes(input.next());
                
                System.out.println("horsePower");
                carDetail.setHorsePower(input.nextInt());
                CarCtrl.insertCarDetail(carDetail);
                
            }else if(mainMenu == 2){
                car carDetail = new car();
                System.out.println("-----|Car Engine Swap System|----");
                System.out.println("Please Input Your CarID");
                carDetail.setCarId(input.nextInt());
                System.out.println("Please Input Your newEngine");
                carDetail.setEngineTypes(input.next());
                CarCtrl.changeCarEngineType(carDetail);
                
            }else if(mainMenu == 3){
                      car carDetail = new car();
                      System.out.println("Please Input Your CarID");
                      carDetail.setCarId(input.nextInt());
                      CarCtrl.deleteCarDetail(carDetail);
                
            }else if(mainMenu == 4){
                      car carDetail = new car();
                      System.out.println("Please Input Your CarID");
                      carDetail.setCarId(input.nextInt());
                      CarCtrl.findCarById(carDetail);
            }
            
                
               
                 
        System.out.println("*********-|Main Menu|-*********");
        System.out.println("1.- Insert Car Detail");
        System.out.println("2.- Change Car Engine");
        System.out.println("3.- Delete Car Detail");
        System.out.println("4.- Search Car ByCarId");
        System.out.println("0.- Exit   The Program");
        System.out.println("-----|Please Select Menu|-----");
         
        mainMenu=input.nextInt();
       
                
        }
        System.out.println("-----|Car in Showroom|-----");
        CarCtrl.selectAllCars("select * from carshowroom");
           
           
    }
}
    

