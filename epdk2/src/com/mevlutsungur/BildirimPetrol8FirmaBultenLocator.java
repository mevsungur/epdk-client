/**
 * BildirimPetrol8FirmaBultenLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mevlutsungur;

public class BildirimPetrol8FirmaBultenLocator extends org.apache.axis.client.Service implements com.mevlutsungur.BildirimPetrol8FirmaBulten {

    public BildirimPetrol8FirmaBultenLocator() {
    }


    public BildirimPetrol8FirmaBultenLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BildirimPetrol8FirmaBultenLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for bildirimPetrol8FirmaBultenHttpSoap12Endpoint
    private java.lang.String bildirimPetrol8FirmaBultenHttpSoap12Endpoint_address = "http://lisansws.epdk.org.tr/services/bildirimPetrol8FirmaBulten.bildirimPetrol8FirmaBultenHttpSoap12Endpoint";

    public java.lang.String getbildirimPetrol8FirmaBultenHttpSoap12EndpointAddress() {
        return bildirimPetrol8FirmaBultenHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String bildirimPetrol8FirmaBultenHttpSoap12EndpointWSDDServiceName = "bildirimPetrol8FirmaBultenHttpSoap12Endpoint";

    public java.lang.String getbildirimPetrol8FirmaBultenHttpSoap12EndpointWSDDServiceName() {
        return bildirimPetrol8FirmaBultenHttpSoap12EndpointWSDDServiceName;
    }

    public void setbildirimPetrol8FirmaBultenHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        bildirimPetrol8FirmaBultenHttpSoap12EndpointWSDDServiceName = name;
    }

    public com.mevlutsungur.BildirimPetrol8FirmaBultenPortType getbildirimPetrol8FirmaBultenHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(bildirimPetrol8FirmaBultenHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getbildirimPetrol8FirmaBultenHttpSoap12Endpoint(endpoint);
    }

    public com.mevlutsungur.BildirimPetrol8FirmaBultenPortType getbildirimPetrol8FirmaBultenHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mevlutsungur.BildirimPetrol8FirmaBultenSoap12BindingStub _stub = new com.mevlutsungur.BildirimPetrol8FirmaBultenSoap12BindingStub(portAddress, this);
            _stub.setPortName(getbildirimPetrol8FirmaBultenHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setbildirimPetrol8FirmaBultenHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        bildirimPetrol8FirmaBultenHttpSoap12Endpoint_address = address;
    }


    // Use to get a proxy class for bildirimPetrol8FirmaBultenHttpSoap11Endpoint
    private java.lang.String bildirimPetrol8FirmaBultenHttpSoap11Endpoint_address = "http://lisansws.epdk.org.tr/services/bildirimPetrol8FirmaBulten.bildirimPetrol8FirmaBultenHttpSoap11Endpoint";

    public java.lang.String getbildirimPetrol8FirmaBultenHttpSoap11EndpointAddress() {
        return bildirimPetrol8FirmaBultenHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String bildirimPetrol8FirmaBultenHttpSoap11EndpointWSDDServiceName = "bildirimPetrol8FirmaBultenHttpSoap11Endpoint";

    public java.lang.String getbildirimPetrol8FirmaBultenHttpSoap11EndpointWSDDServiceName() {
        return bildirimPetrol8FirmaBultenHttpSoap11EndpointWSDDServiceName;
    }

    public void setbildirimPetrol8FirmaBultenHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        bildirimPetrol8FirmaBultenHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.mevlutsungur.BildirimPetrol8FirmaBultenPortType getbildirimPetrol8FirmaBultenHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(bildirimPetrol8FirmaBultenHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getbildirimPetrol8FirmaBultenHttpSoap11Endpoint(endpoint);
    }

    public com.mevlutsungur.BildirimPetrol8FirmaBultenPortType getbildirimPetrol8FirmaBultenHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mevlutsungur.BildirimPetrol8FirmaBultenSoap11BindingStub _stub = new com.mevlutsungur.BildirimPetrol8FirmaBultenSoap11BindingStub(portAddress, this);
            _stub.setPortName(getbildirimPetrol8FirmaBultenHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setbildirimPetrol8FirmaBultenHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        bildirimPetrol8FirmaBultenHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.mevlutsungur.BildirimPetrol8FirmaBultenPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mevlutsungur.BildirimPetrol8FirmaBultenSoap12BindingStub _stub = new com.mevlutsungur.BildirimPetrol8FirmaBultenSoap12BindingStub(new java.net.URL(bildirimPetrol8FirmaBultenHttpSoap12Endpoint_address), this);
                _stub.setPortName(getbildirimPetrol8FirmaBultenHttpSoap12EndpointWSDDServiceName());
                return _stub;
            }
            if (com.mevlutsungur.BildirimPetrol8FirmaBultenPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mevlutsungur.BildirimPetrol8FirmaBultenSoap11BindingStub _stub = new com.mevlutsungur.BildirimPetrol8FirmaBultenSoap11BindingStub(new java.net.URL(bildirimPetrol8FirmaBultenHttpSoap11Endpoint_address), this);
                _stub.setPortName(getbildirimPetrol8FirmaBultenHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("bildirimPetrol8FirmaBultenHttpSoap12Endpoint".equals(inputPortName)) {
            return getbildirimPetrol8FirmaBultenHttpSoap12Endpoint();
        }
        else if ("bildirimPetrol8FirmaBultenHttpSoap11Endpoint".equals(inputPortName)) {
            return getbildirimPetrol8FirmaBultenHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://genel.service.ws.epvys.g222.tubitak.gov.tr/", "bildirimPetrol8FirmaBulten");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://genel.service.ws.epvys.g222.tubitak.gov.tr/", "bildirimPetrol8FirmaBultenHttpSoap12Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://genel.service.ws.epvys.g222.tubitak.gov.tr/", "bildirimPetrol8FirmaBultenHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("bildirimPetrol8FirmaBultenHttpSoap12Endpoint".equals(portName)) {
            setbildirimPetrol8FirmaBultenHttpSoap12EndpointEndpointAddress(address);
        }
        else 
if ("bildirimPetrol8FirmaBultenHttpSoap11Endpoint".equals(portName)) {
            setbildirimPetrol8FirmaBultenHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
