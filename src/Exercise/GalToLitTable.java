package Exercise;

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
//        int c;
//        c = 0;
        for (gallons = 1; gallons <= 100; gallons++)
        {
            liters = gallons * 3.7854;
            System.out.println( gallons + " галлонам соответсвует " + liters + " литров.");
//            c=c+1;
//            System.out.println( "counter = " + c);
            if (gallons%10==0)
            {
                System.out.println();
//                c = 0;
            }
        }
    }
}

