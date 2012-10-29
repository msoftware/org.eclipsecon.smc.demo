
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
 *         &lt;element name="WindChillInCelciusResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "windChillInCelciusResult"
})
@XmlRootElement(name = "WindChillInCelciusResponse")
public class WindChillInCelciusResponse {

    @XmlElement(name = "WindChillInCelciusResult", required = true)
    protected BigDecimal windChillInCelciusResult;

    /**
     * Gets the value of the windChillInCelciusResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWindChillInCelciusResult() {
        return windChillInCelciusResult;
    }

    /**
     * Sets the value of the windChillInCelciusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWindChillInCelciusResult(BigDecimal value) {
        this.windChillInCelciusResult = value;
    }

}
