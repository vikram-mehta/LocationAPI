package io.swagger.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.InlineResponse200;

import io.swagger.annotations.*;

import io.swagger.model.Location;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;


import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-24T16:07:52.906Z")

@Controller
public class LocationsApiController implements LocationsApi {


    public ResponseEntity<List<InlineResponse200>> getLocations(@NotNull @ApiParam(value = "Search radius in Miles", required = true) @RequestParam(value = "radius", required = true) String radius,
                                                                @NotNull @ApiParam(value = "", required = true) @RequestParam(value = "maxResults", required = true) String maxResults,
                                                                @NotNull @ApiParam(value = "", required = true) @RequestParam(value = "state", required = true) String state,
                                                                @NotNull @ApiParam(value = "", required = true) @RequestParam(value = "zipCode", required = true) String zipCode,
                                                                @NotNull @ApiParam(value = "Possible values \"ATM\" or \"Branch\"", required = true) @RequestParam(value = "locationType", required = true) String locationType,
                                                                @ApiParam(value = "") @RequestParam(value = "streetName", required = false) String streetName,
                                                                @ApiParam(value = "") @RequestParam(value = "city", required = false) String city,
                                                                @ApiParam(value = "") @RequestParam(value = "streetNumber", required = false) String streetNumber,
                                                                @ApiParam(value = "") @RequestParam(value = "crossStreet", required = false) String crossStreet,
                                                                @ApiParam(value = "") @RequestParam(value = "longitude", required = false) String longitude,
                                                                @ApiParam(value = "") @RequestParam(value = "latitude", required = false) String latitude) {
        // do some magic!
        System.out.println("+++++++ Inside Controller>>>>>>>>>>>>>>>>>>>>>>>>...");

        return new ResponseEntity<List<InlineResponse200>>(searchMapQuest(radius, maxResults, state, zipCode, locationType, streetName, city, streetNumber, crossStreet, longitude, latitude), HttpStatus.OK);
        //return new ResponseEntity<Location>(loc,HttpStatus.OK);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

//    public static void main(String ar[])
//    {
//        LocationsApiController apiController = new LocationsApiController();
//        apiController.searchMapQuest();
//    }

    public List<InlineResponse200> searchMapQuest(String radius, String maxResults, String state, String zipCode, String locationType, String streetName, String city, String streetNumber, String crossStreet, String longitude, String latitude) {
        RestTemplate restTemplate = new RestTemplate();
        List<InlineResponse200> locList = new ArrayList<InlineResponse200>();


        try {

             for (int i=0;i<10;i++) {
                InlineResponse200 loc = new InlineResponse200();
                loc.setName("name> "+i);
                loc.setStreetAddress("address> "+i);
                loc.setCity("city> "+i);
                loc.setZipCode("postal> "+i);
                loc.setState("state> "+i);
                if (!locationType.equals("ATM")) {
                    loc.setTelephone("Phone_Published> "+i);
                    //                 location.telephone = searchResult[i].fields.Phone_Published;
                    loc.setFax("Fax> "+i);
                    //                   location.fax = searchResult[i].fields.Fax;
                }
                loc.setHourOfOperation("Hours> "+i);
                loc.setSpecialMessage("Speech_Special_Br_Message> "+i);
                loc.setDistance("distance> "+i);
                loc.setLocationType(locationType);
                loc.setLatitude("lat"+1);
                loc.setLongitude("mqap_geography> "+i);
                locList.add(loc);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return locList;

    }

}
