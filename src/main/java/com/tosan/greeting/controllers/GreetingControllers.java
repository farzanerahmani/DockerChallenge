package com.tosan.greeting.controllers;

import com.tosan.greeting.utils.CaseUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllers {

    @RequestMapping(method = RequestMethod.GET,value = "/helloworld")
    public String helloWorld(){
        return "Hello Stranger";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/hello/{name}")
    public String helloUser(@PathVariable("name")String name){
        return "Hello"+" "+ CaseUtils.toCamelCase(name);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/author")
    public String helloAuthor(){
        return "Farzane Rahmani";
    }

}
