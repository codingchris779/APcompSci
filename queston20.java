package ThingForMarchal;

public class queston20 {
    public static void main(String args[]){
        int [][] square =  makeMagicSquare(3);
        for(int i = 0;i<square.length;i++){
            System.out.println();
            for( int j = 0;  j<square[0].length;j++){
                System.out.print(" "+square[i][j]);
            }
        }
    }

    public static int[][] makeMagicSquare(int n) {
        int[][] magic = new int[n][n];
        int y = 0;
        int x = (n / 2);
        magic[y][x] = 1;
        for (int i = 2; i <= n * n; i++) {
            x++;
            y--;
            if (y < 0) {
                y = n - 1;
            }
            if (y >= n) {
                y = 0;
            }
            if (x >= n) {
                x = 0;
            }
            if (x < 0) {
                x = n - 1;
            }

            while (magic[y][x] != 0) {
                if (magic[y][x] != 0) {
                    x--;
                    y++;
                    y++;
                }
                if (y < 0) {
                    y = n - 1;
                }
                if (y >= n) {
                    y = 0;
                }
                if (x >= n) {
                    x = 0;
                }
                if (x < 0) {
                    x = n - 1;
                }
            }

            magic[y][x] = i;


        }
        return magic;
    }


}
