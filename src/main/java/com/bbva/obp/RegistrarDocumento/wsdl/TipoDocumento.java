//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.7 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.10.04 a las 10:46:53 PM COT 
//


package com.bbva.obp.RegistrarDocumento.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoDocumento.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TipoDocumento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONT"/&gt;
 *     &lt;enumeration value="FLMS"/&gt;
 *     &lt;enumeration value="DOCI"/&gt;
 *     &lt;enumeration value="ACIN"/&gt;
 *     &lt;enumeration value="ACDE"/&gt;
 *     &lt;enumeration value="DSPL"/&gt;
 *     &lt;enumeration value="CERE"/&gt;
 *     &lt;enumeration value="DDEP"/&gt;
 *     &lt;enumeration value="RCIV"/&gt;
 *     &lt;enumeration value="RCMA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoDocumento", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RegistroDocumentos")
@XmlEnum
public enum TipoDocumento {

    CONT,
    FLMS,
    DOCI,
    ACIN,
    ACDE,
    DSPL,
    CERE,
    DDEP,
    RCIV,
    RCMA;

    public String value() {
        return name();
    }

    public static TipoDocumento fromValue(String v) {
        return valueOf(v);
    }

}
