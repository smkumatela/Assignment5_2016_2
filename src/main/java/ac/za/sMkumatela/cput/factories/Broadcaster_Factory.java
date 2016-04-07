package ac.za.sMkumatela.cput.factories;

import ac.za.sMkumatela.cput.domain.Broadcaster;
import ac.za.sMkumatela.cput.domain.Cup_Game;
import ac.za.sMkumatela.cput.domain.League_Game;

import java.util.Map;

/**
 * Created by Songezo on 2016-04-02.
 */
public class Broadcaster_Factory {

    private String typeOfMatch;
    private String cupGame;
    private String leagueGame;

    private static Broadcaster_Factory broadcaster = null;

    public Broadcaster_Factory(){

    }

    public static Broadcaster_Factory getBroadcasterInstance(){
        if (broadcaster == null){
            broadcaster = new Broadcaster_Factory();
        }
        return broadcaster;
    }

    public Broadcaster getTypeOfMatchBroadcasted(String typeOfMatch){
        if ("Nedbank Cup Match".equalsIgnoreCase(typeOfMatch)){
            return new Cup_Game();
        }
        else
            return new League_Game();
    }

    public static class Builder{
        private String typeOfMatch;
        private String cupGame;
        private String leagueGame;

        public Builder(String typeOfMatch){
            this.typeOfMatch = typeOfMatch;
        }

        public Builder cupGame(String value){
            this.cupGame = value;
            return this;
        }

        public Builder leagueGame(String value){
            this.leagueGame = value;
            return this;
        }

        public Builder copy(Broadcaster_Factory value){
            this.typeOfMatch = value.typeOfMatch;
            this.leagueGame = value.leagueGame;
            this.cupGame = value.cupGame;
            return this;
        }

        public Broadcaster_Factory build(){
            return new Broadcaster_Factory(this);
        }

    }

    public Broadcaster_Factory(Builder builder){
        typeOfMatch = builder.typeOfMatch;
        cupGame = builder.cupGame;
        leagueGame = builder.leagueGame;
    }

    public static Broadcaster_Factory createBoadcaster(Map<String, String> values){
        Broadcaster_Factory broadcaster = new Broadcaster_Factory.Builder(values.get("Type of Match"))
                .leagueGame(values.get("First Leg Match")).cupGame(values.get("Nedbank Cup Match")).build();
        return broadcaster;
    }
}
