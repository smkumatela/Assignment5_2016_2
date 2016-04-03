package ac.za.sMkumatela.cput;

import ac.za.sMkumatela.cput.domain.Stadium;
import ac.za.sMkumatela.cput.factories.Stadium_Factory;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Songezo on 2016-04-03.
 */
public class StadiumTest {

    private Stadium stadium;
    private Stadium_Factory stadium_factory;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        stadium = new Stadium();
        stadium_factory = new Stadium_Factory();

        values.put("name", "moses mabida");
        values.put("location", "durban");
    }

    @Test
    public void testCreateStadium() throws Exception {
    }
}
