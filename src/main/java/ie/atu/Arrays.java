package ie.atu;


import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        ArrayList <Integer> myList = new ArrayList <>();

        int[] anArray = new int[10];

        anArray[0] = 100;

        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        loop(myList);

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);







      try{
          Scanner myScan = new Scanner(System.in);
          System.out.println("Enter in value ");
          anArray[10]= myScan.nextInt();
          System.out.println("Element at index 10: " + anArray[10]);


      }
      catch(ArrayIndexOutOfBoundsException e) {

          
         

          System.out.println("Out of bounds");

      }

    }
    public static void loop (ArrayList<Integer> someArrayList)
    {
        int indexValue = 0;
        for (int value: someArrayList){
            System.out.println("Elements at index" + " : " + indexValue );
            indexValue++ ;

        }



    }


}
