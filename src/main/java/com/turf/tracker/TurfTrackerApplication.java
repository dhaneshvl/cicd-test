package com.turf.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TurfTrackerApplication {

    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable String name) {
        name = name.split(" ")[0];
        return "Hello " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(TurfTrackerApplication.class, args);
    }

}
