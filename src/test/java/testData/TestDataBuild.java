package testData;

import pojo.AddPlaceRequest;
import pojo.Location;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuild {

    public  AddPlaceRequest addPlacePayload(String name,String lang,String address){
        AddPlaceRequest ap = new AddPlaceRequest();
        ap.setAccuracy(50);
        ap.setAddress(address);
        ap.setWebsite("http://google.com");
        ap.setLanguage(lang);
        ap.setName(name);

        List<String> list = new ArrayList<>();
        list.add("shoe park");
        list.add("shop");

        ap.setTypes(list);

        Location l = new Location();
        l.setLng(-38.383494);
        l.setLat(33.427362);
        ap.setLocation(l);
        return ap;
    }

    public String deletePlaceAPIPayload(String placeId){
        return "{\n    \"place_id\":\""+placeId+"\"\n}\n";
    }


}
