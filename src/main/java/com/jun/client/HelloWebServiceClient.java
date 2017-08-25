package com.jun.client;

import com.jun.webservice.Greeting;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by zz on 2017/8/25.
 */
public class HelloWebServiceClient {

//    public static final String NAMESPACE_URI="a";

    public static void main(String[] args) {
        JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(Greeting.class);
        factoryBean.setAddress("http://localhost:8080/webservice/Greeting");
        Greeting service= (Greeting) factoryBean.create();
        System.out.println("############Client Greeting################");
        String result=service.greeting("xiaoer");
        System.out.println(result);
    }
}
