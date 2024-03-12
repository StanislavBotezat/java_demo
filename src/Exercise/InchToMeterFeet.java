package Exercise;

public class InchToMeterFeet {
    public static void main(String[] args) {
        int inches, feet;
        double  meters;
        for (feet = 0; feet <= 12; feet++) {
            for (inches = 0; inches <= 12; inches++) {
                meters = (feet*0.3048) + (inches * 0.0254);
                String roundmeter = String.format("%.3f",meters);
                if (inches==0 & feet==0) continue;
                System.out.println(feet+ " Футам " + inches + " Дюймам соответсвует " + roundmeter + " метрам.");
                if (inches % 12==0) {
                    System.out.println();
                }
            }
        }
    }
}