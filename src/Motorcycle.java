/**
 * Project: Lab 1 – Java Programing Assignment: Motorcycle
 * Purpose Details: Model a motorcycle with composition of Engine and Wheels classes.
 *                  implement constructors, getters, setters, and documentation.
 * Course: IST 242 Section 001: Inter Oo App Dev
 * Author: Ziyan Zheng
 * Date Developed: 01/25/2026
 * Last Date Changed: 01/25/2026
 * Revision: 1
 */

public class Motorcycle {
    private String color;
    private String bikeType;
    private String seatCapacity;
    private Engine engine;
    private Wheels wheels;

    public Motorcycle(String color, String bikeType, String seatCapacity, Engine engine, Wheels wheels) {
        this.color = color;
        this.bikeType = bikeType;
        this.seatCapacity = seatCapacity;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String getColor() { return color; }
    public String getBikeType() { return bikeType; }
    public String getSeatCapacity() { return seatCapacity; }
    public Engine getEngine() { return engine; }
    public Wheels getWheels() { return wheels; }

    public void setColor(String color) { this.color = color; }
    public void setBikeType(String bikeType) { this.bikeType = bikeType; }
    public void setSeatCapacity(String seatCapacity) { this.seatCapacity = seatCapacity; }
    public void setEngine(Engine engine) { this.engine = engine; }
    public void setWheels(Wheels wheels) { this.wheels = wheels; }


    public void startEngine() {
        System.out.println(bikeType + " engine started.");
    }

    public void stopEngine() {
        System.out.println(bikeType + " engine stopped.");
    }
}