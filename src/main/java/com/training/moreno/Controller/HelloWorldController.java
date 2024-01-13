package com.training.moreno.Controller;


import com.training.moreno.View.impl.HelloWorldView;
import com.training.moreno.View.interfaces.IView;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController  {


    @GetMapping("/")
    public String routeToView() {
        IView helloWorldView= new HelloWorldView();
        return helloWorldView.render();
    }
}
