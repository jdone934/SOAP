
package com.daehosting.temperatureconversions;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WindChillInCelsiusResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "windChillInCelsiusResult"
})
@XmlRootElement(name = "WindChillInCelsiusResponse")
public class WindChillInCelsiusResponse {

    @XmlElement(name = "WindChillInCelsiusResult", required = true)
    protected BigDecimal windChillInCelsiusResult;

    /**
     * Gets the value of the windChillInCelsiusResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWindChillInCelsiusResult() {
        return windChillInCelsiusResult;
    }

    /**
     * Sets the value of the windChillInCelsiusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWindChillInCelsiusResult(BigDecimal value) {
        this.windChillInCelsiusResult = value;
    }

}
