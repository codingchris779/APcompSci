package ThingForMarchal;

public class question24 {
    public static void main(String args[]){
        int[] thisarray = {1,2,3,4,5};
        shiftleft(thisarray,2);
    }
    public static void shiftleft(int[] ar, int n){
        int[] arraayHolder = ar;
        int index = n;
        for (int i = 0; i<ar.length; i++){
            index = Math.abs(i-n);
            ar[i] = arraayHolder[index%arraayHolder.length];
            System.out.println(ar[i]);
        }

    }
}
