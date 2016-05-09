package capstonezz.Database;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since May 9, 2016
 */

@Entity
@Table(name = "zipcode_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZipcodeTable.findAll", query = "SELECT z FROM ZipcodeTable z"),
    @NamedQuery(name = "ZipcodeTable.findByZipcode", query = "SELECT z FROM ZipcodeTable z WHERE z.zipcode = :zipcode"),
    @NamedQuery(name = "ZipcodeTable.findByCity", query = "SELECT z FROM ZipcodeTable z WHERE z.city = :city"),
    @NamedQuery(name = "ZipcodeTable.findByState", query = "SELECT z FROM ZipcodeTable z WHERE z.state = :state")})
public class ZipcodeTable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Zipcode")
    private Integer zipcode;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @Column(name = "State")
    private String state;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zipcode", fetch = FetchType.EAGER)
    private List<Contact> contactList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zipcode", fetch = FetchType.EAGER)
    private List<Property> propertyList;

    public ZipcodeTable() {
    }

    public ZipcodeTable(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public ZipcodeTable(Integer zipcode, String city, String state) {
        this.zipcode = zipcode;
        this.city = city;
        this.state = state;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @XmlTransient
    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @XmlTransient
    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zipcode != null ? zipcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZipcodeTable)) {
            return false;
        }
        ZipcodeTable other = (ZipcodeTable) object;
        if ((this.zipcode == null && other.zipcode != null) || (this.zipcode != null && !this.zipcode.equals(other.zipcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonezz.Database.ZipcodeTable[ zipcode=" + zipcode + " ]";
    }

}
