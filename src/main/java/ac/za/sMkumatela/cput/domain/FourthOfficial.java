package ac.za.sMkumatela.cput.domain;

/**
 * Created by Songezo on 2016-04-02.
 */
public class FourthOfficial extends Officials {

    @Override
    public String requestOfficials(String request) {
        if (request.equalsIgnoreCase("Time Keeper")){
            return "Fourth Official";
        }
        else
        {
            return matchOfficial.requestOfficials("Fourth Official");
        }
    }
}
