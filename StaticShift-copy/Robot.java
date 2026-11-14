
import greenfoot.*;

/**
 * The player character for Static Shift.
 *
 * @author ajama
 */
public class Robot extends Actor
{
    private int verticalSpeed = 0;
    private final int groundY = 430;

    public void act()
    {
        // Move left
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 4, getY());
        }

        // Move right
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 4, getY());
        }

        // Jump
        if (Greenfoot.isKeyDown("up") && getY() >= groundY) {
            verticalSpeed = -14;
        }

        // Gravity
        verticalSpeed++;

        int newY = getY() + verticalSpeed;

        // Stop at ground level
        if (newY >= groundY) {
            newY = groundY;
            verticalSpeed = 0;
        }

        setLocation(getX(), newY);
    }
}

