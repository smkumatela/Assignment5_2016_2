package ac.za.sMkumatela.cput.domain;

/**
 * Created by Songezo on 2016-04-02.
 */
public abstract class TechnicalTeam{

    TechnicalTeam occupation;

    public void  setOccupation(TechnicalTeam occupation){
        this.occupation = occupation;
    }

    public abstract String handleRequest(String request);
}
