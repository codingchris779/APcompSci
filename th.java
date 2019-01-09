package ThingForMarchal;

//I wrote the name of the method before attempting the logic
//Also note this is slightly different then my paper because i fixed minor errors that are hard to fix //with the limited room on the paper
public class th {
    public static void main(String args[]) {
        char[][] ar = {
                {'A', 'A', 'A', 'd', ' ', 'd'},
                {'A', 'L', 'S', 'G', 'S', 'G'},
                {' ', ' ', 'O', 'L', 'E', 'L'},
                {'e', 'D', 'I', 'L', 'H', 'H'},
                {'e', 'L', 'D', 'O', 'G', 'E'},
                {'A', 'L', 'H', 'O', 'G', 'P'}
        };

        methodNamesAreFunThisTestIsFun(ar);
    }


    public static void methodNamesAreFunThisTestIsFun(char[][] grid) {
        int countCol;
        int countRow;
        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {
                countCol = 0;
                countRow = 0;
                for (int k = 0; k < grid[i].length; k++) {
                    if (k != j) {
                        if (grid[i][j] == grid[i][k]) {
                            countRow++;

                        }
                    }

                }

                for (int w = 0; w < grid.length; w++) {
                    if (w != i) {
                        if (grid[i][j] == grid[w][j]) {
                            countCol++;
                        }
                    }
                }
                if (countRow >= 2 && (countCol >= 2)) {
                System.out.println(i + ","+j+""+grid[i][j]);}
            }

        }

    }
}