function Car(licence, driver) {
    this.id;
    this.license = licence;
    this.driver = driver;
    this.passenger;
}

Car.prototype.printCar = function () {
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
}