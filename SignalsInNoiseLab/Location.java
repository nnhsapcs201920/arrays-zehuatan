
public class Location
{
    private int row;
    private int column;
    /**
     * Constructs a Location on a grid with integer row and column
     * @param row The row of the new location
     * @param col The column of the new location
     */
    public Location(int row, int col)
    {
        this.row = row;
        this.column = col;
    }
    
    /**
     * Returns the row of the location.
     * @return The row of the location.
     */
    public int getRow()
    {
        return this.row;
    }
    
    /**
     * Returns the column of the location.
     * @return The column of the location.
     */
    public int getCol()
    {
        return this.column;
    }
    
}