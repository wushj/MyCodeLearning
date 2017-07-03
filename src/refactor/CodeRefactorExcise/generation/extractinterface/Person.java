package refactor.CodeRefactorExcise.generation.extractinterface;
//Person.java……
public class Person {
    public Person(String arg){
        if(arg.equals("Car")){
            Car vehicle = new Car();
            vehicle.startEngine();
            vehicleName = vehicle.go();
        }
        else if(arg.equals("Truck")) {
            Truck vehicle = new Truck();
            vehicle.startEngine();
            vehicleName = vehicle.go();
        }
    }
    public String getVehicle(){
        return vehicleName;
    }
    private String vehicleName;
}