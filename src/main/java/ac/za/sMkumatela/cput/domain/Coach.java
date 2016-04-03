package ac.za.sMkumatela.cput.domain;

/**
 * Created by Songezo on 2016-04-02.
 */
public class Coach extends TechnicalTeam {

    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("Coach")){
            return "Defender Coach";
        }
        else
            return occupation.handleRequest(request);
    }
}
