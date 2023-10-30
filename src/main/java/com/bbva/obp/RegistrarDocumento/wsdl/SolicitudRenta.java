//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.7 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.10.04 a las 10:46:53 PM COT 
//


package com.bbva.obp.RegistrarDocumento.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SolicitudRenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SolicitudRenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoCausante" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/CausanteDTO}CausanteDTO"/&gt;
 *         &lt;element name="tipoRenta" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/RentaDTO}RentaDTO"/&gt;
 *         &lt;element name="tipoBeneficiarios" type="{http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/BeneficiariosDTO}BeneficiariosDTO" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitudRenta", namespace = "http://servicios.webservices.bonospensionales.minhacienda.gov.co/schema/SolicitudRenta", propOrder = {
    "tipoCausante",
    "tipoRenta",
    "tipoBeneficiarios"
})
public class SolicitudRenta {

    @XmlElement(required = true)
    protected CausanteDTO tipoCausante;
    @XmlElement(required = true)
    protected RentaDTO tipoRenta;
    @XmlElement(required = true)
    protected List<BeneficiariosDTO> tipoBeneficiarios;

    /**
     * Obtiene el valor de la propiedad tipoCausante.
     * 
     * @return
     *     possible object is
     *     {@link CausanteDTO }
     *     
     */
    public CausanteDTO getTipoCausante() {
        return tipoCausante;
    }

    /**
     * Define el valor de la propiedad tipoCausante.
     * 
     * @param value
     *     allowed object is
     *     {@link CausanteDTO }
     *     
     */
    public void setTipoCausante(CausanteDTO value) {
        this.tipoCausante = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRenta.
     * 
     * @return
     *     possible object is
     *     {@link RentaDTO }
     *     
     */
    public RentaDTO getTipoRenta() {
        return tipoRenta;
    }

    /**
     * Define el valor de la propiedad tipoRenta.
     * 
     * @param value
     *     allowed object is
     *     {@link RentaDTO }
     *     
     */
    public void setTipoRenta(RentaDTO value) {
        this.tipoRenta = value;
    }

    /**
     * Gets the value of the tipoBeneficiarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoBeneficiarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoBeneficiarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficiariosDTO }
     * 
     * 
     */
    public List<BeneficiariosDTO> getTipoBeneficiarios() {
        if (tipoBeneficiarios == null) {
            tipoBeneficiarios = new ArrayList<BeneficiariosDTO>();
        }
        return this.tipoBeneficiarios;
    }

}
