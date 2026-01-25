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

public class Engine {
    private String fuelType;
    private String cc;
    private String hp;
    private String cylinderCount;

    public Engine(String fuelType, String cc, String hp, String cylinderCount) {
        this.fuelType = fuelType;
        this.cc = cc;
        this.hp = hp;
        this.cylinderCount = cylinderCount;
    }

    public String getFuelType() { return fuelType; }
    public String getCc() { return cc; }
    public String getHp() { return hp; }
    public String getCylinderCount() { return cylinderCount; }

    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    public void setCc(String cc) { this.cc = cc; }
    public void setHp(String hp) { this.hp = hp; }
    public void setCylinderCount(String cylinderCount) { this.cylinderCount = cylinderCount; }
}
