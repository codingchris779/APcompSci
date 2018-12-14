package ThingForMarchal;

import static java.lang.Character.digit;
import static java.lang.Character.isDigit;

public class ISBNthinng {
    public static boolean isValid(String isbn) {
        int sum = 0;
        int coef = 1;
        for (int i = 1; i <= 13; i++) {
            Character chart = isbn.charAt(i-1);
            if (isDigit(chart) && isbn.length()==13) {
                sum+=coef*(digit(chart, 10));
                System.out.println(coef);

            }
            else {return false;}
            if ((i+1)%2==0){
                coef = 3;
            }
            else {coef=1;}

        }
        if (sum%10==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        String isbn = "9781801830754";
        System.out.println(isValid(isbn));
    }
}

