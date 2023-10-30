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
 * <p>Clase Java para NovedadRentaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NovedadRentaDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoNovedad" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/NovedadRentaDTO}TipoNovedad"/&gt;
 *         &lt;element name="tipoTipoDocumento" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/NovedadRentaDTO}TipoTipoDocumento" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoFechaNovedad" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="tipoValorMesada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tipoNumeroMesadas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docSoporteNovedad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoBeneficiario" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO}BeneficiariosDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NovedadRentaDTO", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/NovedadRentaDTO", propOrder = {
    "tipoNovedad",
    "tipoTipoDocumento",
    "tipoDocumento",
    "tipoFechaNovedad",
    "tipoValorMesada",
    "tipoNumeroMesadas",
    "docSoporteNovedad",
    "tipoBeneficiario"
})
public class NovedadRentaDTO {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoNovedad tipoNovedad;
    @XmlElementRef(name = "tipoTipoDocumento", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/NovedadRentaDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<TipoTipoDocumento2> tipoTipoDocumento;
    @XmlElementRef(name = "tipoDocumento", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/NovedadRentaDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tipoFechaNovedad;
    @XmlElementRef(name = "tipoValorMesada", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/NovedadRentaDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> tipoValorMesada;
    @XmlElementRef(name = "tipoNumeroMesadas", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/NovedadRentaDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tipoNumeroMesadas;
    @XmlElement(required = true)
    protected String docSoporteNovedad;
    @XmlElementRef(name = "tipoBeneficiario", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/NovedadRentaDTO", type = JAXBElement.class, required = false)
    protected JAXBElement<BeneficiariosDTO> tipoBeneficiario;

    /**
     * Obtiene el valor de la propiedad tipoNovedad.
     * 
     * @return
     *     possible object is
     *     {@link TipoNovedad }
     *     
     */
    public TipoNovedad getTipoNovedad() {
        return tipoNovedad;
    }

    /**
     * Define el valor de la propiedad tipoNovedad.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNovedad }
     *     
     */
    public void setTipoNovedad(TipoNovedad value) {
        this.tipoNovedad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoTipoDocumento2 }{@code >}
     *     
     */
    public JAXBElement<TipoTipoDocumento2> getTipoTipoDocumento() {
        return tipoTipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoTipoDocumento2 }{@code >}
     *     
     */
    public void setTipoTipoDocumento(JAXBElement<TipoTipoDocumento2> value) {
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
     * Obtiene el valor de la propiedad tipoFechaNovedad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTipoFechaNovedad() {
        return tipoFechaNovedad;
    }

    /**
     * Define el valor de la propiedad tipoFechaNovedad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTipoFechaNovedad(XMLGregorianCalendar value) {
        this.tipoFechaNovedad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoValorMesada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTipoValorMesada() {
        return tipoValorMesada;
    }

    /**
     * Define el valor de la propiedad tipoValorMesada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTipoValorMesada(JAXBElement<BigDecimal> value) {
        this.tipoValorMesada = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoNumeroMesadas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTipoNumeroMesadas() {
        return tipoNumeroMesadas;
    }

    /**
     * Define el valor de la propiedad tipoNumeroMesadas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTipoNumeroMesadas(JAXBElement<Integer> value) {
        this.tipoNumeroMesadas = value;
    }

    /**
     * Obtiene el valor de la propiedad docSoporteNovedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSoporteNovedad() {
        return docSoporteNovedad;
    }

    /**
     * Define el valor de la propiedad docSoporteNovedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocSoporteNovedad(String value) {
        this.docSoporteNovedad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BeneficiariosDTO }{@code >}
     *     
     */
    public JAXBElement<BeneficiariosDTO> getTipoBeneficiario() {
        return tipoBeneficiario;
    }

    /**
     * Define el valor de la propiedad tipoBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BeneficiariosDTO }{@code >}
     *     
     */
    public void setTipoBeneficiario(JAXBElement<BeneficiariosDTO> value) {
        this.tipoBeneficiario = value;
    }

}
