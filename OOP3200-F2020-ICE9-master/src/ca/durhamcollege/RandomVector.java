package ca.durhamcollege;
import java.util.Random;


public class RandomVector
{

    public static Vector2D createVector2D(Vector2D start, Vector2D end)
    {
        //Declarations
        //Gets the minimum and maximum of both coordinates
        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());
        float minY = Math.min(start.getY(), end.getY());
        float maxY = Math.max(start.getY(), end.getY());
        Random rand = new Random(); //instance of a random class
        //Generates 2 random numbers based on the minimum and maximums
        float randomX = (rand.nextFloat() * maxX) + minX;
        float randomY = (rand.nextFloat() * maxY) + minY;
        //Creates a vector using our generated numbers
        Vector2D randomVector = new Vector2D(randomX, randomY);

        return randomVector;
    }

}
