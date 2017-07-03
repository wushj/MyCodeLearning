package refactor.CodeRefactorExcise.generation.extractinterface;

import junit.framework.TestCase;


public class PersonTest extends TestCase {
    public PersonTest(String name) {
        super(name);
    }
    public void testGetVehicle() {
        assertEquals("Vroom", controlCar.getVehicle());
    }
    public static void main(String[] args) {
        junit.textui.TestRunner.run(new PersonTest("testGetVehicle"));
    }
    protected void setUp() throws Exception {
        super.setUp();
        controlCar = new Person("Car");
        controlTruck = new Person("Truck");       
    }
    private Person controlCar;
    private Person controlTruck;
}
