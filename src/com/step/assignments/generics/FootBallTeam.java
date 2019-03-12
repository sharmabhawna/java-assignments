package com.step.assignments.generics;

public class FootBallTeam extends Team {

    public FootBallTeam(String teamName, int wonMatches, int lostMatches, int drawMatches) {
        super(teamName, wonMatches, lostMatches, drawMatches);
    }

    @Override
    protected int calculatePoints() {
        int gainPoints =  super.getWonMatches() * 1;
        int lostPoints = super.getLostMatches() * -2;
        return gainPoints + lostPoints;
    }
}
