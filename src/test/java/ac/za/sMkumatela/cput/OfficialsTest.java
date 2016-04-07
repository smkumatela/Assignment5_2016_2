package ac.za.sMkumatela.cput;

import ac.za.sMkumatela.cput.domain.Officials;
import ac.za.sMkumatela.cput.factories.Officials_Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Songezo on 2016-04-03.
 */
public class OfficialsTest {

    private Officials_Factory officials_factory;
    private Officials officials;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        officials_factory = new Officials_Factory();
        values = new HashMap<String, String>();

        values.put("match official", "reffere");
        values.put("match official", "lines man");

        officials = officials_factory.getOfficials("reffere");
    }

    @Test
    public void testCreateOfficials() throws Exception {
        Officials_Factory officials = Officials_Factory.createOfficials(values);
        Assert.assertEquals("reffere1", officials.getOfficials("Reffere").requestOfficials("officials"));
//        Assert.assertEquals("reffere1", officials_factory.getOfficials("reffere"));
    }
}
