package inne;

import java.util.ArrayList;

public class los {
    public ArrayList<Integer> execute(Integer[][] board) {
        int min = 0;
        int max = 5;
        int randX = 0, randY = 0;
        while (true) {
            boolean founded = false;
            for(int i =0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if (board[i][j] == 0) {
                        founded = true;
                        break;
                    }
                }
            }

            if (!founded) {
                randX = Integer.MAX_VALUE;
                randY = Integer.MAX_VALUE;
                break;
            }

            randX = (int)(Math.random() * (max - min ) + min);
            randY = (int)(Math.random() * (max - min ) + min);
            if (board[randX][randY] == 0 ) {
                break;
            }
        }
        ArrayList<Integer> result = new ArrayList<>(2);
        result.add(randX);
        result.add(randY);
        return result;
    }
}
