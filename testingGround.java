import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;


class Contribution {

    public static void main(String[] args) {


        String fileInput = "contributions.txt"; // input file

        String fileOutput = "results.out"; // the output file to write the result

        final double UPPER_LIMIT = 10000000; // declare constant for 10,000,00
        double min = 0, max = 0;
        double contribution, total = 0;
        int counter = 0;

        try {

            // read the input file using scanner class
            Scanner fileReader = new Scanner(new File(fileInput));


            // loop as long total contribution is less than max there are contributions in the file
            // read line by line
            FileOutputStream filereader = new FileOutputStream("contributions.txt");
            try (PrintWriter pw = new PrintWriter(filereader)) {
            }
            while (fileReader.hasNextDouble() && total < UPPER_LIMIT) {
                // read the contribution amount from the file
                contribution = fileReader.nextDouble();
                // increment counter
                counter += 1;
                // update the min value
                if (counter == 1 || min > contribution) min = contribution;
                // update the max value
                if (counter == 1 || max < contribution) max = contribution;
                // running total of all contribution so far
                total += contribution;
            }
            // close the input file
            fileReader.close();

            // write the data to the output file now
            double average = total / counter;
            FileWriter writer = new FileWriter(new File(fileOutput));
            writer.write(String.format("It took %d contributions to reach the goal.\r\n", counter));
            writer.write(String.format("The maximum contribution received was $%,.2f\r\n", max));
            writer.write(String.format("The minimum contribution received was $%,.2f\r\n", min));
            writer.write(String.format("The average contribution received was $%,.2f\r\n", average));
            writer.write(String.format("A total of $%,.2f was collected.\r\n", total));
            writer.flush();
            writer.close(); // close the output file

        } catch (IOException e) {
            System.out.println("Error: could not read/open file: " + fileInput);
        }
    }
}