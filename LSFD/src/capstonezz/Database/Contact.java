package capstonezz.Database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since May 9, 2016
 */

@Entity
@Table(name = "contact")
@XmlRootElement
@NamedQueries({
     @NamedQuery(name = "Contact.findAll", query = "SELECT c FROM Contact c"),
    @NamedQuery(name = "Contact.findByPropertyID", query = "SELECT c FROM Contact c WHERE c.contactPK.propertyID = :propertyID"),
    @NamedQuery(name = "Contact.findByBusName", query = "SELECT c FROM Contact c WHERE c.contactPK.busName = :busName"),
    @NamedQuery(name = "Contact.findByFirstName", query = "SELECT c FROM Contact c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Contact.findByLastName", query = "SELECT c FROM Contact c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Contact.findByAddress", query = "SELECT c FROM Contact c WHERE UPPER(c.address) = UPPER(:address)"),
    @NamedQuery(name = "Contact.findByCity", query = "SELECT c FROM Contact c WHERE c.city = :city"),
    @NamedQuery(name = "Contact.findByState", query = "SELECT c FROM Contact c WHERE c.state = :state"),
    @NamedQuery(name = "Contact.findByPhone", query = "SELECT c FROM Contact c WHERE c.phone = :phone"),
    @NamedQuery(name = "Contact.findByNameID", query = "SELECT c FROM Contact c WHERE c.contactPK.propertyID = :propertyID AND UPPER(c.address)"
            + " LIKE UPPER(:address)")})
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
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @Column(name = "State")
    private String state;
    @Basic(optional = false)
    @Column(name = "Phone")
    private String phone;
    @JoinColumn(name = "Property_ID", referencedColumnName = "Property_ID", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Property property;
    @JoinColumn(name = "Bus_Name", referencedColumnName = "SName", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Business business;
    @JoinColumn(name = "Title", referencedColumnName = "Title")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TitlesTable title;
    @JoinColumn(name = "Zipcode", referencedColumnName = "Zipcode")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private ZipcodeTable zipcode;
    @JoinColumn(name = "Phone_Type", referencedColumnName = "Phone_Type")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private PhoneType phoneType;
    @JoinColumn(name = "EC_Role", referencedColumnName = "EC_Role")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private EcRole eCRole;

    public Contact() {
    }

    public Contact(ContactPK contactPK) {
        this.contactPK = contactPK;
    }

    public Contact(ContactPK contactPK, String firstName, String lastName, String address, String city, String state, String phone) {
        this.contactPK = contactPK;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public TitlesTable getTitle() {
        return title;
    }

    public void setTitle(TitlesTable title) {
        this.title = title;
    }

    public ZipcodeTable getZipcode() {
        return zipcode;
    }

    public void setZipcode(ZipcodeTable zipcode) {
        this.zipcode = zipcode;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public EcRole getECRole() {
        return eCRole;
    }

    public void setECRole(EcRole eCRole) {
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
        return "capstonezz.Database.Contact[ contactPK=" + contactPK + " ]";
    }

}
