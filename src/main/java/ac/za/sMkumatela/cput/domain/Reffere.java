package ac.za.sMkumatela.cput.domain;

/**
 * Created by Songezo on 2016-04-02.
 */
public class Reffere extends Officials {

    @Override
    public String requestOfficials(String request) {
        if (request.equalsIgnoreCase("whistle Blower")){
            return "Reffere";
        }
        else
        {
            return matchOfficial.requestOfficials("Reffere");
        }
    }
}
