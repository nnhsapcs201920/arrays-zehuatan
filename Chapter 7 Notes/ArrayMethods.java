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
        int[] oldValues = new int[values.length];
        for (int i = 0; i < oldValues.length; i++)
        {
            oldValues[i] = values[i];
        }
        for (int i = 1; i < oldValues.length; i++)
        {
            values[i] = oldValues[i - 1];
        }
        values[0] = oldValues[oldValues.length - 1];
    }
    
    public void replaceEvens()
    {
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] % 2 == 0)
            {
                values[i] = 0;
            }
        }
    }
    
    public void replaceNeighbors()
    {
        int[] oldValues = new int[values.length];
        for (int i = 0; i < oldValues.length; i++)
        {
            oldValues[i] = values[i];
        }
        for (int i = 1; i < oldValues.length - 1; i++)
        {
            if (oldValues[i - 1] > oldValues[i + 1])
            {
                values[i] = oldValues[i - 1];
            }
            else
            {
                values[i] = oldValues[i + 1];
            }
        }
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
        
        int[] testValues3 = { 1, 2, 3, 4, 5, 6 /* add your own values */ };
        tester = new ArrayMethods(testValues3);
        tester.printArray();
        tester.replaceEvens();
        tester.printArray();
        
        int[] testValues4 = { 1, 8, 3, 2, 5, 7 /* add your own values */ };
        tester = new ArrayMethods(testValues4);
        tester.printArray();
        tester.replaceNeighbors();
        tester.printArray();
    }
}