package ac.za.sMkumatela.cput.factories;

import ac.za.sMkumatela.cput.domain.DevelopmentPlayer;
import ac.za.sMkumatela.cput.domain.Player;
import ac.za.sMkumatela.cput.domain.ProfessionalPlayer;

import java.util.Map;

/**
 * Created by Songezo on 2016-04-03.
 */
public class Player_Factory {

    private String playerStandard;
    private String developmentPlayer;
    private String proffesionalPlayer;

    public static Player_Factory player = null;

    public Player_Factory() {
    }

    public static Player_Factory getPlayerInstance(){
        if (player == null){
            player = new Player_Factory();
        }
        return player;
    }

    public Player getPlayerStandard(String playerStandard){
        if ("Advanced Player".equalsIgnoreCase(playerStandard)){
            return new ProfessionalPlayer();
        }
        else
            return new DevelopmentPlayer();
    }

    public static class Builder{
        private String playerStandard;
        private String developmentPlayer;
        private String proffesionalPlayer;

        public Builder(String playerStandard){
            this.playerStandard = playerStandard;
        }

        public Builder developmentPlayer(String value){
            this.developmentPlayer = value;
            return this;
        }

        public Builder proffssionalPlayer(String value){
            this.proffesionalPlayer = value;
            return this;
        }

        public Builder copy(Player_Factory value){
            this.proffesionalPlayer = value.proffesionalPlayer;
            this.developmentPlayer = value.developmentPlayer;
            this.playerStandard = value.playerStandard;
            return this;
        }

        public Player_Factory build(){
            return new Player_Factory(this);
        }
    }

    public Player_Factory(Builder builder){
        playerStandard = builder.playerStandard;
        developmentPlayer = builder.developmentPlayer;
        proffesionalPlayer = builder.proffesionalPlayer;
    }

    public static Player_Factory createPlayer(Map<String, String> values){
        Player_Factory  player = new Player_Factory.Builder(values.get("Player Standard"))
                .developmentPlayer(values.get("Armature Player")).proffssionalPlayer(values.get("Advanced Player"))
                .build();
        return player;
    }

}
