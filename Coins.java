package ThingForMarchal;

import java.util.Scanner;

public class Coins {
    private int mon;
    private int quart;
    private int dim;
    private int nick;
    public Coins(int cents){mon = cents;
    quart = mon/25; mon = mon%25;
    dim = mon/10; mon = mon%10;
    nick = mon/5; mon = mon%5;
    }
    public int getQuarters(){return quart;}
    public int getDimes(){return dim;}
    public int getNickles(){return nick;}
    public int getPennies(){return mon;}
    public static void main(String args[]){
        Scanner kb= new Scanner(System.in);
        int cents = Integer.parseInt( kb.nextLine());
        Coins change = new Coins(cents);
        System.out.println(change.getQuarters());
        System.out.println(change.getDimes());
        System.out.println(change.getNickles());
        System.out.println(change.getPennies());
    }
}
