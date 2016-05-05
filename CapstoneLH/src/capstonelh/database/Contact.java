/**
 * Contact: 
 * @author Lucas Hall
 * @version May 3, 2016
 */

package capstonelh.database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "contact")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contact.findAll", query = "SELECT c FROM Contact c"),
    @NamedQuery(name = "Contact.findByPropertyID", query = "SELECT c FROM Contact c WHERE c.contactPK.propertyID = :propertyID"),
    @NamedQuery(name = "Contact.findByBusName", query = "SELECT c FROM Contact c WHERE c.contactPK.busName = :busName"),
    @NamedQuery(name = "Contact.findByFirstName", query = "SELECT c FROM Contact c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Contact.findByLastName", query = "SELECT c FROM Contact c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Contact.findByTitle", query = "SELECT c FROM Contact c WHERE c.title = :title"),
    @NamedQuery(name = "Contact.findByAddress", query = "SELECT c FROM Contact c WHERE c.address = :address"),
    @NamedQuery(name = "Contact.findByCity", query = "SELECT c FROM Contact c WHERE c.city = :city"),
    @NamedQuery(name = "Contact.findByState", query = "SELECT c FROM Contact c WHERE c.state = :state"),
    @NamedQuery(name = "Contact.findByZipcode", query = "SELECT c FROM Contact c WHERE c.zipcode = :zipcode"),
    @NamedQuery(name = "Contact.findByPhone", query = "SELECT c FROM Contact c WHERE c.phone = :phone"),
    @NamedQuery(name = "Contact.findByPhoneType", query = "SELECT c FROM Contact c WHERE c.phoneType = :phoneType"),
    @NamedQuery(name = "Contact.findByECRole", query = "SELECT c FROM Contact c WHERE c.eCRole = :eCRole")})
public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContactPK contactPK;
    @Basic(optional = false)
    @Column(name = "First_Name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "Last_Name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "Title")
    private String title;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @Column(name = "State")
    private String state;
    @Basic(optional = false)
    @Column(name = "Zipcode")
    private int zipcode;
    @Basic(optional = false)
    @Column(name = "Phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "Phone_Type")
    private String phoneType;
    @Basic(optional = false)
    @Column(name = "EC_Role")
    private String eCRole;

    public Contact() {
    }

    public Contact(ContactPK contactPK) {
        this.contactPK = contactPK;
    }

    public Contact(ContactPK contactPK, String firstName, String lastName, String title, String address, String city, String state, int zipcode, String phone, String phoneType, String eCRole) {
        this.contactPK = contactPK;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phone = phone;
        this.phoneType = phoneType;
        this.eCRole = eCRole;
    }

    public Contact(int propertyID, String busName) {
        this.contactPK = new ContactPK(propertyID, busName);
    }

    public ContactPK getContactPK() {
        return contactPK;
    }

    public void setContactPK(ContactPK contactPK) {
        this.contactPK = contactPK;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getECRole() {
        return eCRole;
    }

    public void setECRole(String eCRole) {
        this.eCRole = eCRole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactPK != null ? contactPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) object;
        if ((this.contactPK == null && other.contactPK != null) || (this.contactPK != null && !this.contactPK.equals(other.contactPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonelh.database.Contact[ contactPK=" + contactPK + " ]";
    }

}
