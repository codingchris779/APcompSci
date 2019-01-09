package ThingForMarchal;

public class FCConverter {
    public double far = 0;
    public double cel =0;
    FCConverter(){
    }
    public void setFahrenheit(double in){
        far = in;
        cel = ((in-32)*(5/9));

    }
    public void setCelsius(double in){
        cel = in;
        far =in*9/5+32;
    }
    public double getFahrenheit(){
        return far;
    }
    public double getCelsius(){
        return cel;
    }
}
