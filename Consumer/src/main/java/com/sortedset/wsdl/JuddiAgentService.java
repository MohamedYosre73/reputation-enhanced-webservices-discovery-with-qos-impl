
package com.sortedset.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "JuddiAgentService", targetNamespace = "http://sortedset.com/wsdl", wsdlLocation = "http://localhost:9999/ws/juddi/agent/find?wsdl")
public class JuddiAgentService
    extends Service
{

    private final static URL JUDDIAGENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException JUDDIAGENTSERVICE_EXCEPTION;
    private final static QName JUDDIAGENTSERVICE_QNAME = new QName("http://sortedset.com/wsdl", "JuddiAgentService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/ws/juddi/agent/find?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        JUDDIAGENTSERVICE_WSDL_LOCATION = url;
        JUDDIAGENTSERVICE_EXCEPTION = e;
    }

    public JuddiAgentService() {
        super(__getWsdlLocation(), JUDDIAGENTSERVICE_QNAME);
    }

    public JuddiAgentService(WebServiceFeature... features) {
        super(__getWsdlLocation(), JUDDIAGENTSERVICE_QNAME, features);
    }

    public JuddiAgentService(URL wsdlLocation) {
        super(wsdlLocation, JUDDIAGENTSERVICE_QNAME);
    }

    public JuddiAgentService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JUDDIAGENTSERVICE_QNAME, features);
    }

    public JuddiAgentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JuddiAgentService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns JuddiAgentWebservice
     */
    @WebEndpoint(name = "JuddiAgentPort")
    public JuddiAgentWebservice getJuddiAgentPort() {
        return super.getPort(new QName("http://sortedset.com/wsdl", "JuddiAgentPort"), JuddiAgentWebservice.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JuddiAgentWebservice
     */
    @WebEndpoint(name = "JuddiAgentPort")
    public JuddiAgentWebservice getJuddiAgentPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sortedset.com/wsdl", "JuddiAgentPort"), JuddiAgentWebservice.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JUDDIAGENTSERVICE_EXCEPTION!= null) {
            throw JUDDIAGENTSERVICE_EXCEPTION;
        }
        return JUDDIAGENTSERVICE_WSDL_LOCATION;
    }

}
