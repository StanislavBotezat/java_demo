package Lesson5;

public class Vehicle {
//    access_modifier_class ClassName {
//        type instanceVariable1;
//        type instanceVariable2;
//        type instanceVariable3;
//        type instanceVariableN;
//
//        access_modifier returntype_methodName( )
//        access_modifier returntype_methodName(type parameterName)
//        access_modifier returntype_methodName(type parameter1, type arameter2){
//
//        }
//    }

    int passengers;
    int fuelCap;
    int milePerGal;


//    Vehicle(){
//
//    }
    Vehicle (int passengersValue, int fuelCapValue, int milePerGalValue){
        passengers=passengersValue;
        fuelCap=fuelCapValue;
        milePerGal=milePerGalValue;

    }


    void showRange(){
           System.out.println("Vehicle rangeMinivan is " +fuelCap*milePerGal+" miles and can carry "+passengers+" passangers");
    }

    int calcRange (){
        int range;
        range = fuelCap*milePerGal;
        return range;
    }
    void showRangeWithName(String vehicleName) {
        System.out.println(vehicleName+ " range is " +fuelCap*milePerGal+" miles and can carry "+passengers+" passangers");
    }

int allInOneAboutRange(String vehicleName){
    int range;
    range = fuelCap*milePerGal;
    System.out.println( vehicleName+ " range is " +range+" miles and can carry "+ passengers +" passangers");
    return range;

}

}
