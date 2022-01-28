from unicodedata import name

from car import Car


if __name__ == "__main__":
    print("hola...ok")
    car = Car()
    car.license = "HJFGHG"
    car.driver = "GHkdjf HJKdf"
    print(vars(car))