package ThingForMarchal;

public class median {
    public static void main(String args[]){
        double [] thing = {.5,.5,1.0,100.0};
        double m = .75;
        System.out.println(isMedian(thing,m));
    }
    public static boolean isMedian(double[] sample, double m){
        double median;
        if (sample.length%2==0){
          median = (sample[sample.length/2-1]+sample[(sample.length/2)])/2;
          System.out.println(median);
        }
        else {
            median = sample[sample.length/2];
            System.out.println(median);
        }
        if (median == m){return true;}
        return false;
    }
}
