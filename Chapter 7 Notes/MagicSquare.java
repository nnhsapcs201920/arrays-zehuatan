import java.util.Scanner;

public class MagicSquare
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        /*
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
        */
        System.out.print("Enter a side length for the magic square: ");
        int n = scan.nextInt();
        int[][] square = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = n; j < n; j++)
            {
                square[i][j] = 0;
            }
        }
        int row = n - 1;
        int col = n / 2;
        for (int k = 1; k <= n * n; k++)
        {
            square[row][col] = k;
            row = (row + 1) % n;
            col = (col + 1) % n;
            if (square[row][col] != 0)
            {
                row = (n + row - 2) % n;
                col = (n + col - 1) % n;
            }
            
            
        }
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}

