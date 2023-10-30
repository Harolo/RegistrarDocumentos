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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para CausanteDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CausanteDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoIdentificacion" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/CausanteDTO}TipoIdentificacion"/&gt;
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoPrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoSegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPrimerNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoSegundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoGenero" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/CausanteDTO}TipoGenero"/&gt;
 *         &lt;element name="tipoFechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="tipoEstadoExpedicion" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/CausanteDTO}TipoEstadoExpedicion"/&gt;
 *         &lt;element name="tipoEstadoActual" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/CausanteDTO}TipoEstadoActual"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CausanteDTO", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/CausanteDTO", propOrder = {
    "tipoIdentificacion",
    "tipoDocumento",
    "tipoPrimerApellido",
    "tipoSegundoApellido",
    "tipoPrimerNombre",
    "tipoSegundoNombre",
    "tipoGenero",
    "tipoFechaNacimiento",
    "tipoEstadoExpedicion",
    "tipoEstadoActual"
})
public class CausanteDTO {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoIdentificacion tipoIdentificacion;
    @XmlElement(required = true)
    protected String tipoDocumento;
    @XmlElement(required = true)
    protected String tipoPrimerApellido;
    @XmlElementRef(name = "tipoSegundoApellido", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/CausanteDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoSegundoApellido;
    @XmlElement(required = true)
    protected String tipoPrimerNombre;
    @XmlElementRef(name = "tipoSegundoNombre", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/CausanteDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoSegundoNombre;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoGenero2 tipoGenero;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tipoFechaNacimiento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoEstadoExpedicion2 tipoEstadoExpedicion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoEstadoActual2 tipoEstadoActual;

    /**
     * Obtiene el valor de la propiedad tipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacion }
     *     
     */
    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacion }
     *     
     */
    public void setTipoIdentificacion(TipoIdentificacion value) {
        this.tipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPrimerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPrimerApellido() {
        return tipoPrimerApellido;
    }

    /**
     * Define el valor de la propiedad tipoPrimerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPrimerApellido(String value) {
        this.tipoPrimerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoSegundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoSegundoApellido() {
        return tipoSegundoApellido;
    }

    /**
     * Define el valor de la propiedad tipoSegundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoSegundoApellido(JAXBElement<String> value) {
        this.tipoSegundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPrimerNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPrimerNombre() {
        return tipoPrimerNombre;
    }

    /**
     * Define el valor de la propiedad tipoPrimerNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPrimerNombre(String value) {
        this.tipoPrimerNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoSegundoNombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoSegundoNombre() {
        return tipoSegundoNombre;
    }

    /**
     * Define el valor de la propiedad tipoSegundoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoSegundoNombre(JAXBElement<String> value) {
        this.tipoSegundoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoGenero.
     * 
     * @return
     *     possible object is
     *     {@link TipoGenero2 }
     *     
     */
    public TipoGenero2 getTipoGenero() {
        return tipoGenero;
    }

    /**
     * Define el valor de la propiedad tipoGenero.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoGenero2 }
     *     
     */
    public void setTipoGenero(TipoGenero2 value) {
        this.tipoGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTipoFechaNacimiento() {
        return tipoFechaNacimiento;
    }

    /**
     * Define el valor de la propiedad tipoFechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTipoFechaNacimiento(XMLGregorianCalendar value) {
        this.tipoFechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEstadoExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoExpedicion2 }
     *     
     */
    public TipoEstadoExpedicion2 getTipoEstadoExpedicion() {
        return tipoEstadoExpedicion;
    }

    /**
     * Define el valor de la propiedad tipoEstadoExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoExpedicion2 }
     *     
     */
    public void setTipoEstadoExpedicion(TipoEstadoExpedicion2 value) {
        this.tipoEstadoExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEstadoActual.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoActual2 }
     *     
     */
    public TipoEstadoActual2 getTipoEstadoActual() {
        return tipoEstadoActual;
    }

    /**
     * Define el valor de la propiedad tipoEstadoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoActual2 }
     *     
     */
    public void setTipoEstadoActual(TipoEstadoActual2 value) {
        this.tipoEstadoActual = value;
    }

}
