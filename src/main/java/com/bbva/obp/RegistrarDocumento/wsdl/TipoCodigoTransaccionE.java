//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.7 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.10.04 a las 10:46:53 PM COT 
//


package com.bbva.obp.RegistrarDocumento.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoCodigoTransaccionE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoCodigoTransaccionE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="00"/&gt;
 *               &lt;enumeration value="01"/&gt;
 *               &lt;enumeration value="02"/&gt;
 *               &lt;enumeration value="03"/&gt;
 *               &lt;enumeration value="04"/&gt;
 *               &lt;enumeration value="05"/&gt;
 *               &lt;enumeration value="06"/&gt;
 *               &lt;enumeration value="07"/&gt;
 *               &lt;enumeration value="08"/&gt;
 *               &lt;enumeration value="09"/&gt;
 *               &lt;enumeration value="10"/&gt;
 *               &lt;enumeration value="11"/&gt;
 *               &lt;enumeration value="12"/&gt;
 *               &lt;enumeration value="13"/&gt;
 *               &lt;enumeration value="14"/&gt;
 *               &lt;enumeration value="15"/&gt;
 *               &lt;enumeration value="16"/&gt;
 *               &lt;enumeration value="20"/&gt;
 *               &lt;enumeration value="21"/&gt;
 *               &lt;enumeration value="22"/&gt;
 *               &lt;enumeration value="23"/&gt;
 *               &lt;enumeration value="24"/&gt;
 *               &lt;enumeration value="25"/&gt;
 *               &lt;enumeration value="26"/&gt;
 *               &lt;enumeration value="27"/&gt;
 *               &lt;enumeration value="28"/&gt;
 *               &lt;enumeration value="29"/&gt;
 *               &lt;enumeration value="30"/&gt;
 *               &lt;enumeration value="31"/&gt;
 *               &lt;enumeration value="32"/&gt;
 *               &lt;enumeration value="33"/&gt;
 *               &lt;enumeration value="34"/&gt;
 *               &lt;enumeration value="35"/&gt;
 *               &lt;enumeration value="36"/&gt;
 *               &lt;enumeration value="37"/&gt;
 *               &lt;enumeration value="38"/&gt;
 *               &lt;enumeration value="39"/&gt;
 *               &lt;enumeration value="40"/&gt;
 *               &lt;enumeration value="41"/&gt;
 *               &lt;enumeration value="42"/&gt;
 *               &lt;enumeration value="43"/&gt;
 *               &lt;enumeration value="44"/&gt;
 *               &lt;enumeration value="45"/&gt;
 *               &lt;enumeration value="46"/&gt;
 *               &lt;enumeration value="47"/&gt;
 *               &lt;enumeration value="48"/&gt;
 *               &lt;enumeration value="49"/&gt;
 *               &lt;enumeration value="50"/&gt;
 *               &lt;enumeration value="51"/&gt;
 *               &lt;enumeration value="52"/&gt;
 *               &lt;enumeration value="51"/&gt;
 *               &lt;enumeration value="52"/&gt;
 *               &lt;enumeration value="53"/&gt;
 *               &lt;enumeration value="54"/&gt;
 *               &lt;enumeration value="79"/&gt;
 *               &lt;enumeration value="80"/&gt;
 *               &lt;enumeration value="81"/&gt;
 *               &lt;enumeration value="82"/&gt;
 *               &lt;enumeration value="83"/&gt;
 *               &lt;enumeration value="84"/&gt;
 *               &lt;enumeration value="85"/&gt;
 *               &lt;enumeration value="86"/&gt;
 *               &lt;enumeration value="87"/&gt;
 *               &lt;enumeration value="88"/&gt;
 *               &lt;enumeration value="89"/&gt;
 *               &lt;enumeration value="90"/&gt;
 *               &lt;enumeration value="91"/&gt;
 *               &lt;enumeration value="92"/&gt;
 *               &lt;enumeration value="93"/&gt;
 *               &lt;enumeration value="94"/&gt;
 *               &lt;enumeration value="95"/&gt;
 *               &lt;enumeration value="96"/&gt;
 *               &lt;enumeration value="97"/&gt;
 *               &lt;enumeration value="98"/&gt;
 *               &lt;enumeration value="99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoCodigoTransaccionE", propOrder = {
    "value"
})
public class TipoCodigoTransaccionE {

    @XmlElement(required = true, nillable = true)
    protected String value;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
