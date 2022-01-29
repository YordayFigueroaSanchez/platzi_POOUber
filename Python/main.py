from unicodedata import name
from account import Acoount

from car import Car
from UberX import UberX


if __name__ == "__main__":
    print("hola...ok")
    car = Car("HJUY-3", Acoount("Ohyjuks","12345-90"))
    print(vars(car))

    carUberX = UberX("HJUY-3", Acoount("Ohyjuks","12345-90"),"kjdk","rklfklf")
    print(vars(carUberX))