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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegistroNovedad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroNovedad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoIdentificacionCausante" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RegistroNovedad}TipoIdentificacionCausante"/&gt;
 *         &lt;element name="tipoDocumentoCausante" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tiponovedad" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/NovedadRentaDTO}NovedadRentaDTO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroNovedad", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RegistroNovedad", propOrder = {
    "tipoIdentificacionCausante",
    "tipoDocumentoCausante",
    "tiponovedad"
})
public class RegistroNovedad {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoIdentificacionCausante tipoIdentificacionCausante;
    @XmlElement(required = true)
    protected String tipoDocumentoCausante;
    @XmlElement(required = true)
    protected NovedadRentaDTO tiponovedad;

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionCausante.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionCausante }
     *     
     */
    public TipoIdentificacionCausante getTipoIdentificacionCausante() {
        return tipoIdentificacionCausante;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionCausante.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionCausante }
     *     
     */
    public void setTipoIdentificacionCausante(TipoIdentificacionCausante value) {
        this.tipoIdentificacionCausante = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumentoCausante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoCausante() {
        return tipoDocumentoCausante;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoCausante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoCausante(String value) {
        this.tipoDocumentoCausante = value;
    }

    /**
     * Obtiene el valor de la propiedad tiponovedad.
     * 
     * @return
     *     possible object is
     *     {@link NovedadRentaDTO }
     *     
     */
    public NovedadRentaDTO getTiponovedad() {
        return tiponovedad;
    }

    /**
     * Define el valor de la propiedad tiponovedad.
     * 
     * @param value
     *     allowed object is
     *     {@link NovedadRentaDTO }
     *     
     */
    public void setTiponovedad(NovedadRentaDTO value) {
        this.tiponovedad = value;
    }

}
