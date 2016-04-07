package ac.za.sMkumatela.cput;

import ac.za.sMkumatela.cput.domain.Coach;
import ac.za.sMkumatela.cput.domain.Trainer;
import ac.za.sMkumatela.cput.factories.TechnicalTeam_Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Songezo on 2016-04-03.
 */
public class TechnicalTeamTest {

    private Coach coach;
    private Trainer trainer;
//    private TechnicalTeam technicalTeam;
    private TechnicalTeam_Factory team_factory;
    private String playerCoach = "hj";
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, String>();

        values.put("occupation", "coach");
        values.put("coach", "Defence coach");
        values.put("trainer", "physical trainer");
        team_factory = new TechnicalTeam_Factory();
        coach = new Coach();
        trainer = new Trainer();
    }

    @Test
    public void testCreateTechnicalTeam() throws Exception {
        TechnicalTeam_Factory technicalTeam = TechnicalTeam_Factory.createTechnicalTeam(values);
        Assert.assertEquals("coach", technicalTeam.getCoachRole("").handleRequest("jguy"));

    }
}
