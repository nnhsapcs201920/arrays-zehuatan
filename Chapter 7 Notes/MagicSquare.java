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

        int[] numbers = new int[16];
        boolean valid = true;

        for (int i = 0; i < square.length; i++)
        {
            for (int j = 0; j < square[0].length; j++)
            {
                if (square[i][j] > 0 && square[i][j] < 17)
                {
                    numbers[i + j] = square[i][j];
                    for (int k = 0; k < i + j; k++)
                    {
                        if (numbers[k] == square[i][j])
                        {
                            valid = false;
                            break;
                        }
                    }
                }
                else
                {
                    valid = false;
                    break;
                }
            }
        }

        int sum = square[0][0] + square[0][1] + square[0][2] + square[0][3];

        for (int i = 0; i < square.length; i++)
        {
            if (sum != square[i][0] + square[i][1] + square[i][2] + square[i][3])
            {
                valid = false;
            }
        }

        for (int i = 0; i < square[0].length; i++)
        {
            if (sum != square[0][i] + square[1][i] + square[2][i] + square[3][i])
            {
                valid = false;
            }
        }

        if (sum != square[0][0] + square[1][1] + square[2][2] + square[3][3])
        {
            valid = false;
        }

        if (sum != square[0][3] + square[1][2] + square[2][1] + square[3][0])
        {
            valid = false;
        }
        
        if (valid == true)
        {
            System.out.println("This is a magic square!");
        }
        else if (valid == false)
        {
            System.out.println("This is not a magic square!");
        }
    }
}

