package day30_inheritance_tasks.state_task;

public class Texas extends State{
    public Texas( String politicalParty, String governor, String senator, int population) {
        super("TX", politicalParty, governor, senator, population);
    }
}