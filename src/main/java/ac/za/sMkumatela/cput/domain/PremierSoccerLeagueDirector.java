package ac.za.sMkumatela.cput.domain;

/**
 * Created by Songezo on 2016-04-03.
 */
public class PremierSoccerLeagueDirector {

    private PremierSoccerLeagueBuilder premierSoccerLeagueBuilder = null;

    public PremierSoccerLeagueDirector(PremierSoccerLeagueBuilder premierSoccerLeagueBuilder){
        this.premierSoccerLeagueBuilder = premierSoccerLeagueBuilder;
    }

    public void constructPremierSoccerLeague(){
        premierSoccerLeagueBuilder.buildLeagueName();
        premierSoccerLeagueBuilder.buildAbbreviation();
        premierSoccerLeagueBuilder.buildStudium();
    }

    public PremierSoccerLeague getPremierSoccerLeague(){
        return premierSoccerLeagueBuilder.getPremierSoccerLeague();
    }
}
