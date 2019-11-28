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
        /*
        boolean success = true;
        //shift all evens to swap with odds

        do
        {
        success = true;
        for (int i = 0; i < values.length - 1; i++)
        {
        if (values[i] % 2 == 1 && values[i + 1] % 2 == 0)
        {
        temp = values[i];
        values[i] = values[i + 1];
        values[i + 1] = temp;
        success = false;
        }
        }
        }
        while (success == false);
         */
        int count = 0;
        for (int i = values.length - 1; i > 0; i--)
        {
            if (values[i + count] % 2 == 0)
            {
                temp = values[i + count];
                for (int j = i + count; j > 0; j--)
                {
                    values[j] = values[j - 1];
                }
                values[0] = temp;
                count++;
            }
        }

    }
    
    public int secondLargest()
    {
        int largest = values[0];
        int secondLargest = values[0];
        for (int arr : values)
        {
            if (arr > largest)
            {
                secondLargest = largest;
                largest = arr;
            }
            else if (arr < largest && arr > secondLargest)
            {
                secondLargest = arr;
            }
        }
        return secondLargest;
    }
    
    public boolean increasingOrder()
    {
        int previous = values[0];
        for (int arr : values)
        {
            if (previous > arr)
            {
                return false;
            }
            previous = arr;
        }
        return true;
    }
    
    public boolean adjacentDoubles()
    {
        int previous = values[0];
        for (int i = 1 ; i < values.length; i++)
        {
            if (previous == values[i])
            {
                return true;
            }
            previous = values[i];
        }
        return false;
    }
    
    public boolean duplicates()
    {
        for (int i = 0; i < values.length; i++)
        {
            for (int j = i + 1; j < values.length; j++)
            {
                if (values[i] == values[j])
                {
                    return true;
                }
            }
        }
        return false;
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
        
        int[] testValues7 = { 1, 8, 3, 2, 5, 7, 9, 10, 14, 13, 62, 23 /* add your own values */ };
        tester = new ArrayMethods(testValues7);
        tester.printArray();
        System.out.println(tester.secondLargest());
        
        int[] testValues8 = { 1, 2, 3, 4, 5, 7, 9, 10, 14, 16, 62, 89 /* add your own values */ };
        tester = new ArrayMethods(testValues8);
        tester.printArray();
        System.out.println(tester.increasingOrder());
        
        int[] testValues9 = { 1, 8, 3, 3, 5, 7, 9, 10, 14, 13, 62, 23 /* add your own values */ };
        tester = new ArrayMethods(testValues9);
        tester.printArray();
        System.out.println(tester.adjacentDoubles());
        
        int[] testValues10 = { 1, 8, 3, 62, 5, 7, 9, 10, 14, 13, 62, 23 /* add your own values */ };
        tester = new ArrayMethods(testValues10);
        tester.printArray();
        System.out.println(tester.duplicates());
    }
}