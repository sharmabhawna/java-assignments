package com.step.assignments.generics;

import java.util.Comparator;
import java.util.List;

public class LeagueTable<T extends Team> {

    private List<Team> teams;

    public LeagueTable(List<Team> teams) {
        this.teams = teams;
    }

    public void showLeaderBoard(){
        this.teams.sort(new Comparator<Team>() {
            @Override
            public int compare(Team team1, Team team2) {
               return team2.compareWith(team1);
            }
        });
        for (Team team : this.teams) {
            System.out.println(team.getTeamName() + " " + team.calculatePoints());
        }
    }
}
