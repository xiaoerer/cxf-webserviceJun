package com.jun.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by zz on 2017/8/25.
 */
@WebService
public interface Greeting {

    public abstract String greeting(@WebParam(name = "username")String userName);
}
