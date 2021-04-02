class ship:
    def init(self,name,year):
        self.name = name
        self.year = year

    def getName(self):
        return self.name
    def getYear(self):
        return self.year
    def str(self):
        return "Ship Name: " + self.name + "Year ship was built: " + self.year

class CruiseShip(ship):
    def init(self,name,year,num):
        super().init(name,year)
        self.num = num
    def str(self):
        return "Ship Name: " + self.getName() + "Year ship was built: " + self.getYear() + "Max number of passengers: " + self.num

class CargoShip(ship):
    def init(self,name,year,cap):
        super().init(name,year)
        self.cap = cap
    def str(self):
        return super().str() + "Cargo capacity: " + self.cap

def test():
    ship1 = ship("ghost ship", 1800)
    ship2 = CruiseShip("Harmony", 2010, 1000)
    ship3 = CargoShip("USS Antilla", 1904, 2000)

    ship1.str();
    ship2.str();
    ship3.str();

