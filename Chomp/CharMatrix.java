// Implements a 2-D array of characters

public class CharMatrix
{
    // Instance variables:
    char[][] grid;
    // Constructor: creates a grid with dimensions rows, cols,
    // and fills it with spaces
    public CharMatrix(int rows, int cols)
    {
        grid = new char[rows][cols];

        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                grid[i][j] = ' ';
            }
        }

    }

    // Constructor: creates a grid with dimensions rows , cols ,
    // and fills it with the fill  character
    public CharMatrix(int rows, int cols, char fill)
    {
        grid = new char[rows][cols];

        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                grid[i][j] = fill;
            }
        }
    }

    // Returns the number of rows in grid
    public int numRows()
    {
        return grid.length;
    }

    // Returns the number of columns in grid
    public int numCols()
    {
        return grid[0].length;
    }

    // Returns the character at row, col location
    public char charAt(int row, int col)
    {
        return grid[row][col];
    }

    // Sets the character at row, col location to ch
    public void setCharAt(int row, int col, char ch)
    {
        grid[row][col] = ch;
    }

    // Returns true if the character at row, col is a space,
    // false otherwise
    public boolean isEmpty(int row, int col)
    {
        if (grid[row][col] == ' ')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Fills the given rectangle with fill  characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void fillRect(int row0, int col0, int row1, int col1, char fill)
    {
        for (int i = row0; i <= row1; i++)
        {
            for (int j = col0; j <= col1; j++)
            {
                grid[i][j] = fill;
            }
        }
    }

    // Fills the given rectangle with SPACE characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void clearRect(int row0, int col0, int row1, int col1)
    {
        for (int i = row0; i <= row1; i++)
        {
            for (int j = col0; j <= col1; j++)
            {
                grid[i][j] = ' ';
            }
        }
    }

    // Returns the count of all non-space characters in row 
    public int countInRow(int row)
    {
        int sum = 0;
        for (int i = 0; i < grid[row].length; i++)
        {
            if (grid[row][i] != ' ')
            {
                sum++;
            }
        }
        return sum;
    }

    // Returns the count of all non-space characters in col 
    public int countInCol(int col)
    {
        int sum = 0;
        for (int i = 0; i < grid.length; i++)
        {
            if (grid[i][col] != ' ')
            {
                sum++;
            }
        }
        return sum;
    }
}
