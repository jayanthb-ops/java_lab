
interface ParkingCharge {
    void calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    int vehicleNumber;
    String vehicleType;
    int parkingHours;

    VehicleParking(int vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {

    TwoWheeler(int number, int hours) {
        super(number, "Two Wheeler", hours);
    }

    public void calculateCharge() {
        double charge;

        if (parkingHours <= 2) {
            charge = parkingHours * 20;
        } else {
            charge = 40 + (parkingHours - 2) * 10;
        }

        System.out.println("Parking Charge: Rs. " + charge);
    }

    public void displayParkingDetails() {
        System.out.println("\nVehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {

    FourWheeler(int number, int hours) {
        super(number, "Four Wheeler", hours);
    }

    public void calculateCharge() {
        double charge;

        if (parkingHours <= 2) {
            charge = parkingHours * 50;
        } else {
            charge = 100 + (parkingHours - 2) * 30;
        }

        System.out.println("Parking Charge: Rs. " + charge);
    }

    public void displayParkingDetails() {
        System.out.println("\nVehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
    }
}

public class lab3a {
    public static void main(String[] args) {

        ParkingCharge p;

        p = new TwoWheeler(101, 4);
        p.displayParkingDetails();
        p.calculateCharge();

        p = new FourWheeler(202, 3);
        p.displayParkingDetails();
        p.calculateCharge();
    }
}
