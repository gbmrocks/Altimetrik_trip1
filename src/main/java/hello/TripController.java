package hello;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class TripController {

 //   private static final String template = "%s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/trip")
    public Trip Trip(@RequestParam(value="srcCity", defaultValue="NYC") String srcCity,@RequestParam(value="dstCity", defaultValue="SFO") String dstCity,@RequestParam(value="startDate", defaultValue="") String startDate,@RequestParam(value="days", defaultValue="") String days) {
    	//https://api.company-target.com/api/v2/ip.json?referrer=&page=https%3A%2F%2Fwww.nyse.com%2Fquote%2FXNYS%3AAA&page_title=NYSE&key=ca1bdc3a51c6a6a7e2600c2e6cd5dcf4
    	//https://api.sandbox.amadeus.com/v1.2/flights/inspiration-search?apikey=bMD0cDLgo1TrKYSGi7YNYnLXNqmVvmez&origin=NYC&destination=SFO&departure_date=2018-05-18&one-way=false&duration=2"
      
    	   
    	if(srcCity.equalsIgnoreCase(dstCity))
        {
        	return new Trip(counter.incrementAndGet(),
                    "Source and Destination can not be same!");
        }
    	if(startDate.equalsIgnoreCase(""))
    	{
        	return new Trip(counter.incrementAndGet(),
                    "Please enter date");
    	}
    	else
    	{
    		SimpleDateFormat format = new SimpleDateFormat("mm/dd/yyyy");

    		
    		     try {
    		          format.parse(startDate);
    			     }
    		     catch(ParseException e){
    		    		return new Trip(counter.incrementAndGet(),
    		                    "Invalid date");
    			     }
    		}
    	
    	if(days.equalsIgnoreCase("")||Integer.valueOf(days)<=0)
    	{
        	return new Trip(counter.incrementAndGet(),
                    "Invalid days");
    	}
    	String r="";
    	try {
    		   URL url = new URL("https://api.sandbox.amadeus.com/v1.2/flights/extensive-search?apikey=bMD0cDLgo1TrKYSGi7YNYnLXNqmVvmez&origin=NYC&destination=SFO&departure_date=2018-06-29&duration=2");
    		   Scanner s = new Scanner(url.openStream());
    		   // read from your scanner
    		  while(s.hasNext())
    		  {
    			  r+=s.nextLine();
    		  }
    		  ObjectMapper mapper = new ObjectMapper();

  			// read JSON from a file
  			Map<String, Object> map = mapper.readValue(
  					r, 
  					new TypeReference<Map<String, Object>>() {
  			});

  			System.out.println(map.get("origin"));
  			System.out.println(map.get("currency"));
  			System.out.println(map.get("results"));

//  			@SuppressWarnings("unchecked")
//  			ArrayList<String> list = (ArrayList<String>) map.get("results");
//
//  			for (String msg : list) {
//  				System.out.println(msg);
//  			}
    		}
    		catch(IOException ex) {
    		   // there was some connection problem, or the file did not exist on the server,
    		   // or your URL was not in the right format.
    		   // think about what to do now, and put it here.
    		   ex.printStackTrace(); // for now, simply output it.
    		}
    	return new Trip(counter.incrementAndGet(),
                            r+"");
    }

}
