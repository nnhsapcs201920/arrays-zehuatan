import java.util.Arrays;

public class ArrayMethods
{
    private int[] values;

    public ArrayMethods(int[] initialValues)
    {
        this.values = initialValues;
    }

    public void printArray()
    {
        System.out.println(Arrays.toString(this.values));
    }

    public void swapFirstAndLast()
    {
        int first = values[0];
        values[0] = values[values.length - 1];
        values[values.length - 1] = first;
    }

    public void shiftRight()
    {
        int[] oldValues = values;
        for (int i = 1; i < values.length; i++)
        {
            values[i] = oldValues[i - 1];
        }
        values[1] = values[values.length - 1];//wrong
    }

    public static void main( String[] args )
    {
        int[] testValues = { 3, 5, 6, 1 /* add your own values */ };
        ArrayMethods tester = new ArrayMethods( testValues );
        tester.printArray();
        tester.swapFirstAndLast();
        tester.printArray();

        int[] testValues2 = { 1, 6, 3, 9, 5, 6 /* add your own values */ };
        tester = new ArrayMethods(testValues2);
        tester.printArray();
        tester.shiftRight();
        tester.printArray();

    }
}