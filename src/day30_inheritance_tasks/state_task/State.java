package day30_inheritance_tasks.state_task;

public class State {
    private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population;

    public State(String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(getClass().getSimpleName());
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    private boolean isValidStr(String str){
        return str != null && !str.trim().isEmpty();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isValidStr(name)){
            this.name = name;
        }
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(isValidStr(abbreviation)){
            this.abbreviation = abbreviation;
        }
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (isValidStr(politicalParty)) {
            this.politicalParty = politicalParty;
        }
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if(isValidStr(governor)){
            this.governor = governor;
        }
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(isValidStr(senator)){
            this.senator = senator;
        }
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population > 0){
            this.population = population;
        }
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
/*

State Task Requirements:
1. Create a class named 'State' with the following specifications:
   Attributes:
       - name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int

   Encapsulation Requirements:
       - Ensure attributes are private with getters and setters.
       - Conditions for Encapsulation:
           - 'name', 'abbreviation', 'politicalParty', 'Governor', and 'senator' must not be null, empty, or blank.
           - 'population' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Methods:
       - toString(): Prints the information of the State object.


2. Create the following subclasses of the State class:
      - Virginia
      - California
      - Texas
      - Florida
   - Add any additional fields and methods as necessary.

 */