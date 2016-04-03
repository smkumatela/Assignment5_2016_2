package ac.za.sMkumatela.cput.factories;

import ac.za.sMkumatela.cput.domain.Coach;
import ac.za.sMkumatela.cput.domain.TechnicalTeam;
import ac.za.sMkumatela.cput.domain.Trainer;

/**
 * Created by Songezo on 2016-04-02.
 */
public class TechnicalTeam_Factory {

    private String occupation;
    private String coach;
    private String trainer;

    private static TechnicalTeam_Factory technicalTeam = null;

    public TechnicalTeam_Factory() {
    }

    public static TechnicalTeam_Factory getTechnicalTeamInstance(){
        if (technicalTeam == null) {
            technicalTeam = new TechnicalTeam_Factory();
        }
        return technicalTeam;
    }

    public TechnicalTeam getOccupation(String occupation){
        if ("Defender Coach".equalsIgnoreCase(occupation)){
            return new Coach();
        }
        else
            return new Trainer();
    }

    public static class Builder{
        private String occupation;
        private String coach;
        private String trainer;

        public Builder(String occupation){
            this.occupation = occupation;
        }

        public Builder coach(String value){
            this.coach = value;
            return this;
        }

        public Builder trainer(String value){
            this.trainer = value;
            return this;
        }

        public Builder copy(TechnicalTeam_Factory value){
            this.trainer = value.trainer;
            this.coach = value.coach;
            this.occupation = value.occupation;
            return this;
        }

        public TechnicalTeam_Factory build(){
            return new TechnicalTeam_Factory(this);
        }
    }

    public TechnicalTeam_Factory(Builder builder){
        trainer = builder.trainer;
        coach = builder.coach;
        occupation = builder.occupation;
    }

    public static String getTechnicalTeam(String occupation){
        TechnicalTeam chain = setUpChain();
        return chain.handleRequest(occupation);
    }

    public static TechnicalTeam setUpChain(){
        TechnicalTeam strikerCoach = new Coach();
        TechnicalTeam physicTrainer = new Trainer();

        strikerCoach.setOccupation(physicTrainer);
        physicTrainer.setOccupation(strikerCoach);

        return strikerCoach;
    }
}
