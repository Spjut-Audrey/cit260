/*
 * Convert lbs to kg
 */

 import java.util.Scanner;

 public class ConvertWeight {

    private final static double KILOGRAMS_PER_POUND = 0.453592;

     public static void main(String[] args){
         //print message
         
         System.out.println();
         System.out.println("This program converts pounds into kilograms");

         //prompt name
         System.out.println("\nPlease enter name:");

         //create input file for console
         Scanner inFile;
         inFile = new Scanner(System.in);

        //  read value of next line typed
        String name = inFile.nextLine();

        //prompt enter weight in lbs
        System.out.println("\nEnter the weight in pounds:");

        //get value for weight
        double weightInPounds = inFile.nextDouble();

        //convert to kgs
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;

        //display weight in kgs to console
        System.out.println("\n*******************************" + "*******************");
        System.out.println("\t" + name + ", The weight is " + weightInKilograms + " kilograms");

        System.out.println("************************************" + "********************\n");
     }
 }