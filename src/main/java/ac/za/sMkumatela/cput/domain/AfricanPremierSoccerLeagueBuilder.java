package ac.za.sMkumatela.cput.domain;

/**
 * Created by Songezo on 2016-04-03.
 */
public class AfricanPremierSoccerLeagueBuilder implements PremierSoccerLeagueBuilder {

    private PremierSoccerLeague premierSoccerLeague;

    public AfricanPremierSoccerLeagueBuilder(){
        premierSoccerLeague = new PremierSoccerLeague();
    }

    public void buildLeagueName() {
        premierSoccerLeague.setLeagueName("Premier Soccer League");
    }

    public void buildAbbreviation() {
        premierSoccerLeague.setAbbreviation("PSL");
    }

    public void buildStudium() {
        premierSoccerLeague.setStadiums("Moses Mabida");
    }

    public PremierSoccerLeague getPremierSoccerLeague() {
        return premierSoccerLeague;
    }
}
