package ExecMod7.Truck;

public class Truck extends Vehicle{

    private int cargocap;

    Truck(int passengersValue, int fuelCapValue, int milePerGalValue, int cargo ) {
        super(passengersValue, fuelCapValue, milePerGalValue);
        cargocap = cargo;
    }

    int getCargocap() {return cargocap;}
    void putCargo(int cargo) {cargocap = cargo ;}
}

