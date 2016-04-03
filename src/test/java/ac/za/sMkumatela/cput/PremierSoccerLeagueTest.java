package ac.za.sMkumatela.cput;

import ac.za.sMkumatela.cput.domain.PremierSoccerLeague;
import ac.za.sMkumatela.cput.factories.PremierSoccerLeagueFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Songezo on 2016-04-03.
 */
public class PremierSoccerLeagueTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCreatePremierSoccerLeague() throws Exception {
        Map<String, String> values = new HashMap<String, String>();

        values.put("abbreviation", "PSL");
        values.put("name", "Absa Premiership Soccer League");
        values.put("stadium", "moses mabida");

        PremierSoccerLeague premierSoccerLeague = PremierSoccerLeagueFactory.createPremierSoccerLeague(values);
        Assert.assertEquals("PSL", premierSoccerLeague.getAbbreviation());
    }

    @Test
    public void testUpdatePremierSoccerLegue() throws Exception {
        Map<String, String> values = new HashMap<String, String>();

        values.put("abbreviation", "PSL");
        values.put("name", "Absa Premiership Soccer League");
        values.put("stadium", "Soccer City");

        PremierSoccerLeague premierSoccerLeague = PremierSoccerLeagueFactory.createPremierSoccerLeague(values);
        PremierSoccerLeague newPremierSoccerLeague = new PremierSoccerLeague.Builder(premierSoccerLeague
                .getAbbreviation()).copy(premierSoccerLeague).LeagueName("Berclays Premier Soccer League")
                .build();
        Assert.assertEquals("PSL", newPremierSoccerLeague.getAbbreviation());
        Assert.assertEquals("Berclays Premier Soccer League", newPremierSoccerLeague.getLeagueName());
        Assert.assertEquals("Absa Premiership Soccer League", premierSoccerLeague.getLeagueName());
    }
}
