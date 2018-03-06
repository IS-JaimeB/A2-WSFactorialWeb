/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsfactorial;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jaime
 */
@WebService(serviceName = "WSFactorial")
public class WSFactorial {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "factorial")
    public double factorial(@WebParam(name = "n1") double n1) {
        double result = 1;

        for (int factor = 2; factor <= n1; factor++) {
            result *= factor;
        }

        return result;
    }
}
