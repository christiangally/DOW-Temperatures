package files.and.arrays;

import java.util.Arrays;

public class FilesAndArrays
{

    public static void main(String[] args)
    {
        // Initialize

        InputFile in = new InputFile("input.txt"); //Needs a place to take inputs from
        OutputFile out = new OutputFile("output.txt"); //Creates new outfile file everytime you run

        int[][]myArray = new int[8][4];

        int index = 0;
        int temp = 0;

        //Starting output
        System.out.println("DOW Temperature Started. Please wait...");

        //Initialize arrays
        for (index = 0; index < 8; index++)
        {
           // myArray[index] = 9999;
            myArray[index][0] = 0;
            myArray[index] [1] = 0;
            myArray[index] [2] = -999;
            myArray[index] [3] = 999;
            //System.out.println(Arrays.toString(myArray));
            
        }
        while (!in.eof())
        {

            //Read ALL input records
            //Read 
            index = in.readInt();
            temp = in.readInt();
            System.out.println(index + " " + temp);

            //Read array
            myArray[index] = temp;
        }

        //Check for a new high temp
        //Check for a new low temp
        //Count days and accumulate temps
        //Reset index
        //Loop to output 7 day record
        //Day not found? Put record data
        //Day not found? Zero fill
        //Increment the index
    }

} //class end
