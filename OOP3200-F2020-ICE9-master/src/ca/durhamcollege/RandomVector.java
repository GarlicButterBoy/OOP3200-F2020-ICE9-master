package ca.durhamcollege;
import java.util.Random;

public class RandomVector
{
    private Random m_rand;

    //Step 1. private static instance
    private static RandomVector m_instance = null;
    //Step 2. private deconstructor
    private RandomVector()
    {
        m_rand = new Random(); //instance of a random class
    }
    //Step 3. Make a public instance method that acts as a "portal" to the class
    public static RandomVector Instance()
    {
        if(m_instance == null)
        {
            m_instance = new RandomVector();
        }

        return m_instance;
    }

    public final Vector2D createVector2D(final Vector2D start, final Vector2D end)
    {
        //Declarations
        //Gets the minimum and maximum of both coordinates
        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());
        float minY = Math.min(start.getY(), end.getY());
        float maxY = Math.max(start.getY(), end.getY());

        //Generates 2 random numbers based on the minimum and maximums
        float randomX = (m_rand.nextFloat() * maxX) + minX;
        float randomY = (m_rand.nextFloat() * maxY) + minY;
        //Creates a vector using our generated numbers
        Vector2D randomVector = new Vector2D(randomX, randomY);

        return randomVector;
    }

}
