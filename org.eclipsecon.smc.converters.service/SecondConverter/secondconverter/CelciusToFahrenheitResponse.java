
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
 *         &lt;element name="CelciusToFahrenheitResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "celciusToFahrenheitResult"
})
@XmlRootElement(name = "CelciusToFahrenheitResponse")
public class CelciusToFahrenheitResponse {

    @XmlElement(name = "CelciusToFahrenheitResult", required = true)
    protected BigDecimal celciusToFahrenheitResult;

    /**
     * Gets the value of the celciusToFahrenheitResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCelciusToFahrenheitResult() {
        return celciusToFahrenheitResult;
    }

    /**
     * Sets the value of the celciusToFahrenheitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCelciusToFahrenheitResult(BigDecimal value) {
        this.celciusToFahrenheitResult = value;
    }

}
