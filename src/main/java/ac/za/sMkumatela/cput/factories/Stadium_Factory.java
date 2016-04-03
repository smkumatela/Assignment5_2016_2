package ac.za.sMkumatela.cput.factories;

import ac.za.sMkumatela.cput.domain.Stadium;

/**
 * Created by Songezo on 2016-04-03.
 */
public class Stadium_Factory {

    private Long id;
    private String name;
    private String location;

    Stadium stadiumIn;

    private static Stadium_Factory stadium = null;

    public Stadium_Factory() {
    }

    public static Stadium_Factory getStadiumInstance(){
        if (stadium == null){
            stadium = new Stadium_Factory();
        }
            return stadium;
    }

    public static class Builder{
        private Long id;
        private String name;
        private String location;

        public Builder(String name){
            this.name = name;
        }

        public Builder location(String value){
            this.location = value;
            return this;
        }

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder copy(Stadium_Factory value){
            this.id = value.id;
            this.location = value.location;
            this.name = value.name;
            return this;
        }

        public Stadium_Factory build(){
            return new Stadium_Factory(this);
        }
    }

    public Stadium_Factory(Builder builder){
        id = builder.id;
        location = builder.location;
        name = builder.name;
    }
}
