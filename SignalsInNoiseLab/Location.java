
public class Location
{
    private int row;
    private int column;
    /**
     * Constructs a Location on a grid with integer row and column
     * @param row The row index of the new location
     * @param col The column index of the new location
     */
    public Location(int row, int col)
    {
        this.row = row;
        this.column = col;
    }
    
    /**
     * Returns the index of row of the location.
     * @return The index of row of the location.
     */
    public int getRow()
    {
        return this.row;
    }
    
    /**
     * Returns the index of column of the location.
     * @return The index of column of the location.
     */
    public int getCol()
    {
        return this.column;
    }
    
}