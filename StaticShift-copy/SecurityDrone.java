

import greenfoot.*;

public class SecurityDrone extends Actor
{
    private int speed = 3;

    public void act()
    {
        setLocation(getX() + speed, getY());

        if (getX() >= 800 || getX() <= 500) {
            speed = -speed;
        }
    }
}


