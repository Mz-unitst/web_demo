package com.mz.demo1.controller;

import com.mz.demo1.Greeting;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
//@RequestMapping(value = "/greeting")
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();
        @GetMapping("/greeting")
        public Greeting show_get(@RequestParam(value = "name",defaultValue = "mz")  String name){
            System.out.println("get has para name="+name);
            if(name.equals("mz")){
                return  new Greeting(1,name);
            }
            else {
                return  new Greeting(2,name);
            }

    }
    @PostMapping ("greeting")
    public Greeting show_post(@RequestParam(value = "user")  String user,@RequestParam(value = "pwd") String pwd){
        System.out.println(" post has para name="+user+"\t"+pwd);
        return new Greeting(3,user+"_"+pwd);
//        return  new Greeting(3,name);
    }
}
