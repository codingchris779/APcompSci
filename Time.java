package ThingForMarchal;

import java.security.InvalidParameterException;

public class Time {
    private int hours;
    private int mins;
    Time(int h,int m)throws InvalidParameterException {
        if(h*60+m>24*60){
            throw new InvalidParameterException("bad");
        }
        hours = h;
        mins = m;
    }
    private int toMins(){
        return hours*60+mins;
    }
    public boolean lessThan(Time t){
        if (t.toMins()>this.toMins()){return false;}
    return true;}
    public int elapsedSince(Time t){
        if(t.toMins()<this.toMins()){return (t.toMins()+24*60)-this.toMins();}
        return t.toMins()-this.toMins();
    }
    public String toString(){
        return "h: "+hours+" m: "+mins;
    }
}
