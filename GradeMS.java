package test.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class GradeMS {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];
        System.out.println("Enter marks of 10 Students : ");

        for (int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("\nStudent Scores :" + Arrays.toString(marks));

        int sum = 0;
        for (int i=0; i<marks.length; i++){
            sum += marks[i];
        }
        System.out.println("Sum of Scores : " + sum);

        double avg = (double) sum / marks.length;
        System.out.println("Average of Scores : " + avg);

        int highest,lowest,passCount,failCount;
        highest = lowest = marks[0];
        passCount=failCount=0;
        for (int mark : marks) {
            if (mark>highest) highest=mark;
            if (mark<lowest) lowest=mark;
            if (mark>=50) passCount++;
            else failCount++;
        }
        System.out.println("Highest Score :" + highest);
        System.out.println("Lowest Score :" + lowest);
        System.out.println("Number of Students Passed :" + passCount);
        System.out.println("Number of Students Failed :" + failCount);

        Arrays.sort(marks);
        System.out.println("Sorted Scores :" + Arrays.toString(marks));

        System.out.println("\nEnter a Score to Search :");
        int searchScore = sc.nextInt();
        boolean found = false;
        for (int mark : marks) {
            if (mark==searchScore) {
                found=true;
                break;
            }
        }
        if (found) {
            System.out.println("Score found in the List !!");
        } else {
            System.out.println("Score not found !!");
        }
        
        System.out.println("\n Grades :");
        for (int i=0; i< marks.length; i++) {
            char grade;
            if (marks[i] >= 90) grade = 'A';
            else if (marks[i] >= 80) grade = 'B';
            else if (marks[i] >= 70) grade = 'C';
            else if (marks[i] >= 60) grade = 'D';
            else if (marks[i] >= 50) grade = 'E';
            else grade = 'F';
            System.out.println("Student " + (i + 1) + ": " + marks[i] + " -> Grade " + grade);
        }

        System.out.println("\nTop 3 Students :");
        for (int i=9; i >= 7; i--) {
            System.out.println("Student with Score : " + marks[i]);
        }

        sc.close();
    }
}
