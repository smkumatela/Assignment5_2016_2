package ac.za.sMkumatela.cput.factories;

import ac.za.sMkumatela.cput.domain.Tournaments;

/**
 * Created by Songezo on 2016-04-03.
 */
public class Tournament_Factory {

    private Long id;
    private String tName;
    private int numOfTeams;
    private double prizeMoney;

    Tournaments tournaments;

    private static TechnicalTeam_Factory technicalTeam = null;

    public Tournament_Factory() {
    }

    public static TechnicalTeam_Factory getTechnicalTeamInstance(){
        if (technicalTeam == null){
            technicalTeam = new TechnicalTeam_Factory();
        }
        return technicalTeam;
    }

    public static Tournaments createTournament(String name, int numOfTeams, double prize, Long id){
        Tournaments tournament = new Tournaments.Builder("Nedbank Cup")
                .numOfTeams(16).prizeMoney(2000000).build();
        return tournament;
    }



}
