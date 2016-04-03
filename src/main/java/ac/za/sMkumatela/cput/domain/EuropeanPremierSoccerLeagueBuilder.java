package ac.za.sMkumatela.cput.domain;

/**
 * Created by Songezo on 2016-04-03.
 */
public class EuropeanPremierSoccerLeagueBuilder implements PremierSoccerLeagueBuilder {

    private PremierSoccerLeague premierSoccerLeague;

    public EuropeanPremierSoccerLeagueBuilder(PremierSoccerLeague premierSoccerLeague) {
        this.premierSoccerLeague = premierSoccerLeague;
    }

    public void buildLeagueName() {
        premierSoccerLeague.setLeagueName("Berclays Premier Soccer League");
    }

    public void buildAbbreviation() {
        premierSoccerLeague.setAbbreviation("BPL");
    }

    public void buildStudium() {
        premierSoccerLeague.setStadiums("Old Trafford");
    }

    public PremierSoccerLeague getPremierSoccerLeague() {
        return premierSoccerLeague;
    }
}
