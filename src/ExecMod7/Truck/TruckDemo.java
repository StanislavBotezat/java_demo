package ExecMod7.Truck;

public class TruckDemo {
  public static void main(String[] args) {
   Truck semi  = new Truck(2, 200, 7, 44000);
   Truck pickup = new Truck(3, 28, 15, 2000);
   double gallons;
   int dist = 252;

   gallons = semi.fuelneeded(dist);

   System.out.println("Грузовик может перевезти " + semi.getCargocap() + " фунтов.");
   System.out.println("Для проведения "+ dist + " миль грузовику требуется " + gallons + " галлонов топлива. \n");

   gallons = pickup.fuelneeded(dist);

   System.out.println("Пикап может перевезти " + pickup.getCargocap() + " фунтов.");
   System.out.println("Для проведения "+ dist + " миль пикапу требуется " + gallons + " галлонов топлива. \n");
   }
 }

