package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NyseController {

    private static final String template = "Stock Price =  %s %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/nyse")
    public Nyse nyse(@RequestParam(value="stock", defaultValue="LOL") String name) {
    	//https://api.company-target.com/api/v2/ip.json?referrer=&page=https%3A%2F%2Fwww.nyse.com%2Fquote%2FXNYS%3AAA&page_title=NYSE&key=ca1bdc3a51c6a6a7e2600c2e6cd5dcf4
    	//
        return new Nyse(counter.incrementAndGet(),
                            String.format(template, name,name));
    }
}
