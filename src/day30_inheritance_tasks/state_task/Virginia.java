package day30_inheritance_tasks.state_task;

public class Virginia extends State{
    public Virginia(String politicalParty, String governor, String senator, int population) {
        super("VA", politicalParty, governor, senator, population);
    }
}