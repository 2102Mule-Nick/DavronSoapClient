
package com.revature.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.revature.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MultiplyName_QNAME = new QName("http://service.revature.com/", "multiplyName");
    private final static QName _MultiplyNameResponse_QNAME = new QName("http://service.revature.com/", "multiplyNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.revature.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MultiplyName }
     * 
     */
    public MultiplyName createMultiplyName() {
        return new MultiplyName();
    }

    /**
     * Create an instance of {@link MultiplyNameResponse }
     * 
     */
    public MultiplyNameResponse createMultiplyNameResponse() {
        return new MultiplyNameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplyName }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.revature.com/", name = "multiplyName")
    public JAXBElement<MultiplyName> createMultiplyName(MultiplyName value) {
        return new JAXBElement<MultiplyName>(_MultiplyName_QNAME, MultiplyName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplyNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.revature.com/", name = "multiplyNameResponse")
    public JAXBElement<MultiplyNameResponse> createMultiplyNameResponse(MultiplyNameResponse value) {
        return new JAXBElement<MultiplyNameResponse>(_MultiplyNameResponse_QNAME, MultiplyNameResponse.class, null, value);
    }

}
