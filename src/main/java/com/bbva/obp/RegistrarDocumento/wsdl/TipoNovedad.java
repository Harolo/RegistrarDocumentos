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
 * <p>Clase Java para TipoNovedad.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TipoNovedad"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FA"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="PD"/&gt;
 *     &lt;enumeration value="IM"/&gt;
 *     &lt;enumeration value="NB"/&gt;
 *     &lt;enumeration value="AD"/&gt;
 *     &lt;enumeration value="CM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoNovedad", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/NovedadRentaDTO")
@XmlEnum
public enum TipoNovedad {

    FA,
    IN,
    PD,
    IM,
    NB,
    AD,
    CM;

    public String value() {
        return name();
    }

    public static TipoNovedad fromValue(String v) {
        return valueOf(v);
    }

}
