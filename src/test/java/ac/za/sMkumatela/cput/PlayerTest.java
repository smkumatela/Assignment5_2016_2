package ac.za.sMkumatela.cput;

import ac.za.sMkumatela.cput.domain.Player;
import ac.za.sMkumatela.cput.factories.Player_Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Songezo on 2016-04-03.
 */
public class PlayerTest {

    private Player player;
    private Player_Factory player_factory;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        player_factory = new Player_Factory();
        values = new HashMap<String, String>();
        player = player_factory.getPlayerStandard("Professional");
    }

    @Test
    public void testCreatePlayer() throws Exception {
        Assert.assertEquals("Armature Player", player.playerStandard());
    }

    @Test
    public void testUpdatePlayer() throws Exception {
        player = player_factory.getPlayerStandard("Professional");
        Player_Factory newPlayerFactory = new Player_Factory.Builder(player.playerStandard()).copy(player_factory).build();

        Assert.assertEquals("Armature Player", player.playerStandard());
    }
}
