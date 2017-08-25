package com.jun.webservice;

import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.Calendar;

/**
 * Created by zz on 2017/8/25.
 * 服务端
 */
@WebService(endpointInterface = "com.jun.webservice.Greeting")
public class GreetingImpl implements Greeting{

    public String greeting(String userName) {
        return "Hello"+userName+",currentTime is "+ Calendar.getInstance().getTime();
    }
}
