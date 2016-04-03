package ac.za.sMkumatela.cput;

import ac.za.sMkumatela.cput.domain.Coach;
import ac.za.sMkumatela.cput.domain.TechnicalTeam;
import ac.za.sMkumatela.cput.domain.Trainer;
import ac.za.sMkumatela.cput.factories.TechnicalTeam_Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-04-03.
 */
public class TechnicalTeamTest {

    private Coach coach;
    private Trainer trainer;
    private TechnicalTeam technicalTeam;
    private TechnicalTeam_Factory team_factory;
    private String playerCoach = "hj";

    @Before
    public void setUp() throws Exception {
        team_factory = new TechnicalTeam_Factory();
        coach = new Coach();
        trainer = new Trainer();
    }

    @Test
    public void testCreateTechnicalTeam() throws Exception {
        coach = (Coach) team_factory.getOccupation(playerCoach);
        Assert.assertEquals("coach", team_factory.getOccupation("").toString());

    }
}
