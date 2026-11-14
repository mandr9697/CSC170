

import greenfoot.*;

/**
 * The main world for Static Shift.
 */
public class StaticShiftWorld extends World
{
    public StaticShiftWorld()
    {
        super(900, 550, 1);

        // Add the player
        addObject(new Robot(), 100, 430);

        // Add five batteries
        addObject(new Battery(), 230, 430);
        addObject(new Battery(), 350, 430);
        addObject(new Battery(), 470, 430);
        addObject(new Battery(), 590, 430);
        addObject(new Battery(), 770, 430);

        // Add the security drone
        addObject(new SecurityDrone(), 690, 350);
    }
}

