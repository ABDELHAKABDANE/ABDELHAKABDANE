package day34_abstraction.car_task;

public interface AutoPilot {

    boolean HAS_AUTO_PILOT = true;

    void selfDrive();

}

/*
3. Create a Child Interface of AutoPark Named 'AutoPilot':
    - Note: Use the 'extends' keyword for inheritance.
    - Variables:
        - hasAutoPilot
    - Abstract Method:
        - selfDrive()
 */