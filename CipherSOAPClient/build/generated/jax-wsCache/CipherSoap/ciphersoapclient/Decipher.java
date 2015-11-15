
package ciphersoapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for decipher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="decipher">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DecipherText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shiftback" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decipher", propOrder = {
    "decipherText",
    "shiftback"
})
public class Decipher {

    @XmlElement(name = "DecipherText")
    protected String decipherText;
    @XmlElement(name = "Shiftback")
    protected int shiftback;

    /**
     * Gets the value of the decipherText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecipherText() {
        return decipherText;
    }

    /**
     * Sets the value of the decipherText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecipherText(String value) {
        this.decipherText = value;
    }

    /**
     * Gets the value of the shiftback property.
     * 
     */
    public int getShiftback() {
        return shiftback;
    }

    /**
     * Sets the value of the shiftback property.
     * 
     */
    public void setShiftback(int value) {
        this.shiftback = value;
    }

}
