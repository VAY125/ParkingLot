import Enums.VehicleType;
import ParkingSpotManagers.BikeParkingSpotManager;
import ParkingSpotManagers.CarParkingSpotManager;
import ParkingSpotManagers.ParkingSpotManager;
import ParkingSpotManagers.TruckParkingSpotManager;

public class ParkingManagerFactory {

    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType){
        if(vehicleType == VehicleType.BIKE){
            return new BikeParkingSpotManager();
        }
        if(vehicleType == VehicleType.CAR){
            return new CarParkingSpotManager();
        }
        if(vehicleType == VehicleType.TRUCK){
            return new TruckParkingSpotManager();
        }
    }
}
