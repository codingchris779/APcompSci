package ThingForMarchal;

import java.lang.reflect.Array;

public class thing19 {
    public static void main(String args[]){
        String[] catInAHat = {"cat","in","hat"};
        String holder = catInAHat[0];
        int longest = holder.length();
        for (int w = 0; w<catInAHat.length;w++){
            if(longest<catInAHat[w].length()){
                longest = catInAHat[w].length();

            }
        }

        String[][] result1 = new String[catInAHat.length][(longest*(longest+1))/2];
        for (int i = 0; i<catInAHat.length;i++){
        String[] result= allSubstrings(catInAHat[i]);
        //System.out.println(result[1]);
        for (int j=0; j<result.length;j++){
            result1[i][j] = result[j];

        }

    }

        for (int j = 0; j < result1.length; j++) {
            for (int i = 0; i < result1[j].length; i++) {
                if (result1[j][i] != null) {
                    System.out.println(result1[j][i]);
                }           }
        }
    }

    public static String[] allSubstrings(String s) {
        int n = (int) ((s.length() * (s.length() + 1)) / 2);
        String[] allStrings = new String[n];
        int holder = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                allStrings[holder] = (s.substring(i, j));
                holder++;
            }
        }
        return allStrings;
    }
}
