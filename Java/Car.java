package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passagenger;

    void pintDataCar(){
        System.out.println("Car" + this.license + " Driver " + driver.name);
    }

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }
}
