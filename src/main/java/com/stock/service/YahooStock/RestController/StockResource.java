package com.stock.service.YahooStock.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/stock/")
public class StockResource {
	
        @Autowired
    	RestTemplate restTemplate;
    	
	@GetMapping("/username")
   public ResponseEntity<String> getResponse()
   {
		//System.out.println("Client Testing");
	   ResponseEntity<String> name=restTemplate.exchange("http://username-service/api/viewstock/view", HttpMethod.GET,null,String.class);
       
	   return name;
   }
}
