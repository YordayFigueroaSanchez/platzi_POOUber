package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car("GHFG21",new Account("driver", "345df"));
        car1.pintDataCar();

        Map<String,ArrayList<Integer>> aa = 
        new HashMap<>();
        aa.put("key", new ArrayList<Integer>(
            Arrays.asList(1,2,3)
        ));
        Car carVan = new UberVan("VanLi", 
            new Account("NombreVan", "D-2343-VAN"), 
            aa, 
            new ArrayList<String>(Arrays.asList("1","2","3")));

        carVan.pintDataCar();
    }

}