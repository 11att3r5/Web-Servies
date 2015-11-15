
package ciphersoapclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ciphersoapclient package. 
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

    private final static QName _ArgumentException_QNAME = new QName("http://Encryption/", "ArgumentException");
    private final static QName _Cipher_QNAME = new QName("http://Encryption/", "Cipher");
    private final static QName _Decipher_QNAME = new QName("http://Encryption/", "decipher");
    private final static QName _DecipherResponse_QNAME = new QName("http://Encryption/", "decipherResponse");
    private final static QName _CipherResponse_QNAME = new QName("http://Encryption/", "CipherResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ciphersoapclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CipherResponse }
     * 
     */
    public CipherResponse createCipherResponse() {
        return new CipherResponse();
    }

    /**
     * Create an instance of {@link Decipher }
     * 
     */
    public Decipher createDecipher() {
        return new Decipher();
    }

    /**
     * Create an instance of {@link CipherException }
     * 
     */
    public CipherException createCipherException() {
        return new CipherException();
    }

    /**
     * Create an instance of {@link Cipher }
     * 
     */
    public Cipher createCipher() {
        return new Cipher();
    }

    /**
     * Create an instance of {@link DecipherResponse }
     * 
     */
    public DecipherResponse createDecipherResponse() {
        return new DecipherResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CipherException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Encryption/", name = "ArgumentException")
    public JAXBElement<CipherException> createArgumentException(CipherException value) {
        return new JAXBElement<CipherException>(_ArgumentException_QNAME, CipherException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cipher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Encryption/", name = "Cipher")
    public JAXBElement<Cipher> createCipher(Cipher value) {
        return new JAXBElement<Cipher>(_Cipher_QNAME, Cipher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Decipher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Encryption/", name = "decipher")
    public JAXBElement<Decipher> createDecipher(Decipher value) {
        return new JAXBElement<Decipher>(_Decipher_QNAME, Decipher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecipherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Encryption/", name = "decipherResponse")
    public JAXBElement<DecipherResponse> createDecipherResponse(DecipherResponse value) {
        return new JAXBElement<DecipherResponse>(_DecipherResponse_QNAME, DecipherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CipherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Encryption/", name = "CipherResponse")
    public JAXBElement<CipherResponse> createCipherResponse(CipherResponse value) {
        return new JAXBElement<CipherResponse>(_CipherResponse_QNAME, CipherResponse.class, null, value);
    }

}
