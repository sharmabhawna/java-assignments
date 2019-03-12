package com.step.assignments.generics;

public class BaseBallTeam extends Team{

    public BaseBallTeam(String teamName, int wonMatches, int lostMatches, int drawMatches) {
        super(teamName, wonMatches, lostMatches, drawMatches);
    }

    @Override
    protected int calculatePoints() {
        int winPoints =  super.getWonMatches() * 2;
        int drawPoints = super.getDrawMatches() * 1;
        return winPoints + drawPoints;
    }
}
