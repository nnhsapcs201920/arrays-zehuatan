import java.util.Scanner;

public class MagicSquare
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[][] square = new int[4][4];

        for (int i = 0; i < square.length; i++)
        {
            for (int j = 0; j < square[0].length; j++)
            {
                int input = scan.nextInt();
                square[i][j] = input;
            }
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        boolean valid = true;
        for (int value : numbers)
        {
            for (int i = 0; i < square.length; i++)
            {
                for (int j = 0; j < square[0].length; j++)
                {
                    if (value == square[i][j])
                    {
                        break;
                    }
                }
            }
        }

    }
}

