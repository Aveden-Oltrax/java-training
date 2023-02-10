package Ex03q02;

public class Innings {
    private String teamname;
    private String inningsname;
    private int runs;

    public String getInningsname() {
        return inningsname;
    }

    public int getRuns() {
        return runs;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setInningsname(String inningsname) {
        this.inningsname = inningsname;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public void displayInningsDetails(){
        System.out.println("Innings Name: " + getInningsname());
        System.out.println("Team Name: " + getTeamname());
        System.out.println("Innings Runs: " + getRuns());
    }
    
}
