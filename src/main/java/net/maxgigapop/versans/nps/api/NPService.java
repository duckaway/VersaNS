package net.maxgigapop.versans.nps.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2015-02-13T16:17:46.227-05:00
 * Generated source version: 2.4.6
 * 
 */
@WebServiceClient(name = "NPService", 
                  targetNamespace = "http://maxgigapop.net/versans/nps/api/") 
public class NPService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://maxgigapop.net/versans/nps/api/", "NPService");
    public final static QName NPServicePort = new QName("http://maxgigapop.net/versans/nps/api/", "NPServicePort");
    static {
        WSDL_LOCATION = null;
    }

    public NPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public NPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NPService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public NPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public NPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public NPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns NPServicePortType
     */
    @WebEndpoint(name = "NPServicePort")
    public NPServicePortType getNPServicePort() {
        return super.getPort(NPServicePort, NPServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NPServicePortType
     */
    @WebEndpoint(name = "NPServicePort")
    public NPServicePortType getNPServicePort(WebServiceFeature... features) {
        return super.getPort(NPServicePort, NPServicePortType.class, features);
    }

}
