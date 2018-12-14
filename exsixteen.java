package ThingForMarchal;

public class exsixteen {
    private static Integer n1 = -3;
    private static Integer n2 = 3;
    private static String s1 = n1.toString();
    private static String s2 = n2.toString();
    public static void main(String args[]){
        System.out.println(s1.compareTo(s2));
        System.out.println(n1-n2);
        int thing = s1.compareTo(s2)/Math.abs(s1.compareTo(s2));
        int thing2 = ((n1-n2)/ Math.abs(n1-n2));
        if(thing == thing2){
            System.out.println("true");
        }else {System.out.println("false");}
    }
}

