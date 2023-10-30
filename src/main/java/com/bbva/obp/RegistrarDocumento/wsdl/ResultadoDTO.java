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
 * <p>Clase Java para ResultadoDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultadoDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoCodigoTransaccion" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/ResultadoDTO}TipoCodigoTransaccionE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoDTO", propOrder = {
    "tipoCodigoTransaccion"
})
public class ResultadoDTO {

    @XmlElement(required = true)
    protected TipoCodigoTransaccionE tipoCodigoTransaccion;

    /**
     * Obtiene el valor de la propiedad tipoCodigoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigoTransaccionE }
     *     
     */
    public TipoCodigoTransaccionE getTipoCodigoTransaccion() {
        return tipoCodigoTransaccion;
    }

    /**
     * Define el valor de la propiedad tipoCodigoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigoTransaccionE }
     *     
     */
    public void setTipoCodigoTransaccion(TipoCodigoTransaccionE value) {
        this.tipoCodigoTransaccion = value;
    }

}
