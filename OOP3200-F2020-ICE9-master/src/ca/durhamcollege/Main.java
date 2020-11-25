package ca.durhamcollege;

import java.util.Scanner;
import java.util.Vector;

// driver class
public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int numOfPoints = 4;
        Vector<Vector2D> points = new Vector<Vector2D>();
        for (int i = 0; i < numOfPoints; i++)
        {
            points.add(Vector2D.zero());
        }
        points[0];

        Vector2D point1 = new Vector2D();
        System.out.print("Enter the first point (x, y): ");

        String prompt = keyboard.nextLine();
        var values = prompt.split(",");
        point1.set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));


        System.out.println("\n--------------------------------------------------------------" );
        System.out.println("You Entered " + point1.toString() + " for the first point" );
        System.out.println("--------------------------------------------------------------\n" );
        Vector2D point2 =  new Vector2D();


        System.out.print("Enter the second point (x, y): ");

        prompt = keyboard.nextLine();
        values = prompt.split(",");
        point2.set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));

        System.out.println("\n--------------------------------------------------------------" );
        System.out.println("You Entered " + point2.toString() + " for the second point" );
        System.out.println("--------------------------------------------------------------\n" );
        /*
        System.out.printf("Magnitude of first point is: %.3f \n", point1.getMagnitude());
        System.out.printf("Magnitude of second point is: %.3f \n",point2.getMagnitude());
        System.out.printf("Distance between first point and second point is: %.3f \n", Vector2D.distance(point1, point2));
        System.out.println("--------------------------------------------------------------\n" );
         */

        Vector2D point3 = RandomVector.Instance().createVector2D(point1, point2);
        System.out.println("\n------------------------------------------------------------------" );
        System.out.println("Your new Vector is " + point3.toString() + " for the third point." );
        System.out.println("------------------------------------------------------------------\n" );

        Vector2D point4 = RandomVector.Instance().createVector2D(point2, point3);
        System.out.println("\n------------------------------------------------------------------" );
        System.out.println("Your new Vector is " + point4.toString() + " for the fourth point." );
        System.out.println("------------------------------------------------------------------\n" );

        Vector2D point5 = RandomVector.Instance().createVector2D(point3, point4);
        System.out.println("\n------------------------------------------------------------------" );
        System.out.println("Your new Vector is " + point5.toString() + " for the fifth point." );
        System.out.println("------------------------------------------------------------------\n" );

    }
}
