package ac.za.sMkumatela.cput.factories;

import ac.za.sMkumatela.cput.domain.FourthOfficial;
import ac.za.sMkumatela.cput.domain.Officials;
import ac.za.sMkumatela.cput.domain.Reffere;

/**
 * Created by Songezo on 2016-04-02.
 */
public class Officials_Factory {
    private String matchOfficials;
    private String fourthOficial;
    private String reffere;

    private static Officials_Factory officials = null;

    public Officials_Factory() {
    }

    public static Officials_Factory getOfficialsInstance(){
        if (officials == null){
            officials = new Officials_Factory();
        }
        return officials;
    }

    public Officials getOfficials(String matchOfficials){
        if ("Fourth Official".equalsIgnoreCase(matchOfficials)){
            return new FourthOfficial();
        }
        else
            return new Reffere();
    }

    public static class Builder{
        private String matchOfficials;
        private String fourthOficial;
        private String reffere;

        public Builder(String matchOfficials){
            this.matchOfficials = matchOfficials;
        }

        public Builder fourthOfficials(String value){
            this.fourthOficial = value;
            return this;
        }

        public Builder reffere(String value){
            this.reffere = value;
            return this;
        }

        public Builder copy(Officials_Factory value){
            this.reffere = value.reffere;
            this.fourthOficial = value.fourthOficial;
            this.matchOfficials = value.matchOfficials;
            return this;
        }

        public Officials_Factory build(){
            return new Officials_Factory(this);
        }
    }

    public Officials_Factory(Builder builder){
        reffere = builder.reffere;
        fourthOficial = builder.fourthOficial;
        matchOfficials = builder.matchOfficials;
    }

    public static String getOfficialsRef(String matchOfficials){
        Officials chain = setChain();
        return chain.requestOfficials(matchOfficials);
    }

    public static Officials setChain(){
        Officials insideField = new Reffere();
        Officials timeKeeper = new FourthOfficial();

        insideField.setMatchOfficial(timeKeeper);
        timeKeeper.setMatchOfficial(insideField);

        return insideField;
    }
}
