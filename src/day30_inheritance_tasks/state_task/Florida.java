package day30_inheritance_tasks.state_task;

public class Florida extends State{
    public Florida( String politicalParty, String governor, String senator, int population) {
        super("FL", politicalParty, governor, senator, population);
    }
}
