
package car.controller;

import car.db.ConnectionManager;
import car.model.car;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class CarController {
    private Connection con;
    
    public void connectCarShowRoom
        (String driverClass ,String url,String username, String psw)
            throws ClassNotFoundException,SQLException{
            con=ConnectionManager.createConnection
        (driverClass, url, username, psw);
                    
     }
        
    public void closeStudentDB() throws SQLException{
        ConnectionManager.closeConnection(con);
        
    }  
    public void selectAllCars(String sql) throws SQLException{
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt("carId")+","
                            +rs.getInt("engineCC")+"cc"+","
                            +rs.getString("model")+","
                            +rs.getString("brand")+","
                            +rs.getString("fuelTypes")+","
                            +rs.getString("engineType")+","
                            +rs.getInt("horsepower")+"hp");
        }
    }
    public int insertCarDetail(car carDetail) throws SQLException {
        int insertCarDetail;
        int carId = carDetail.getCarId();
        int engineCC = carDetail.getEngineCC();
        String model = carDetail.getModel();
        String brand = carDetail.getBrand();
        String fuelTypes = carDetail.getFuelTypes();
        String engineType = carDetail.getEngineType();
        int horsePower = carDetail.getHorsePower();

        String sql = "INSERT INTO CARSHOWROOM(carId,engineCC,model, Brand,fuelTypes,engineType,horsePower) " 
           + "VALUES("+carId+","+engineCC+",'"+model+"','"+brand+"','"+fuelTypes+"','"+engineType+"',"+horsePower+")";
    
          
        Statement stmt = con.createStatement(); 
        insertCarDetail = stmt.executeUpdate(sql);
        System.out.println("Success");
        
        return insertCarDetail;
        

        
        
}
    public int changeCarEngineType (car carDetail) throws SQLException{ 
        int changeCarEngineType;
        int carId = carDetail.getCarId();
        String engineType = carDetail.getEngineType();
        String sql = "UPDATE CARSHOWROOM SET ENGINETYPE='"+engineType+"' WHERE carId="+carId;
        Statement stmt = con.createStatement();
        changeCarEngineType= stmt.executeUpdate(sql);
        System.out.println("Success");
        return changeCarEngineType; 
        
        
        
}
    public int deleteCarDetail (car carDetail) throws SQLException{ 
        int deleteCarDetail;
        int carId = carDetail.getCarId();
        int engineCC = carDetail.getEngineCC();
        String model = carDetail.getModel();
        String brand = carDetail.getBrand();
        String fuelTypes = carDetail.getFuelTypes();
        String engineType = carDetail.getEngineType();
        int horsePower = carDetail.getHorsePower();

        String sql = "DELETE FROM CARSHOWROOM where (carId) = "
                                                    +(carId); 
        Statement stmt = con.createStatement(); 
        deleteCarDetail = stmt.executeUpdate(sql);
        System.out.println("Success");
        return deleteCarDetail;
        
}
     public void findCarById(car carDetail) throws SQLException{
          ArrayList<car> carList = new ArrayList<car>();
          int carId = carDetail.getCarId();
          String sql = "SELECT * FROM CARSHOWROOM where (carId) = "
                                                    +(carId);
         
          Statement stmt = con.createStatement();
          ResultSet rs = stmt.executeQuery(sql);
          System.out.println("Success");
          while (rs.next()) {
        int engineCC = rs.getInt("engineCC");
        String model = rs.getString("model");
        String brand = rs.getString("brand");
        String fuelTypes = rs.getString("fuelTypes");
        String engineType = rs.getString("engineType");
        int horsePower = rs.getInt("horsePower");
        car cr =new car(carId,engineCC,model,brand,fuelTypes,engineType,horsePower); 
            carList.add(cr);
              
             
         }
           for(car cr:carList){
            System.out.println(cr);
       
    }
     }
}



                    
        
 