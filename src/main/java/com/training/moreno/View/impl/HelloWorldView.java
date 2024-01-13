package com.training.moreno.View.impl;

import com.training.moreno.View.interfaces.IView;

public class HelloWorldView implements IView {

    @Override
    public String render() {

        return "Hello World";
    }

}
