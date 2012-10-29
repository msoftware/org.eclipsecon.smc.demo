
package secondconverter;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FahrenheitToCelciusResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fahrenheitToCelciusResult"
})
@XmlRootElement(name = "FahrenheitToCelciusResponse")
public class FahrenheitToCelciusResponse {

    @XmlElement(name = "FahrenheitToCelciusResult", required = true)
    protected BigDecimal fahrenheitToCelciusResult;

    /**
     * Gets the value of the fahrenheitToCelciusResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFahrenheitToCelciusResult() {
        return fahrenheitToCelciusResult;
    }

    /**
     * Sets the value of the fahrenheitToCelciusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFahrenheitToCelciusResult(BigDecimal value) {
        this.fahrenheitToCelciusResult = value;
    }

}
