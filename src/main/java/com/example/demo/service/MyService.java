package com.example.demo.service;

//import com.example.demo.aspect.MyAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Nikki
 * @create 2022-09-05 0:25
 */
@Service
public class MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);

    public void foo(){
        System.out.println("foo()");
//        logger.debug("foo()");
    }
}
