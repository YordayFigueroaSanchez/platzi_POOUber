class Car {

    constructor(licence, driver) {
        this.id;
        this.license = licence;
        this.driver = driver;
        this.passenger;
    }
    
    printCar = function () {
        console.log(this.driver);
        console.log(this.driver.name);
        console.log(this.driver.document);
    }
}