package main.java.ac.lou.poja.endpoint.rest.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
public class GetOdd {
    @GetMapping("/odd")
    public static int GetOdd(){
        int n = (int) (Integer.MAX_VALUE * Math.random());
        return n % 2 == 0 ? n + 1 : n;
}
}