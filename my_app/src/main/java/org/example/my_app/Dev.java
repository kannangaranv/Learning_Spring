package org.example.my_app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired //Field injection
    @Qualifier("laptop")
    private Computer computer;

//    public Dev(Laptop laptop) { //constructor injection
//        this.laptop = laptop;
//    }
//    private Computer laptop;
//
//    @Autowired // setter injection
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public  void build(){

        computer.compile();
        System.out.println("Build Dev");
    }
}
