package ThingForMarchal;

public class thing14 {

    public static void main(String args[]) {
        double m[][] = {{10, 20, 30, 40, 50, 60, 70, 80, 90},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50, 51, 89},
        };
        System.out.println(positiveMax(m));
    }

    public static double positiveMax(double[][] m) {
        double holder = 0;
        for (int j = 0; j < m.length; j++) {
            for (int i = 0; i < m[j].length; i++) {
                if (m[j][i] > holder) {


                    holder = m[j][i];
                    System.out.println(m[0].length);
                }
            }
        }
        return holder;

    }
}
