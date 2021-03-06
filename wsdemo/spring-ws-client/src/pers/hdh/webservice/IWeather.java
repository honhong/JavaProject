
package pers.hdh.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IWeather", targetNamespace = "http://webservice.hdh.pers/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IWeather {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWeatherInfo", targetNamespace = "http://webservice.hdh.pers/", className = "pers.hdh.webservice.GetWeatherInfo")
    @ResponseWrapper(localName = "getWeatherInfoResponse", targetNamespace = "http://webservice.hdh.pers/", className = "pers.hdh.webservice.GetWeatherInfoResponse")
    public String getWeatherInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
