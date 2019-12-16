import java.util.Scanner;

/**
 * Represents a person with a zip code.
 */
public class PersonWithZip
{

    private String firstName;
    private String lastName;
    private int zipCode;
    /**
     * Constructs a person with a first name, last name, and zip code.
     * @param first The first name of the person.
     * @param last The last name of the person.
     * @param zip The zip code of the person.
     */
    public PersonWithZip(String first, String last, int zip)
    {
        this.firstName = first;
        this.lastName = last;
        this.zipCode = zip;
    }

    /**
     * Returns the zip code of the person.
     */
    public int getZip()
    {
        return this.zipCode;
    }

    /**
     * Returns the name and zip code of the person as a string.
     */
    public String toString()
    {
        return "Name: " + this.firstName + " " + this.lastName + " Zip Code: " + this.zipCode;
    }

    public static void main (String[] args)
    {
        PersonWithZip[] arrayZips = new PersonWithZip[3];
        Scanner scan = new Scanner(System.in);
        String inputFirst;
        String inputLast;
        int inputZipCode;
        
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Enter first name, last name, and zipcode for person #" + i + " with fields separated by a space");
            inputFirst = scan.next();
            inputLast = scan.next();
            inputZipCode = scan.nextInt();
            arrayZips[i] = new PersonWithZip(inputFirst, inputLast, inputZipCode);
        }
        
        for (PersonWithZip person : arrayZips)
        {
            System.out.println(person);
        }
        
        
        System.out.print("The following person has the least numbered zip code: ");
        
        int min = arrayZips[0].getZip();
        PersonWithZip leastZip = null;
        for (int i = 0; i < arrayZips.length; i++)
        {
            if (min > arrayZips[i].getZip())
            {
                min = arrayZips[i].getZip();
                leastZip = arrayZips[i];
            }
        }
        System.out.println(leastZip);
    }
}