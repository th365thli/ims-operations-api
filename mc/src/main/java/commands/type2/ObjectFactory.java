//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.03 at 10:38:19 AM PST 
//


package commands.type2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the commands.type2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OmType2Command_QNAME = new QName("commands/type2", "OmType2Command");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: commands.type2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Type2Command }
     * 
     */
    public Type2Command createType2Command() {
        return new Type2Command();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type2Command }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commands/type2", name = "OmType2Command")
    public JAXBElement<Type2Command> createOmType2Command(Type2Command value) {
        return new JAXBElement<Type2Command>(_OmType2Command_QNAME, Type2Command.class, null, value);
    }

}
