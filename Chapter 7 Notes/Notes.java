
/**
 * Write a description of class Notes here.
 * 
 * @author ztan 
 * @version Nov 18 2019
 */
public class Notes
{
    public static void createArrayOfEvens()
    {
        /*
         * An array is an ordered colection of elements of the same type. The type can be a primitive
         *      (e.g. int) or class (e.g. Turtle).
         *      
         * An array variable is like an object variable in that it must be declared and initialized.
         * 
         * All elements in the array ar initialized to their default values (e.g. 0, false, null).
         * 
         * This code contains an array that contains 10 int values.
         */

        int[] evens = new int[10];

        /*
         * Set the value of each element in the array to the first 10 positive even integers.
         * 
         * "length" is used to query the number of elements in the array.
         * 
         * Square brackets (i.e. []) are used to reference a specific element in the array based
         *      on its index. Indices are zero based.
         */

        for (int i = 0; i < evens.length; i++)
        {
            evens[i] = (i + 1) * 2;
        }
        // print the reference to the array
        System.out.println(evens);

        //CHALLENGE: print out each element individually and with the index value next to each value.
        for (int i = 0; i < evens.length; i++)
        {
            System.out.println(i + ": " + evens[i]);
        }
    }

    public static void createArrayOfOdds()
    {
        /*
         * An array literal (i.e. curly brackets and comma-separated values) can be used to 
         *      initialize an array but only when the array is declared. The size of the array
         *      is inferred based on the number of elements in the literal.
         */
        int[] odds = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // this won't compile because it has already been initialized to an array literal:
        // odds = {1, 3, 5}

        /*
         * Bounds Error
         * 
         * Arrays have a fixed size once initialized. The index specified must refer to a valid
         *      element. Otherwise, an ArrayIndexOutOfBounds exception is generated.
         */

        for (int i = 0; i <= odds.length; i++)
        {
            System.out.println(i + ": " + odds[i]);
        }

        /*
         * Array References
         * 
         *  Variables of type array contain a reference to the array stored in the computer's memory.
         *  
         *  Assigning one array variable's value to another, copies the reference, not the array's elements.
         */
        int[] moreOdds = odds;
        odds[2] = 6;
        System.out.println(moreOdds[2]);        //print 6

    }
}
