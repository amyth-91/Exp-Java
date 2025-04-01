package test.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrAssignment {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] eles = new Integer[10] ;
        System.out.println("Enter the 10 elements : ");
        for (int i=0; i<10; i++) {
            eles [i] = sc.nextInt();
        }
        System.out.println("\nElements Entered :" + Arrays.toString(eles));

        int sum = 0;
        for(int i = 0; i< eles.length; i++) {
            sum += eles[i];
        }
        System.out.println("Sum of Elements :" + sum);

        double avg = (double)sum/ eles.length;
        System.out.println("Average of Elements :" + avg);

        int largest,smallest;
        largest = smallest = eles[0];
        for (int ele : eles) {
            if (ele > largest) largest = ele;
            if (ele < smallest) smallest = ele;
        }
        System.out.println("Highest Element of the given Array :" + largest);
        System.out.println("Lowest Element of the given Array :" + smallest);

        Arrays.sort(eles);
        System.out.println("Sorted Order :" + Arrays.toString(eles));

        Arrays.sort(eles, Collections.reverseOrder());
        System.out.println("Reversed Order : " + Arrays.toString(eles));

        sc.close();
    }
}
