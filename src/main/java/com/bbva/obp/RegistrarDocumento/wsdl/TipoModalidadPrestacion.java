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
 * <p>Clase Java para TipoModalidadPrestacion.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TipoModalidadPrestacion"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VI"/&gt;
 *     &lt;enumeration value="VD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoModalidadPrestacion", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RentaDTO")
@XmlEnum
public enum TipoModalidadPrestacion {

    VI,
    VD;

    public String value() {
        return name();
    }

    public static TipoModalidadPrestacion fromValue(String v) {
        return valueOf(v);
    }

}
