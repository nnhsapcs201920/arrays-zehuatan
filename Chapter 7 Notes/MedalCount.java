
/**
 * Write a description of class MedalCount here.
 *
 * @author ztan
 * @version 26 November 2019
 */
public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;

    /*
     * Can use array literals to create 2D arrays by nesting curly brackets.
     */

    private int[][] counts =
        {
            { 1, 0, 1 },
            { 1, 1, 0 },
            { 0, 1, 0 },
            { 1, 1, 0 },
            { 0, 1, 1 },
            { 0, 0, 0 },
            { 1, 1, 1 }
        };

    public MedalCount()
    {
        /*
         * Alternate way to create a 2D array. The initialization would be followed by
         *      nested loops to initialize each element.
         */
        //this.counts = new int[COUNTRIES][MEDALS];
        //for ...

    }
    
    /**
     * Prints the entire table
     */
    public void printTable()
    {
    }
}