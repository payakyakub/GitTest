package com.java.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitTestApplication {

    @PostMapping("/purchase")
    public String purchase(@RequestBody Order order){
    return "Hi "+order.getUserName() +" order for"+order.getProductName()+"with amount "+order.getAmount()+" stored successfully..!!!";

    }


    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
    }

}
