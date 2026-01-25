/**
 * Project: Lab 1 – Java Programing Assignment: Motorcycle
 * Purpose Details: Model a motorcycle with composition of Engine and Wheels classes.
 *                  apply constructors, getters, setters, and documentation.
 * Course: IST 242 Section 001: Inter Oo App Dev
 * Author: Ziyan Zheng
 * Date Developed: 01/25/2026
 * Last Date Changed: 01/25/2026
 * Revision: 1
 */


public class Wheels {

    private String wheelSize;
    private String tireType;
    private String brakeType;
    private String rimMaterial;

    public Wheels(String wheelSize, String tireType, String brakeType, String rimMaterial) {
        this.wheelSize = wheelSize;
        this.tireType = tireType;
        this.brakeType = brakeType;
        this.rimMaterial = rimMaterial;
    }

    public String getWheelSize() { return wheelSize; }
    public String getTireType() { return tireType; }
    public String getBrakeType() { return brakeType; }
    public String getRimMaterial() { return rimMaterial; }

    public void setWheelSize(String wheelSize) { this.wheelSize = wheelSize; }
    public void setTireType(String tireType) { this.tireType = tireType; }
    public void setBrakeType(String brakeType) { this.brakeType = brakeType; }
    public void setRimMaterial(String rimMaterial) { this.rimMaterial = rimMaterial; }
}