
package secondconverter;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Visual DataFlex Web Service to convert temperature values between Celcius and Fahrenheit
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TemperatureConversions", targetNamespace = "http://webservices.daehosting.com/temperature", wsdlLocation = "file:/C:/Users/User/AppData/Local/Temp/tempdir1609487650722628857.tmp/TemperatureConversions_1.wsdl")
public class TemperatureConversions
    extends Service
{

    private final static URL TEMPERATURECONVERSIONS_WSDL_LOCATION;
    private final static WebServiceException TEMPERATURECONVERSIONS_EXCEPTION;
    private final static QName TEMPERATURECONVERSIONS_QNAME = new QName("http://webservices.daehosting.com/temperature", "TemperatureConversions");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/User/AppData/Local/Temp/tempdir1609487650722628857.tmp/TemperatureConversions_1.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TEMPERATURECONVERSIONS_WSDL_LOCATION = url;
        TEMPERATURECONVERSIONS_EXCEPTION = e;
    }

    public TemperatureConversions() {
        super(__getWsdlLocation(), TEMPERATURECONVERSIONS_QNAME);
    }

    public TemperatureConversions(WebServiceFeature... features) {
        super(__getWsdlLocation(), TEMPERATURECONVERSIONS_QNAME, features);
    }

    public TemperatureConversions(URL wsdlLocation) {
        super(wsdlLocation, TEMPERATURECONVERSIONS_QNAME);
    }

    public TemperatureConversions(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TEMPERATURECONVERSIONS_QNAME, features);
    }

    public TemperatureConversions(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TemperatureConversions(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TemperatureConversionsSoapType
     */
    @WebEndpoint(name = "TemperatureConversionsSoap")
    public TemperatureConversionsSoapType getTemperatureConversionsSoap() {
        return super.getPort(new QName("http://webservices.daehosting.com/temperature", "TemperatureConversionsSoap"), TemperatureConversionsSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TemperatureConversionsSoapType
     */
    @WebEndpoint(name = "TemperatureConversionsSoap")
    public TemperatureConversionsSoapType getTemperatureConversionsSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.daehosting.com/temperature", "TemperatureConversionsSoap"), TemperatureConversionsSoapType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEMPERATURECONVERSIONS_EXCEPTION!= null) {
            throw TEMPERATURECONVERSIONS_EXCEPTION;
        }
        return TEMPERATURECONVERSIONS_WSDL_LOCATION;
    }

}
