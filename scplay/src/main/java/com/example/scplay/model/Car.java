package com.example.scplay.model;

public class Car {
    private int carId;
    private String carName;
    private String carBrand;
    private String carColor;

    public Car(int carId, String carName, String carBrand, String carColor) {
        this.carId = carId;
        this.carName = carName;
        this.carBrand = carBrand;
        this.carColor = carColor;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}
