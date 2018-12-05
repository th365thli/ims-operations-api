//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.04 at 10:33:16 PM PST 
//


package commands.type2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import commands.create.pgm.CreatePgm;
import commands.create.tran.CreateTran;
import commands.delete.pgm.DeletePgm;
import commands.delete.tran.DeleteTran;
import commands.query.pgm.QueryPgm;
import commands.query.tran.QueryTran;
import commands.update.pgm.UpdatePgm;
import commands.update.tran.UpdateTran;


/**
 * <p>Java class for type2Command complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type2Command">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="UpdatePgm" type="{commands/update/pgm}UpdatePgm" minOccurs="0"/>
 *           &lt;element name="QueryPgm" type="{commands/query/pgm}QueryPgm" minOccurs="0"/>
 *           &lt;element name="UpdateTran" type="{commands/update/tran}UpdateTran" minOccurs="0"/>
 *           &lt;element name="QueryTran" type="{commands/query/tran}QueryTran" minOccurs="0"/>
 *           &lt;element name="CreatePgm" type="{commands/create/pgm}CreatePgm" minOccurs="0"/>
 *           &lt;element name="DeletePgm" type="{commands/delete/pgm}DeletePgm" minOccurs="0"/>
 *           &lt;element name="CreateTran" type="{commands/create/tran}CreateTran" minOccurs="0"/>
 *           &lt;element name="DeleteTran" type="{commands/delete/tran}DeleteTran" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="verb" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="QUERY"/>
 *               &lt;enumeration value="UPDATE"/>
 *               &lt;enumeration value="DELETE"/>
 *               &lt;enumeration value="CREATE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="resource" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AREA"/>
 *               &lt;enumeration value="DATAGRP"/>
 *               &lt;enumeration value="DB"/>
 *               &lt;enumeration value="DBDESC"/>
 *               &lt;enumeration value="IMS"/>
 *               &lt;enumeration value="IMSPLEX"/>
 *               &lt;enumeration value="LE"/>
 *               &lt;enumeration value="MEMBER"/>
 *               &lt;enumeration value="MSLINK"/>
 *               &lt;enumeration value="MSPLINK"/>
 *               &lt;enumeration value="MSNAME"/>
 *               &lt;enumeration value="ODBM"/>
 *               &lt;enumeration value="OLC"/>
 *               &lt;enumeration value="OLREORG"/>
 *               &lt;enumeration value="OTMADESC"/>
 *               &lt;enumeration value="PGM"/>
 *               &lt;enumeration value="PGMDESC"/>
 *               &lt;enumeration value="RTC"/>
 *               &lt;enumeration value="RTCDESC"/>
 *               &lt;enumeration value="STRUCTURE"/>
 *               &lt;enumeration value="TRAN"/>
 *               &lt;enumeration value="TRANDESC"/>
 *               &lt;enumeration value="IMSCON"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="route" type="{commands/type2}routeOptions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}integer" default="13" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type2Command", propOrder = {
    "updatePgm",
    "queryPgm",
    "updateTran",
    "queryTran",
    "createPgm",
    "deletePgm",
    "createTran",
    "deleteTran",
    "verb",
    "resource",
    "route"
})
public class Type2Command {

    @XmlElement(name = "UpdatePgm")
    protected UpdatePgm updatePgm;
    @XmlElement(name = "QueryPgm")
    protected QueryPgm queryPgm;
    @XmlElement(name = "UpdateTran")
    protected UpdateTran updateTran;
    @XmlElement(name = "QueryTran")
    protected QueryTran queryTran;
    @XmlElement(name = "CreatePgm")
    protected CreatePgm createPgm;
    @XmlElement(name = "DeletePgm")
    protected DeletePgm deletePgm;
    @XmlElement(name = "CreateTran")
    protected CreateTran createTran;
    @XmlElement(name = "DeleteTran")
    protected DeleteTran deleteTran;
    protected Type2Command.VerbOptions verb;
    protected Type2Command.ResourceOptions resource;
    protected List<String> route;
    @XmlAttribute(name = "version")
    protected BigInteger version;

    /**
     * Gets the value of the updatePgm property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePgm }
     *     
     */
    public UpdatePgm getUpdatePgm() {
        return updatePgm;
    }

    /**
     * Sets the value of the updatePgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePgm }
     *     
     */
    public void setUpdatePgm(UpdatePgm value) {
        this.updatePgm = value;
    }

    /**
     * Gets the value of the queryPgm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPgm }
     *     
     */
    public QueryPgm getQueryPgm() {
        return queryPgm;
    }

    /**
     * Sets the value of the queryPgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPgm }
     *     
     */
    public void setQueryPgm(QueryPgm value) {
        this.queryPgm = value;
    }

    /**
     * Gets the value of the updateTran property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTran }
     *     
     */
    public UpdateTran getUpdateTran() {
        return updateTran;
    }

    /**
     * Sets the value of the updateTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTran }
     *     
     */
    public void setUpdateTran(UpdateTran value) {
        this.updateTran = value;
    }

    /**
     * Gets the value of the queryTran property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTran }
     *     
     */
    public QueryTran getQueryTran() {
        return queryTran;
    }

    /**
     * Sets the value of the queryTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTran }
     *     
     */
    public void setQueryTran(QueryTran value) {
        this.queryTran = value;
    }

    /**
     * Gets the value of the createPgm property.
     * 
     * @return
     *     possible object is
     *     {@link CreatePgm }
     *     
     */
    public CreatePgm getCreatePgm() {
        return createPgm;
    }

    /**
     * Sets the value of the createPgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePgm }
     *     
     */
    public void setCreatePgm(CreatePgm value) {
        this.createPgm = value;
    }

    /**
     * Gets the value of the deletePgm property.
     * 
     * @return
     *     possible object is
     *     {@link DeletePgm }
     *     
     */
    public DeletePgm getDeletePgm() {
        return deletePgm;
    }

    /**
     * Sets the value of the deletePgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletePgm }
     *     
     */
    public void setDeletePgm(DeletePgm value) {
        this.deletePgm = value;
    }

    /**
     * Gets the value of the createTran property.
     * 
     * @return
     *     possible object is
     *     {@link CreateTran }
     *     
     */
    public CreateTran getCreateTran() {
        return createTran;
    }

    /**
     * Sets the value of the createTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateTran }
     *     
     */
    public void setCreateTran(CreateTran value) {
        this.createTran = value;
    }

    /**
     * Gets the value of the deleteTran property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteTran }
     *     
     */
    public DeleteTran getDeleteTran() {
        return deleteTran;
    }

    /**
     * Sets the value of the deleteTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteTran }
     *     
     */
    public void setDeleteTran(DeleteTran value) {
        this.deleteTran = value;
    }

    /**
     * Gets the value of the verb property.
     * 
     * @return
     *     possible object is
     *     {@link Type2Command.VerbOptions }
     *     
     */
    public Type2Command.VerbOptions getVerb() {
        return verb;
    }

    /**
     * Sets the value of the verb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type2Command.VerbOptions }
     *     
     */
    public void setVerb(Type2Command.VerbOptions value) {
        this.verb = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link Type2Command.ResourceOptions }
     *     
     */
    public Type2Command.ResourceOptions getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type2Command.ResourceOptions }
     *     
     */
    public void setResource(Type2Command.ResourceOptions value) {
        this.resource = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the route property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoute() {
        if (route == null) {
            route = new ArrayList<String>();
        }
        return this.route;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        if (version == null) {
            return new BigInteger("13");
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="AREA"/>
     *     &lt;enumeration value="DATAGRP"/>
     *     &lt;enumeration value="DB"/>
     *     &lt;enumeration value="DBDESC"/>
     *     &lt;enumeration value="IMS"/>
     *     &lt;enumeration value="IMSPLEX"/>
     *     &lt;enumeration value="LE"/>
     *     &lt;enumeration value="MEMBER"/>
     *     &lt;enumeration value="MSLINK"/>
     *     &lt;enumeration value="MSPLINK"/>
     *     &lt;enumeration value="MSNAME"/>
     *     &lt;enumeration value="ODBM"/>
     *     &lt;enumeration value="OLC"/>
     *     &lt;enumeration value="OLREORG"/>
     *     &lt;enumeration value="OTMADESC"/>
     *     &lt;enumeration value="PGM"/>
     *     &lt;enumeration value="PGMDESC"/>
     *     &lt;enumeration value="RTC"/>
     *     &lt;enumeration value="RTCDESC"/>
     *     &lt;enumeration value="STRUCTURE"/>
     *     &lt;enumeration value="TRAN"/>
     *     &lt;enumeration value="TRANDESC"/>
     *     &lt;enumeration value="IMSCON"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum ResourceOptions {

        AREA,
        DATAGRP,
        DB,
        DBDESC,
        IMS,
        IMSPLEX,
        LE,
        MEMBER,
        MSLINK,
        MSPLINK,
        MSNAME,
        ODBM,
        OLC,
        OLREORG,
        OTMADESC,
        PGM,
        PGMDESC,
        RTC,
        RTCDESC,
        STRUCTURE,
        TRAN,
        TRANDESC,
        IMSCON;

        public String value() {
            return name();
        }

        public static Type2Command.ResourceOptions fromValue(String v) {
            return valueOf(v);
        }

    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="QUERY"/>
     *     &lt;enumeration value="UPDATE"/>
     *     &lt;enumeration value="DELETE"/>
     *     &lt;enumeration value="CREATE"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum VerbOptions {

        QUERY,
        UPDATE,
        DELETE,
        CREATE;

        public String value() {
            return name();
        }

        public static Type2Command.VerbOptions fromValue(String v) {
            return valueOf(v);
        }

    }

}
