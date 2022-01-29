from account import Acoount


class Car:
    id          = int
    license     = str
    driver      = Acoount("","")
    passagenger = str

    def __init__(self, license, driver):
        self.license    = license
        self.driver     = driver