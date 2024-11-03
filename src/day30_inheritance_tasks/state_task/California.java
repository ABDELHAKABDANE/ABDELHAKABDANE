package day30_inheritance_tasks.state_task;

public class California extends State{
    public California( String politicalParty, String governor, String senator, int population) {
        super("CA", politicalParty, governor, senator, population);
    }
}

