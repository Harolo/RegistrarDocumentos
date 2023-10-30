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
 * <p>Clase Java para TipoTipoDocumento.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TipoTipoDocumento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoTipoDocumento", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/NovedadRentaDTO")
@XmlEnum
public enum TipoTipoDocumento2 {

    C,
    E,
    T,
    R,
    A;

    public String value() {
        return name();
    }

    public static TipoTipoDocumento2 fromValue(String v) {
        return valueOf(v);
    }

}
