package ac.za.sMkumatela.cput.factories;

import ac.za.sMkumatela.cput.domain.PremierSoccerLeague;

import java.util.Map;

/**
 * Created by Songezo on 2016-04-03.
 */
public class PremierSoccerLeagueFactory {
    public static PremierSoccerLeague createPremierSoccerLeague(Map<String, String> values){
        PremierSoccerLeague premierSoccerLeague = new PremierSoccerLeague
                .Builder(values.get("abbreviation"))
                .LeagueName(values.get("name"))
                .stadium(values.get("stadium"))
                .build();
        return premierSoccerLeague;
    }
}
