
package car.model;

public class car {
    private int carId;
    private int engineCC;
    private String model;
    private String brand;
    private String fuelTypes;
    private String engineType;
    private int horsePower;

    public car() {
    }

    public car(int carId, int engineCC, String model, String brand, String fuelTypes, String engineType, int horsePower) {
        this.carId = carId;
        this.engineCC = engineCC;
        this.model = model;
        this.brand = brand;
        this.fuelTypes = fuelTypes;
        this.engineType = engineType;
        this.horsePower = horsePower;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuelTypes() {
        return fuelTypes;
    }

    public void setFuelTypes(String fuelTypes) {
        this.fuelTypes = fuelTypes;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineTypes(String engineType) {
        this.engineType = engineType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "car{" + "carId=" + carId + ", engineCC=" + engineCC + ", model=" + model + ", brand=" + brand + ", fuelTypes=" + fuelTypes + ", engineType=" + engineType + ", horsePower=" + horsePower + '}';
    }
    
}