
package com.miternos.messaging;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportingEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reportingEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="offerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalOfferId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notificationCreationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="intervalDetails" type="{http://messaging.miternos.com/}intervalDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportingEntity", propOrder = {
    "notificationType",
    "offerId",
    "externalOfferId",
    "campaignId",
    "notificationCreationDate",
    "intervalDetails"
})
public class ReportingEntity {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer notificationType;
    @XmlElement(required = true, nillable = true)
    protected String offerId;
    @XmlElement(required = true, nillable = true)
    protected String externalOfferId;
    @XmlElement(required = true, nillable = true)
    protected String campaignId;
    @XmlElement(required = true, nillable = true)
    protected String notificationCreationDate;
    @XmlElement(required = true, nillable = true)
    protected IntervalDetails intervalDetails;

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotificationType(Integer value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferId(String value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the externalOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalOfferId() {
        return externalOfferId;
    }

    /**
     * Sets the value of the externalOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalOfferId(String value) {
        this.externalOfferId = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignId(String value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the notificationCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationCreationDate() {
        return notificationCreationDate;
    }

    /**
     * Sets the value of the notificationCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationCreationDate(String value) {
        this.notificationCreationDate = value;
    }

    /**
     * Gets the value of the intervalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalDetails }
     *     
     */
    public IntervalDetails getIntervalDetails() {
        return intervalDetails;
    }

    /**
     * Sets the value of the intervalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalDetails }
     *     
     */
    public void setIntervalDetails(IntervalDetails value) {
        this.intervalDetails = value;
    }

}
