package ac.za.sMkumatela.cput.domain;

/**
 * Created by Songezo on 2016-04-02.
 */
public abstract class Officials {

    Officials matchOfficial;

    public void setMatchOfficial(Officials matchOfficial){
        this.matchOfficial = matchOfficial;
    }

    public abstract String requestOfficials(String request);
}
