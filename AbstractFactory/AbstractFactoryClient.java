// Vehicles are independent.
// New Vehicle start manufacturing in the system not break existing
interface Vehicle{
    void make();
}

class Bus implements Vehicle{
    @Override
    public void make() {
        System.out.println("Bus made");
    }
}

class Lorry implements Vehicle{
    @Override
    public void make() {
        System.out.println("Lorry made");
    }
}

class Car implements Vehicle{
    @Override
    public void make() {
        System.out.println("car made");
    }
}

class Van implements Vehicle{
    @Override
    public void make() {
        System.out.println("Van made");
    }
}

class Jeep implements Vehicle{
    @Override
    public void make() {
        System.out.println(" Jeep made");
    }
}

abstract class AbstractFactory {
    abstract Vehicle getVehicle(String vehicleType) ;
}

// Factries are independent. New factory open to the system not break existing
class HeavyVehicleFactory extends AbstractFactory{
    public Vehicle getVehicle(String vehicleType){
        if (vehicleType.equals("BUS")) {
            return new Bus();
        }
        if (vehicleType.equals("LORRY")) {
            return new Lorry();
        }
        return null;
    }
}

class LightVehicleFactory extends AbstractFactory{
    public Vehicle getVehicle(String vehicleType){
        if (vehicleType.equals("CAR")) {
            return new Car();
        }
        if (vehicleType.equals("VAN")) {
            return new Van();
        }
        if (vehicleType.equals("JEEP")) {
            return new Jeep();
        }
        return null;
    }
}

// FactoryProvider looking for correct factory according to the clients requests
class FactoryProvider {
    public AbstractFactory getFactory(String factory){
        if(factory.equals("LIGHTVEHICLE")){
            return new LightVehicleFactory();
        }
        else if(factory.equals("HEAVYVEHICLE")){
            return new HeavyVehicleFactory();
        }
        return null;
    }
}

//Clients looking for vehicle but it calling throught the Provider.
// Not direct contact with Factries..
public class AbstractFactoryClient {
    public static void main(String[] args) {
        FactoryProvider provider=new FactoryProvider();
        AbstractFactory abstractFactory=provider.getFactory("LIGHTVEHICLE");
        Vehicle vehicle=abstractFactory.getVehicle("VAN");
        vehicle.make();

        abstractFactory=provider.getFactory("HEAVYVEHICLE");
        vehicle=abstractFactory.getVehicle("BUS");
        vehicle.make();
    }
}