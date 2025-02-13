package com.springdemo.springlearning;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String sayHello(){
        return  "hello from the first controller";
    }

    @PostMapping("/post")
    public String post(@RequestBody String message){
        return "post method in the first controller : "+ message;
    }

    @PostMapping("/order")
    public String order(@RequestBody OrderDTO order){
        return "order is : "+ order.toString();
    }

    @PostMapping("/orderRecord")
    public String orderRecord(@RequestBody OrderRecord orderRecord){
        return "order is : "+ orderRecord.toString();
    }

    //path variables example
    @GetMapping("/hello/{user}")
    public String sayHelloFromPathVariables(@PathVariable  String user){
        return  "hello : "+user;
    }

    //path param example
    @GetMapping("/hello1")
    public String sayHelloFromQueryParams(@RequestParam("username") String user){
        return  "hello : "+user;
    }
}
