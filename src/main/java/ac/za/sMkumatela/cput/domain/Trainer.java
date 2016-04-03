package ac.za.sMkumatela.cput.domain;

/**
 * Created by Songezo on 2016-04-02.
 */
public class Trainer extends TechnicalTeam {

    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("Trainer")){
            return "Physical Trainer";
    }
        else
            return occupation.handleRequest(request);
    }
}
