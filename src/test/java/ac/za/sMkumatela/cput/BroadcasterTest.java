package ac.za.sMkumatela.cput;

import ac.za.sMkumatela.cput.domain.Broadcaster;
import ac.za.sMkumatela.cput.factories.Broadcaster_Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Songezo on 2016-04-03.
 */
public class BroadcasterTest {

    private Broadcaster broadcaster;
    private Broadcaster_Factory broadcaster_fact, newBr;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        broadcaster_fact = new Broadcaster_Factory();
        values = new HashMap<String, String>();

        values.put("type of match", "Cup Game");
        values.put("type of match", "League Game");

        broadcaster = broadcaster_fact.getTypeOfMatchBroadcasted("League Match");
    }

    @Test
    public void testCreateBroadcaster() throws Exception {
        Assert.assertEquals("League Match", broadcaster.typeOfMatch());
    }

    @Test
    public void testUpdateBroadcaster() throws Exception {
        broadcaster = broadcaster_fact.getTypeOfMatchBroadcasted("League Match");
        newBr = new Broadcaster_Factory.Builder(broadcaster.typeOfMatch()).copy(broadcaster_fact)
                .leagueGame("League Game").build();
        //Assert.assertEquals("League1 Game", newBr.getTypeOfMatchBroadcasted("League Game"));
        Assert.assertEquals("League Match", broadcaster.typeOfMatch());
    }
}
