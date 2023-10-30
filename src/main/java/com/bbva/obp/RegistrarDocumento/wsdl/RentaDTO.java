//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.7 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.10.04 a las 10:46:53 PM COT 
//


package com.bbva.obp.RegistrarDocumento.wsdl;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para RentaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RentaDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoNumeroPoliza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoFechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="tipoFechaDerecho" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="tipoInteresTecnico" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tipoOrigenPrestacion" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RentaDTO}TipoOrigenPrestacion"/&gt;
 *         &lt;element name="tipoModalidadPrestacion" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RentaDTO}TipoModalidadPrestacion"/&gt;
 *         &lt;element name="tipoFechaInicioRenDif" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="tipoAfpVen" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tipoValorMesada" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tipoNumeroMesadas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tipoValorReservaInVe" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tipoValorReservaSob" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tipoValorReservaAux" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tipoValorOtrReserva" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tipoGastosAdmon" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tipoValorTotRes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="docSoporteJudicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaDocSopteJud" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="observacionesFalloJud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentaDTO", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RentaDTO", propOrder = {
    "tipoNumeroPoliza",
    "tipoFechaExpedicion",
    "tipoFechaDerecho",
    "tipoInteresTecnico",
    "tipoOrigenPrestacion",
    "tipoModalidadPrestacion",
    "tipoFechaInicioRenDif",
    "tipoAfpVen",
    "tipoValorMesada",
    "tipoNumeroMesadas",
    "tipoValorReservaInVe",
    "tipoValorReservaSob",
    "tipoValorReservaAux",
    "tipoValorOtrReserva",
    "tipoGastosAdmon",
    "tipoValorTotRes",
    "docSoporteJudicial",
    "fechaDocSopteJud",
    "observacionesFalloJud"
})
public class RentaDTO {

    @XmlElement(required = true)
    protected String tipoNumeroPoliza;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tipoFechaExpedicion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tipoFechaDerecho;
    @XmlElement(required = true)
    protected BigDecimal tipoInteresTecnico;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoOrigenPrestacion tipoOrigenPrestacion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoModalidadPrestacion tipoModalidadPrestacion;
    @XmlElementRef(name = "tipoFechaInicioRenDif", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RentaDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> tipoFechaInicioRenDif;
    protected int tipoAfpVen;
    @XmlElement(required = true)
    protected BigDecimal tipoValorMesada;
    protected int tipoNumeroMesadas;
    @XmlElement(required = true)
    protected BigDecimal tipoValorReservaInVe;
    @XmlElement(required = true)
    protected BigDecimal tipoValorReservaSob;
    @XmlElement(required = true)
    protected BigDecimal tipoValorReservaAux;
    @XmlElement(required = true)
    protected BigDecimal tipoValorOtrReserva;
    @XmlElement(required = true)
    protected BigDecimal tipoGastosAdmon;
    @XmlElement(required = true)
    protected BigDecimal tipoValorTotRes;
    @XmlElementRef(name = "docSoporteJudicial", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RentaDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docSoporteJudicial;
    @XmlElementRef(name = "fechaDocSopteJud", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RentaDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaDocSopteJud;
    @XmlElementRef(name = "observacionesFalloJud", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RentaDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacionesFalloJud;

    /**
     * Obtiene el valor de la propiedad tipoNumeroPoliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNumeroPoliza() {
        return tipoNumeroPoliza;
    }

    /**
     * Define el valor de la propiedad tipoNumeroPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNumeroPoliza(String value) {
        this.tipoNumeroPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFechaExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTipoFechaExpedicion() {
        return tipoFechaExpedicion;
    }

    /**
     * Define el valor de la propiedad tipoFechaExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTipoFechaExpedicion(XMLGregorianCalendar value) {
        this.tipoFechaExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFechaDerecho.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTipoFechaDerecho() {
        return tipoFechaDerecho;
    }

    /**
     * Define el valor de la propiedad tipoFechaDerecho.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTipoFechaDerecho(XMLGregorianCalendar value) {
        this.tipoFechaDerecho = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoInteresTecnico.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoInteresTecnico() {
        return tipoInteresTecnico;
    }

    /**
     * Define el valor de la propiedad tipoInteresTecnico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoInteresTecnico(BigDecimal value) {
        this.tipoInteresTecnico = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOrigenPrestacion.
     * 
     * @return
     *     possible object is
     *     {@link TipoOrigenPrestacion }
     *     
     */
    public TipoOrigenPrestacion getTipoOrigenPrestacion() {
        return tipoOrigenPrestacion;
    }

    /**
     * Define el valor de la propiedad tipoOrigenPrestacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOrigenPrestacion }
     *     
     */
    public void setTipoOrigenPrestacion(TipoOrigenPrestacion value) {
        this.tipoOrigenPrestacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoModalidadPrestacion.
     * 
     * @return
     *     possible object is
     *     {@link TipoModalidadPrestacion }
     *     
     */
    public TipoModalidadPrestacion getTipoModalidadPrestacion() {
        return tipoModalidadPrestacion;
    }

    /**
     * Define el valor de la propiedad tipoModalidadPrestacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoModalidadPrestacion }
     *     
     */
    public void setTipoModalidadPrestacion(TipoModalidadPrestacion value) {
        this.tipoModalidadPrestacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFechaInicioRenDif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTipoFechaInicioRenDif() {
        return tipoFechaInicioRenDif;
    }

    /**
     * Define el valor de la propiedad tipoFechaInicioRenDif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTipoFechaInicioRenDif(JAXBElement<XMLGregorianCalendar> value) {
        this.tipoFechaInicioRenDif = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAfpVen.
     * 
     */
    public int getTipoAfpVen() {
        return tipoAfpVen;
    }

    /**
     * Define el valor de la propiedad tipoAfpVen.
     * 
     */
    public void setTipoAfpVen(int value) {
        this.tipoAfpVen = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoValorMesada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoValorMesada() {
        return tipoValorMesada;
    }

    /**
     * Define el valor de la propiedad tipoValorMesada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoValorMesada(BigDecimal value) {
        this.tipoValorMesada = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoNumeroMesadas.
     * 
     */
    public int getTipoNumeroMesadas() {
        return tipoNumeroMesadas;
    }

    /**
     * Define el valor de la propiedad tipoNumeroMesadas.
     * 
     */
    public void setTipoNumeroMesadas(int value) {
        this.tipoNumeroMesadas = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoValorReservaInVe.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoValorReservaInVe() {
        return tipoValorReservaInVe;
    }

    /**
     * Define el valor de la propiedad tipoValorReservaInVe.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoValorReservaInVe(BigDecimal value) {
        this.tipoValorReservaInVe = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoValorReservaSob.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoValorReservaSob() {
        return tipoValorReservaSob;
    }

    /**
     * Define el valor de la propiedad tipoValorReservaSob.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoValorReservaSob(BigDecimal value) {
        this.tipoValorReservaSob = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoValorReservaAux.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoValorReservaAux() {
        return tipoValorReservaAux;
    }

    /**
     * Define el valor de la propiedad tipoValorReservaAux.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoValorReservaAux(BigDecimal value) {
        this.tipoValorReservaAux = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoValorOtrReserva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoValorOtrReserva() {
        return tipoValorOtrReserva;
    }

    /**
     * Define el valor de la propiedad tipoValorOtrReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoValorOtrReserva(BigDecimal value) {
        this.tipoValorOtrReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoGastosAdmon.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoGastosAdmon() {
        return tipoGastosAdmon;
    }

    /**
     * Define el valor de la propiedad tipoGastosAdmon.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoGastosAdmon(BigDecimal value) {
        this.tipoGastosAdmon = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoValorTotRes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoValorTotRes() {
        return tipoValorTotRes;
    }

    /**
     * Define el valor de la propiedad tipoValorTotRes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoValorTotRes(BigDecimal value) {
        this.tipoValorTotRes = value;
    }

    /**
     * Obtiene el valor de la propiedad docSoporteJudicial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocSoporteJudicial() {
        return docSoporteJudicial;
    }

    /**
     * Define el valor de la propiedad docSoporteJudicial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocSoporteJudicial(JAXBElement<String> value) {
        this.docSoporteJudicial = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDocSopteJud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaDocSopteJud() {
        return fechaDocSopteJud;
    }

    /**
     * Define el valor de la propiedad fechaDocSopteJud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaDocSopteJud(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaDocSopteJud = value;
    }

    /**
     * Obtiene el valor de la propiedad observacionesFalloJud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservacionesFalloJud() {
        return observacionesFalloJud;
    }

    /**
     * Define el valor de la propiedad observacionesFalloJud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservacionesFalloJud(JAXBElement<String> value) {
        this.observacionesFalloJud = value;
    }

}
