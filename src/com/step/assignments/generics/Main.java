package com.step.assignments.generics;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        Team indXiC = new BaseBallTeam("IND XI C", 1, 2, 3);
        Team ausXiC = new BaseBallTeam("AUS XI C", 2, 2, 0);
        Team rsaXiC = new BaseBallTeam("RSA XI C", 1, 1, 1);


        LeagueTable<BaseBallTeam> cricketTeamLeaugeTable = new LeagueTable<BaseBallTeam>(asList(indXiC, ausXiC, rsaXiC));
        cricketTeamLeaugeTable.showLeaderBoard();

        System.out.println("***************************");

        Team indXiF = new FootBallTeam("IND XI F", 1, 2, 3);
        Team ausXiF = new FootBallTeam("AUS XI F", 2, 2, 0);
        Team rsaXiF = new FootBallTeam("RSA XI F", 1, 1, 1);


        LeagueTable<FootBallTeam> footBallTeamLeagueTable = new LeagueTable<FootBallTeam>(asList(indXiF, ausXiF, rsaXiF));
        footBallTeamLeagueTable.showLeaderBoard();

        System.out.println("***************************");

        Team indXiCC = new BaseBallTeam("IND XI C", 1, 2, 3);
        Team ausXiCC = new BaseBallTeam("AUS XI C", 2, 2, 0);
        Team rsaXiCC = new BaseBallTeam("RSA XI C", 1, 1, 1);

        Team indXiFF = new FootBallTeam("IND XI F", 1, 2, 3);
        Team ausXiFF = new FootBallTeam("AUS XI F", 2, 2, 0);
        Team rsaXiFF = new FootBallTeam("RSA XI F", 1, 1, 1);

        LeagueTable<Team> leagueTable = new LeagueTable<>(asList(indXiFF, ausXiFF, rsaXiFF, indXiCC, ausXiCC, rsaXiCC));
        leagueTable.showLeaderBoard();


    }
}
