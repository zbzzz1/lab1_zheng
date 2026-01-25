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

public class Main {
    public static void main(String[] args){

        Engine cruiserEngine = new Engine("Gasoline", "1200", "90", "2-cylinder");
        Wheels cruiserWheels = new Wheels("18-inch", "Cruiser Tire", "Disc Brake", "Steel");
        Motorcycle cruiser = new Motorcycle("Matte Black", "Cruiser", "2-person", cruiserEngine, cruiserWheels);

        Engine sportEngine = new Engine("Gasoline", "650", "75 ", "4-cylinder");
        Wheels sportWheels = new Wheels("17-inch", "Sport Tire", "Dual Disc Brake", "Aluminum");
        Motorcycle sportbike = new Motorcycle("Bright Pink", "Sportbike", "1-person", sportEngine, sportWheels);

        Engine offRoadEngine = new Engine("Gasoline", "800", "60", "1-cylinder");
        Wheels offRoadWheels = new Wheels("19-inch", "Off-Road Tire", "Disc Brake", "Aluminum");
        Motorcycle offRoadBike = new Motorcycle("Creamy White", "Off-Road", "1-person", offRoadEngine, offRoadWheels);

        System.out.println("Cruiser Motorcycle");
        System.out.println("Type: " + cruiser.getBikeType());
        System.out.println("Color: " + cruiser.getColor());
        System.out.println("Seats: " + cruiser.getSeatCapacity());
        System.out.println("Engine Fuel: " + cruiser.getEngine().getFuelType());
        System.out.println("Engine CC: " + cruiser.getEngine().getCc());
        System.out.println("Wheel Size: " + cruiser.getWheels().getWheelSize());
        System.out.println("Brake Type: " + cruiser.getWheels().getBrakeType());
        cruiser.startEngine();
        cruiser.stopEngine();
        System.out.println();

        System.out.println("Sportbike Motorcycle");
        System.out.println("Type: " + sportbike.getBikeType());
        System.out.println("Color: " + sportbike.getColor());
        System.out.println("Seats: " + sportbike.getSeatCapacity());
        System.out.println("Engine Cylinders: " + sportbike.getEngine().getCylinderCount());
        System.out.println("Tire Type: " + sportbike.getWheels().getTireType());
        System.out.println("Rim Material: " + sportbike.getWheels().getRimMaterial());
        sportbike.startEngine();
        sportbike.stopEngine();
        System.out.println();

        System.out.println("Off-Road Motorcycle");
        System.out.println("Type: " + offRoadBike.getBikeType());
        System.out.println("Color: " + offRoadBike.getColor());
        System.out.println("Engine HP: " + offRoadBike.getEngine().getHp());
        System.out.println("Wheel Size: " + offRoadBike.getWheels().getWheelSize());
        System.out.println("Tire Type: " + offRoadBike.getWheels().getTireType());
        offRoadBike.startEngine();
        offRoadBike.stopEngine();
    }
}
