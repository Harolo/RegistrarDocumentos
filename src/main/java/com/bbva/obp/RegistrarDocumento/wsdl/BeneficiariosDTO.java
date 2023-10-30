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
 * <p>Clase Java para BeneficiariosDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BeneficiariosDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoTipoBeneficiario" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO}TipoTipoBeneficiario"/&gt;
 *         &lt;element name="tipoTipoDocumento" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO}TipoTipoDocumento" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoSegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPrimerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoSegundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoGenero" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO}TipoGenero" minOccurs="0"/&gt;
 *         &lt;element name="tipoFechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="tipoIndEstudiaAct" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO}TipoIndEstudiaAct" minOccurs="0"/&gt;
 *         &lt;element name="tipoIndDependeEco" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO}TipoIndDependeEco" minOccurs="0"/&gt;
 *         &lt;element name="tipoEstadoExpedicion" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO}TipoEstadoExpedicion" minOccurs="0"/&gt;
 *         &lt;element name="tipoEstadoActual" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO}TipoEstadoActual" minOccurs="0"/&gt;
 *         &lt;element name="temporBeneficiario" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO}TemporBeneficiario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiariosDTO", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", propOrder = {
    "tipoTipoBeneficiario",
    "tipoTipoDocumento",
    "tipoDocumento",
    "tipoPrimerApellido",
    "tipoSegundoApellido",
    "tipoPrimerNombre",
    "tipoSegundoNombre",
    "tipoGenero",
    "tipoFechaNacimiento",
    "tipoIndEstudiaAct",
    "tipoIndDependeEco",
    "tipoEstadoExpedicion",
    "tipoEstadoActual",
    "temporBeneficiario"
})
public class BeneficiariosDTO {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoTipoBeneficiario tipoTipoBeneficiario;
    @XmlElementRef(name = "tipoTipoDocumento", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<TipoTipoDocumento> tipoTipoDocumento;
    @XmlElementRef(name = "tipoDocumento", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumento;
    @XmlElementRef(name = "tipoPrimerApellido", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoPrimerApellido;
    @XmlElementRef(name = "tipoSegundoApellido", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoSegundoApellido;
    @XmlElementRef(name = "tipoPrimerNombre", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoPrimerNombre;
    @XmlElementRef(name = "tipoSegundoNombre", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoSegundoNombre;
    @XmlElementRef(name = "tipoGenero", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<TipoGenero> tipoGenero;
    @XmlElementRef(name = "tipoFechaNacimiento", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> tipoFechaNacimiento;
    @XmlElementRef(name = "tipoIndEstudiaAct", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<TipoIndEstudiaAct> tipoIndEstudiaAct;
    @XmlElementRef(name = "tipoIndDependeEco", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<TipoIndDependeEco> tipoIndDependeEco;
    @XmlElementRef(name = "tipoEstadoExpedicion", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<TipoEstadoExpedicion> tipoEstadoExpedicion;
    @XmlElementRef(name = "tipoEstadoActual", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<TipoEstadoActual> tipoEstadoActual;
    @XmlElementRef(name = "temporBeneficiario", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<TemporBeneficiario> temporBeneficiario;

    /**
     * Obtiene el valor de la propiedad tipoTipoBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoBeneficiario }
     *     
     */
    public TipoTipoBeneficiario getTipoTipoBeneficiario() {
        return tipoTipoBeneficiario;
    }

    /**
     * Define el valor de la propiedad tipoTipoBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoBeneficiario }
     *     
     */
    public void setTipoTipoBeneficiario(TipoTipoBeneficiario value) {
        this.tipoTipoBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoTipoDocumento }{@code >}
     *     
     */
    public JAXBElement<TipoTipoDocumento> getTipoTipoDocumento() {
        return tipoTipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoTipoDocumento }{@code >}
     *     
     */
    public void setTipoTipoDocumento(JAXBElement<TipoTipoDocumento> value) {
        this.tipoTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocumento(JAXBElement<String> value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPrimerApellido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoPrimerApellido() {
        return tipoPrimerApellido;
    }

    /**
     * Define el valor de la propiedad tipoPrimerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoPrimerApellido(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoPrimerNombre() {
        return tipoPrimerNombre;
    }

    /**
     * Define el valor de la propiedad tipoPrimerNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoPrimerNombre(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link TipoGenero }{@code >}
     *     
     */
    public JAXBElement<TipoGenero> getTipoGenero() {
        return tipoGenero;
    }

    /**
     * Define el valor de la propiedad tipoGenero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoGenero }{@code >}
     *     
     */
    public void setTipoGenero(JAXBElement<TipoGenero> value) {
        this.tipoGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTipoFechaNacimiento() {
        return tipoFechaNacimiento;
    }

    /**
     * Define el valor de la propiedad tipoFechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTipoFechaNacimiento(JAXBElement<XMLGregorianCalendar> value) {
        this.tipoFechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIndEstudiaAct.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoIndEstudiaAct }{@code >}
     *     
     */
    public JAXBElement<TipoIndEstudiaAct> getTipoIndEstudiaAct() {
        return tipoIndEstudiaAct;
    }

    /**
     * Define el valor de la propiedad tipoIndEstudiaAct.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoIndEstudiaAct }{@code >}
     *     
     */
    public void setTipoIndEstudiaAct(JAXBElement<TipoIndEstudiaAct> value) {
        this.tipoIndEstudiaAct = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIndDependeEco.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoIndDependeEco }{@code >}
     *     
     */
    public JAXBElement<TipoIndDependeEco> getTipoIndDependeEco() {
        return tipoIndDependeEco;
    }

    /**
     * Define el valor de la propiedad tipoIndDependeEco.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoIndDependeEco }{@code >}
     *     
     */
    public void setTipoIndDependeEco(JAXBElement<TipoIndDependeEco> value) {
        this.tipoIndDependeEco = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEstadoExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoEstadoExpedicion }{@code >}
     *     
     */
    public JAXBElement<TipoEstadoExpedicion> getTipoEstadoExpedicion() {
        return tipoEstadoExpedicion;
    }

    /**
     * Define el valor de la propiedad tipoEstadoExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoEstadoExpedicion }{@code >}
     *     
     */
    public void setTipoEstadoExpedicion(JAXBElement<TipoEstadoExpedicion> value) {
        this.tipoEstadoExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEstadoActual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoEstadoActual }{@code >}
     *     
     */
    public JAXBElement<TipoEstadoActual> getTipoEstadoActual() {
        return tipoEstadoActual;
    }

    /**
     * Define el valor de la propiedad tipoEstadoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoEstadoActual }{@code >}
     *     
     */
    public void setTipoEstadoActual(JAXBElement<TipoEstadoActual> value) {
        this.tipoEstadoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad temporBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TemporBeneficiario }{@code >}
     *     
     */
    public JAXBElement<TemporBeneficiario> getTemporBeneficiario() {
        return temporBeneficiario;
    }

    /**
     * Define el valor de la propiedad temporBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TemporBeneficiario }{@code >}
     *     
     */
    public void setTemporBeneficiario(JAXBElement<TemporBeneficiario> value) {
        this.temporBeneficiario = value;
    }

}
