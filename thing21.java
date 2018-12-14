package ThingForMarchal;

public class thing21 {
    public static void main(String args[]){
        String[] list = {"one", "two", "three"};
        for (String s: list){
            s+="*";
        }
        for (String s: list){
            System.out.println(s);
        }
    }
}
