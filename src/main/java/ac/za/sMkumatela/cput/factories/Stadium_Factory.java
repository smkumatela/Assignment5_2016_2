package ac.za.sMkumatela.cput.factories;

import ac.za.sMkumatela.cput.domain.Stadium;

import java.util.Map;

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

    public static Stadium createStadium(Map<String, String> values, Long id){
        Stadium stadium = new Stadium.Builder(values.get("name")).location(values.get("England"))
                .id("stdm123").build();
        return stadium;
    }
}
