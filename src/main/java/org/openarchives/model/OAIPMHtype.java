//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.02.28 um 03:31:05 PM CET 
//


package org.openarchives.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für OAI-PMHtype complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OAI-PMHtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="request" type="{http://www.openarchives.org/OAI/2.0/}requestType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="error" type="{http://www.openarchives.org/OAI/2.0/}OAI-PMHerrorType" maxOccurs="unbounded"/&gt;
 *           &lt;element name="Identify" type="{http://www.openarchives.org/OAI/2.0/}IdentifyType"/&gt;
 *           &lt;element name="ListMetadataFormats" type="{http://www.openarchives.org/OAI/2.0/}ListMetadataFormatsType"/&gt;
 *           &lt;element name="ListSets" type="{http://www.openarchives.org/OAI/2.0/}ListSetsType"/&gt;
 *           &lt;element name="GetRecord" type="{http://www.openarchives.org/OAI/2.0/}GetRecordType"/&gt;
 *           &lt;element name="ListIdentifiers" type="{http://www.openarchives.org/OAI/2.0/}ListIdentifiersType"/&gt;
 *           &lt;element name="ListRecords" type="{http://www.openarchives.org/OAI/2.0/}ListRecordsType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAI-PMHtype", propOrder = {
    "responseDate",
    "request",
    "error",
    "identify",
    "listMetadataFormats",
    "listSets",
    "getRecord",
    "listIdentifiers",
    "listRecords"
})
public class OAIPMHtype {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseDate;
    @XmlElement(required = true)
    protected RequestType request;
    protected List<OAIPMHerrorType> error;
    @XmlElement(name = "Identify")
    protected IdentifyType identify;
    @XmlElement(name = "ListMetadataFormats")
    protected ListMetadataFormatsType listMetadataFormats;
    @XmlElement(name = "ListSets")
    protected ListSetsType listSets;
    @XmlElement(name = "GetRecord")
    protected GetRecordType getRecord;
    @XmlElement(name = "ListIdentifiers")
    protected ListIdentifiersType listIdentifiers;
    @XmlElement(name = "ListRecords")
    protected ListRecordsType listRecords;

    /**
     * Ruft den Wert der responseDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDate() {
        return responseDate;
    }

    /**
     * Legt den Wert der responseDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDate(XMLGregorianCalendar value) {
        this.responseDate = value;
    }

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OAIPMHerrorType }
     * 
     * 
     */
    public List<OAIPMHerrorType> getError() {
        if (error == null) {
            error = new ArrayList<OAIPMHerrorType>();
        }
        return this.error;
    }

    /**
     * Ruft den Wert der identify-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentifyType }
     *     
     */
    public IdentifyType getIdentify() {
        return identify;
    }

    /**
     * Legt den Wert der identify-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifyType }
     *     
     */
    public void setIdentify(IdentifyType value) {
        this.identify = value;
    }

    /**
     * Ruft den Wert der listMetadataFormats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ListMetadataFormatsType }
     *     
     */
    public ListMetadataFormatsType getListMetadataFormats() {
        return listMetadataFormats;
    }

    /**
     * Legt den Wert der listMetadataFormats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ListMetadataFormatsType }
     *     
     */
    public void setListMetadataFormats(ListMetadataFormatsType value) {
        this.listMetadataFormats = value;
    }

    /**
     * Ruft den Wert der listSets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ListSetsType }
     *     
     */
    public ListSetsType getListSets() {
        return listSets;
    }

    /**
     * Legt den Wert der listSets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ListSetsType }
     *     
     */
    public void setListSets(ListSetsType value) {
        this.listSets = value;
    }

    /**
     * Ruft den Wert der getRecord-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetRecordType }
     *     
     */
    public GetRecordType getGetRecord() {
        return getRecord;
    }

    /**
     * Legt den Wert der getRecord-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRecordType }
     *     
     */
    public void setGetRecord(GetRecordType value) {
        this.getRecord = value;
    }

    /**
     * Ruft den Wert der listIdentifiers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ListIdentifiersType }
     *     
     */
    public ListIdentifiersType getListIdentifiers() {
        return listIdentifiers;
    }

    /**
     * Legt den Wert der listIdentifiers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ListIdentifiersType }
     *     
     */
    public void setListIdentifiers(ListIdentifiersType value) {
        this.listIdentifiers = value;
    }

    /**
     * Ruft den Wert der listRecords-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ListRecordsType }
     *     
     */
    public ListRecordsType getListRecords() {
        return listRecords;
    }

    /**
     * Legt den Wert der listRecords-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ListRecordsType }
     *     
     */
    public void setListRecords(ListRecordsType value) {
        this.listRecords = value;
    }

}