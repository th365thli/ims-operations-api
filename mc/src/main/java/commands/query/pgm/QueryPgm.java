//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.14 at 03:33:25 PM PST 
//


package commands.query.pgm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryPgm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPgm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAME" type="{commands/query/pgm}nameOptions" maxOccurs="unbounded"/>
 *         &lt;element name="SHOW" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ALL"/>
 *               &lt;enumeration value="BMPTYPE"/>
 *               &lt;enumeration value="DB"/>
 *               &lt;enumeration value="DEFN"/>
 *               &lt;enumeration value="DEFNTYPE"/>
 *               &lt;enumeration value="DOPT"/>
 *               &lt;enumeration value="FP"/>
 *               &lt;enumeration value="GLOBAL"/>
 *               &lt;enumeration value="IMSID"/>
 *               &lt;enumeration value="GPSB"/>
 *               &lt;enumeration value="LANG"/>
 *               &lt;enumeration value="LOCAL"/>
 *               &lt;enumeration value="MODEL"/>
 *               &lt;enumeration value="RESIDENT"/>
 *               &lt;enumeration value="RTC"/>
 *               &lt;enumeration value="SCHDTYPE"/>
 *               &lt;enumeration value="STATUS"/>
 *               &lt;enumeration value="TIMESTAMP"/>
 *               &lt;enumeration value="TRAN"/>
 *               &lt;enumeration value="TRANSTAT"/>
 *               &lt;enumeration value="WORK"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SHOW2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="EXPORTNEEDED"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SHOW3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="DB"/>
 *               &lt;enumeration value="RTC"/>
 *               &lt;enumeration value="TRAN"/>
 *               &lt;enumeration value="WORK"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STATUS" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="DB-NOTAVL"/>
 *               &lt;enumeration value="IOPREV"/>
 *               &lt;enumeration value="LOCK"/>
 *               &lt;enumeration value="NOTINIT"/>
 *               &lt;enumeration value="STOSCHD"/>
 *               &lt;enumeration value="TRACE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPgm", propOrder = {
    "name",
    "show",
    "show2",
    "show3",
    "status"
})
public class QueryPgm {

    @XmlElement(name = "NAME", required = true)
    protected List<String> name;
    @XmlElement(name = "SHOW")
    protected List<QueryPgm.ShowOptions> show;
    @XmlElement(name = "SHOW2")
    protected QueryPgm.Show2Options show2;
    @XmlElement(name = "SHOW3")
    protected QueryPgm.Show3Options show3;
    @XmlElement(name = "STATUS")
    protected List<QueryPgm.StatusOptions> status;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNAME().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNAME() {
        if (name == null) {
            name = new ArrayList<String>();
        }
        return this.name;
    }

    /**
     * Gets the value of the show property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the show property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHOW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryPgm.ShowOptions }
     * 
     * 
     */
    public List<QueryPgm.ShowOptions> getSHOW() {
        if (show == null) {
            show = new ArrayList<QueryPgm.ShowOptions>();
        }
        return this.show;
    }

    /**
     * Gets the value of the show2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPgm.Show2Options }
     *     
     */
    public QueryPgm.Show2Options getSHOW2() {
        return show2;
    }

    /**
     * Sets the value of the show2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPgm.Show2Options }
     *     
     */
    public void setSHOW2(QueryPgm.Show2Options value) {
        this.show2 = value;
    }

    /**
     * Gets the value of the show3 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPgm.Show3Options }
     *     
     */
    public QueryPgm.Show3Options getSHOW3() {
        return show3;
    }

    /**
     * Sets the value of the show3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPgm.Show3Options }
     *     
     */
    public void setSHOW3(QueryPgm.Show3Options value) {
        this.show3 = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTATUS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryPgm.StatusOptions }
     * 
     * 
     */
    public List<QueryPgm.StatusOptions> getSTATUS() {
        if (status == null) {
            status = new ArrayList<QueryPgm.StatusOptions>();
        }
        return this.status;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="EXPORTNEEDED"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Show2Options {

        EXPORTNEEDED;

        public String value() {
            return name();
        }

        public static QueryPgm.Show2Options fromValue(String v) {
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
     *     &lt;enumeration value="DB"/>
     *     &lt;enumeration value="RTC"/>
     *     &lt;enumeration value="TRAN"/>
     *     &lt;enumeration value="WORK"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Show3Options {

        DB,
        RTC,
        TRAN,
        WORK;

        public String value() {
            return name();
        }

        public static QueryPgm.Show3Options fromValue(String v) {
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
     *     &lt;enumeration value="ALL"/>
     *     &lt;enumeration value="BMPTYPE"/>
     *     &lt;enumeration value="DB"/>
     *     &lt;enumeration value="DEFN"/>
     *     &lt;enumeration value="DEFNTYPE"/>
     *     &lt;enumeration value="DOPT"/>
     *     &lt;enumeration value="FP"/>
     *     &lt;enumeration value="GLOBAL"/>
     *     &lt;enumeration value="IMSID"/>
     *     &lt;enumeration value="GPSB"/>
     *     &lt;enumeration value="LANG"/>
     *     &lt;enumeration value="LOCAL"/>
     *     &lt;enumeration value="MODEL"/>
     *     &lt;enumeration value="RESIDENT"/>
     *     &lt;enumeration value="RTC"/>
     *     &lt;enumeration value="SCHDTYPE"/>
     *     &lt;enumeration value="STATUS"/>
     *     &lt;enumeration value="TIMESTAMP"/>
     *     &lt;enumeration value="TRAN"/>
     *     &lt;enumeration value="TRANSTAT"/>
     *     &lt;enumeration value="WORK"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum ShowOptions {

        ALL,
        BMPTYPE,
        DB,
        DEFN,
        DEFNTYPE,
        DOPT,
        FP,
        GLOBAL,
        IMSID,
        GPSB,
        LANG,
        LOCAL,
        MODEL,
        RESIDENT,
        RTC,
        SCHDTYPE,
        STATUS,
        TIMESTAMP,
        TRAN,
        TRANSTAT,
        WORK,
        EXPORTNEEDED;

        public String value() {
            return name();
        }

        public static QueryPgm.ShowOptions fromValue(String v) {
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
     *     &lt;enumeration value="DB-NOTAVL"/>
     *     &lt;enumeration value="IOPREV"/>
     *     &lt;enumeration value="LOCK"/>
     *     &lt;enumeration value="NOTINIT"/>
     *     &lt;enumeration value="STOSCHD"/>
     *     &lt;enumeration value="TRACE"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum StatusOptions {

        @XmlEnumValue("DB-NOTAVL")
        DB_NOTAVL("DB-NOTAVL"),
        IOPREV("IOPREV"),
        LOCK("LOCK"),
        NOTINIT("NOTINIT"),
        STOSCHD("STOSCHD"),
        TRACE("TRACE");
        private final String value;

        StatusOptions(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static QueryPgm.StatusOptions fromValue(String v) {
            for (QueryPgm.StatusOptions c: QueryPgm.StatusOptions.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
