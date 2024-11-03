package day30_inheritance_tasks.state_task;

public class StateClients {

    public static void main(String[] args) {
        Virginia virginia = new Virginia("Republican", "Glenn Youngkin", "Tim Kaine", 8535519);
        California california = new California("Democratic", "Gavin Newsom", "Alex Padilla", 39538223);
        Texas texas = new Texas("Republican", "Greg Abbott", "John Cornyn", 29145505);
        Florida florida = new Florida( "Republican", "Ron DeSantis", "Marco Rubio", 21538187);

        System.out.println(virginia);
        System.out.println(california);
        System.out.println(texas);
        System.out.println(florida);
    }
}
/*

3. Create a class named 'StateClients':
   - Create multiple objects representing different states.
   - Test the methods and variables of each object.

 */