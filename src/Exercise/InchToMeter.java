package Exercise;

public class InchToMeter {
    public static void main(String[] args) {
        double inches, meters;
        for (inches = 1; inches <= 100; inches+=1)
        {
            meters = inches * 0.0254;
             System.out.println( inches + " Дюймам соответсвует " + meters + " метрам.");

            if (inches%10==0)
            {
                System.out.println();
            }
        }
    }
}

