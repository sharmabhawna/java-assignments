package com.step.assignments.generics;

public abstract class Team<T extends Team> {

    private String teamName;
    private int wonMatches;
    private int lostMatches;
    private int drawMatches;

    public Team(String teamName, int wonMatches, int lostMatches, int drawMatches) {
        this.teamName = teamName;
        this.wonMatches = wonMatches;
        this.lostMatches = lostMatches;
        this.drawMatches = drawMatches;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public int getWonMatches() {
        return this.wonMatches;
    }

    public int getLostMatches() {
        return this.lostMatches;
    }

    public int getDrawMatches() {
        return this.drawMatches;
    }

    public int compareWith(Team otherTeam){
        int myPoints = this.calculatePoints();
        int othersPoints = otherTeam.calculatePoints();
        return myPoints - othersPoints;
    }

    protected abstract int calculatePoints();


}
