package ie.atu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        ArrayList <Integer> myList = new ArrayList <>();

        myList.add(100);
        myList.add(200);
        myList.add(300);
        myList.add(400);
        myList.add(500);
        myList.add(600);
        myList.add(700);
        myList.add(800);
        myList.add(900);
        myList.add(1000);
        loop(myList);

      try{
          Scanner myScan = new Scanner(System.in);
          System.out.println("Enter in value ");
          myList.add(myScan.nextInt());
          loop(myList);


      }
      catch(ArrayIndexOutOfBoundsException e) {
          System.out.println("Out of bounds" + e) ;
      }

    }
    public static void loop (ArrayList<Integer> someArrayList)
    {
        int indexValue = 0;
        for (int value: someArrayList){
            System.out.println("Elements at index " + indexValue + " : " + value);
            indexValue++ ;

        }



    }


}
