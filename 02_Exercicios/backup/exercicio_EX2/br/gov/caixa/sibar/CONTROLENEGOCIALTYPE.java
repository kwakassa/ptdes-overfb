
package br.gov.caixa.sibar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CONTROLE_NEGOCIAL_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CONTROLE_NEGOCIAL_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORIGEM_RETORNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COD_RETORNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSG_RETORNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MENSAGENS" type="{http://caixa.gov.br/sibar}mensagens_controle_negocial_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTROLE_NEGOCIAL_TYPE", propOrder = {
    "origemretorno",
    "codretorno",
    "msgretorno",
    "nsu",
    "mensagens"
})
public class CONTROLENEGOCIALTYPE {

    @XmlElement(name = "ORIGEM_RETORNO")
    protected String origemretorno;
    @XmlElement(name = "COD_RETORNO")
    protected String codretorno;
    @XmlElement(name = "MSG_RETORNO")
    protected String msgretorno;
    @XmlElement(name = "NSU")
    protected String nsu;
    @XmlElement(name = "MENSAGENS")
    protected MensagensControleNegocialType mensagens;

    /**
     * Obt�m o valor da propriedade origemretorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGEMRETORNO() {
        return origemretorno;
    }

    /**
     * Define o valor da propriedade origemretorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGEMRETORNO(String value) {
        this.origemretorno = value;
    }

    /**
     * Obt�m o valor da propriedade codretorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODRETORNO() {
        return codretorno;
    }

    /**
     * Define o valor da propriedade codretorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODRETORNO(String value) {
        this.codretorno = value;
    }

    /**
     * Obt�m o valor da propriedade msgretorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGRETORNO() {
        return msgretorno;
    }

    /**
     * Define o valor da propriedade msgretorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGRETORNO(String value) {
        this.msgretorno = value;
    }

    /**
     * Obt�m o valor da propriedade nsu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSU() {
        return nsu;
    }

    /**
     * Define o valor da propriedade nsu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSU(String value) {
        this.nsu = value;
    }

    /**
     * Obt�m o valor da propriedade mensagens.
     * 
     * @return
     *     possible object is
     *     {@link MensagensControleNegocialType }
     *     
     */
    public MensagensControleNegocialType getMENSAGENS() {
        return mensagens;
    }

    /**
     * Define o valor da propriedade mensagens.
     * 
     * @param value
     *     allowed object is
     *     {@link MensagensControleNegocialType }
     *     
     */
    public void setMENSAGENS(MensagensControleNegocialType value) {
        this.mensagens = value;
    }

}