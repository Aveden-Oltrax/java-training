package ex05;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of teams:");
        int n = scanner.nextInt();

        List<Team> teamList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter team " + (i + 1) + " detail");
            System.out.println("Enter Name");
            String teamName = scanner.next();
            System.out.println("Enter number of matches");
            long numberOfMatches = scanner.nextLong();

            Team team = new Team(teamName, numberOfMatches);
            teamList.add(team);
        }

        Collections.sort(teamList, new TeamComparator());

        System.out.println("Team list after sort by number of matches");
        for (Team team : teamList) {
            System.out.println(team.getName() + " - " + team.getNumberOfMatches());
        }
        scanner.close();
    }
}

class Team {
    private String name;
    private long numberOfMatches;

    public Team(String name, long numberOfMatches) {
        this.name = name;
        this.numberOfMatches = numberOfMatches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(long numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }
}

class TeamComparator implements Comparator<Team> {
    public int compare(Team team1, Team team2) {
        if (team1.getNumberOfMatches() < team2.getNumberOfMatches()) {
            return -1;
        } else if (team1.getNumberOfMatches() > team2.getNumberOfMatches()) {
            return 1;
        } else {
            return 0;
        }
    }
}
