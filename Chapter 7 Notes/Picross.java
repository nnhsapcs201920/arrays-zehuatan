import java.util.Scanner;

public class Picross
{

    public static void main (String[] args)
    {
        System.out.println();
        boolean[][] grid = new boolean[10][10];
        int [][] picrossGrid = new int[11][11];
        String[][] viewingGrid = new String[11][11];
        double rate = 0.25;

        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (Math.random() < .25)
                {
                    grid[i][j] = true;
                }
                else
                {
                    grid[i][j] = false;
                }
            }
        }

        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (grid[i][j] == true)
                {
                    picrossGrid[i + 1][0]++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (grid[i][j] == true)
                {
                    picrossGrid[0][j + 1]++;
                }
            }
        }

        for (int i = 0; i < viewingGrid.length; i++)
        {
            for (int j = 0; j < viewingGrid[0].length; j++)
            {
                viewingGrid[i][j] = picrossGrid[i][j] + "";
                System.out.print(viewingGrid[i][j] + " ");

            }
            System.out.println();
        }

        Scanner scan = new Scanner(System.in);
        boolean won = false;
        int inputRow;
        int inputCol;
        System.out.println("Input the row and column of the square to check.");
        
        do
        {
            do
            {
                System.out.print("Row: ");
                inputRow = scan.nextInt();
            }
            while (inputRow < 1 || inputRow > 10);
            
            do
            {
                System.out.print("Column: ");
                inputCol = scan.nextInt();
            }
            while (inputCol < 1 || inputCol > 10);
            
            if (grid[inputRow - 1][inputCol - 1])
            {
                viewingGrid[inputRow][inputCol] = "O";
            }
            else
            {
                viewingGrid[inputRow][inputCol] = "X";
            }

            //ideally print the index of the row and columns as well
            for (int i = 0; i < viewingGrid.length; i++)
            {
                System.out.print(i + " ");
                for (int j = 0; j < viewingGrid[0].length; j++)
                {
                    System.out.print(viewingGrid[i][j] + " ");

                }
                System.out.println();
            }

            won = true;
            for (int i = 1; i < viewingGrid.length; i++)
            {
                for (int j = 1; j < viewingGrid[0].length; j++)
                {
                    if (grid[i - 1][j - 1] == true && viewingGrid[i][j] != "O")
                    {
                        won = false;
                    }
                }
            }
        }
        while (won == false);

        System.out.println("You won!");
    }
}