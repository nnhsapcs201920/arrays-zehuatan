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
        int last = values[values.length - 1];
        for (int i = values.length - 1; i > 0; i--)
        {
            values[i] = values[i - 1];
        }
        values[0] = last;
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
        int replacedNum = values[0];
        int currentNum;
        for (int i = 1; i < values.length - 1; i++)
        {
            currentNum = values[i];
            if (replacedNum > values[i + 1])
            {
                values[i] = replacedNum;
            }
            else
            {
                values[i] = values[i + 1];
            }
            replacedNum = currentNum;
        }
    }
    
    public void replaceMiddle()
    {
        int[] newValues = null;
        
        if (values.length % 2 == 0)
        {
            newValues = new int[values.length - 2];
            for (int i = 0; i < values.length / 2 - 1; i++)
            {
                newValues[i] = values[i];
            }
            for (int i = values.length - 1; i > (values.length / 2); i--)
            {
                newValues[i - 2] = values[i];
            }
        }
        else
        {
            newValues = new int[values.length - 1];
            for (int i = 0; i < (values.length / 2); i++)
            {
                newValues[i] = values[i];
            }
            for (int i = values.length - 1; i > (values.length / 2); i--)
            {
                newValues[i - 1] = values[i];
            }
        }
        values = newValues;
        
    }
    
    public void moveEvensToFront()
    {
        int temp;
        //does swapping work?
        
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
        
        int[] testValues5 = { 1, 2, 3, 4, 5, 6, /* add your own values */ };
        tester = new ArrayMethods(testValues5);
        tester.printArray();
        tester.replaceMiddle();
        tester.printArray();
        
        int[] testValues6 = { 1, 8, 3, 2, 5, 7, 9, 10, 14, 13, 62, 23 /* add your own values */ };
        tester = new ArrayMethods(testValues6);
        tester.printArray();
        tester.moveEvensToFront();
        tester.printArray();
    }
}