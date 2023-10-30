//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.7 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.10.04 a las 10:46:53 PM COT 
//


package com.bbva.obp.RegistrarDocumento.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegistroDocumentos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroDocumentos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoDocumento" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RegistroDocumentos}TipoDocumento"/&gt;
 *         &lt;element name="tipoIdentificacionC" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RegistroDocumentos}TipoIdentificacionC"/&gt;
 *         &lt;element name="tipoDocumentoC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoIdentificacionB" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RegistroDocumentos}TipoIdentificacionB" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumentoB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoArchivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroDocumentos", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RegistroDocumentos", propOrder = {
    "tipoDocumento",
    "tipoIdentificacionC",
    "tipoDocumentoC",
    "tipoIdentificacionB",
    "tipoDocumentoB",
    "tipoArchivo"
})
public class RegistroDocumentos {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoDocumento tipoDocumento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoIdentificacionC tipoIdentificacionC;
    @XmlElement(required = true)
    protected String tipoDocumentoC;
    @XmlElementRef(name = "tipoIdentificacionB", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RegistroDocumentos", type = JAXBElement.class, required = false)
    protected JAXBElement<TipoIdentificacionB> tipoIdentificacionB;
    @XmlElementRef(name = "tipoDocumentoB", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RegistroDocumentos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumentoB;
    @XmlElement(required = true)
    protected String tipoArchivo;

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *     
     */
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *     
     */
    public void setTipoDocumento(TipoDocumento value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionC.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionC }
     *     
     */
    public TipoIdentificacionC getTipoIdentificacionC() {
        return tipoIdentificacionC;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionC.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionC }
     *     
     */
    public void setTipoIdentificacionC(TipoIdentificacionC value) {
        this.tipoIdentificacionC = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumentoC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoC() {
        return tipoDocumentoC;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoC(String value) {
        this.tipoDocumentoC = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionB.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoIdentificacionB }{@code >}
     *     
     */
    public JAXBElement<TipoIdentificacionB> getTipoIdentificacionB() {
        return tipoIdentificacionB;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionB.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoIdentificacionB }{@code >}
     *     
     */
    public void setTipoIdentificacionB(JAXBElement<TipoIdentificacionB> value) {
        this.tipoIdentificacionB = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumentoB.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocumentoB() {
        return tipoDocumentoB;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoB.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocumentoB(JAXBElement<String> value) {
        this.tipoDocumentoB = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoArchivo() {
        return tipoArchivo;
    }

    /**
     * Define el valor de la propiedad tipoArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoArchivo(String value) {
        this.tipoArchivo = value;
    }

}
