package org.example.my_app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Destop implements Computer{

    public void compile(){
        System.out.println("Compile Destop");
    }

}
