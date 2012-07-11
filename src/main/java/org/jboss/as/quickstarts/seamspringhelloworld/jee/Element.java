package org.jboss.as.quickstarts.seamspringhelloworld.jee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Simple JPA Example representing Period Table Element.
 * <p>
 * By creating a JPA entity with "hibernate.hbm2ddl.auto" set to "create-drop", Hibernate will create the table based on the
 * class name and field names in the datasource if it doesn't exist yet.
 * </p>
 */
@Entity
@XmlRootElement     // JAXB binding allows this class to be returned by JAX-RS
public class Element {
    @Id             // indicates that this is our Primary Key
    @GeneratedValue // Identity/Sequence
    @XmlAttribute   // JAXB binding allows this field to be returned by JAX-RS as attribute
    private Long id;

    @XmlAttribute
    private String symbol;

    @XmlAttribute
    private String name;

    /**
     * @return IUPAC symbol for element, like H, He, Li, Be, B, C, N, O, etc
     */
    public final String getSymbol() {
        return symbol;
    }

    /**
     * @return common name for element, like Hydrogen, Helium, Lithium, etc.
     */
    public final String getName() {
        return name;
    }

    @Override
    public String toString() {
        return symbol + " - " + name + " (" + id + ")";
    }
}