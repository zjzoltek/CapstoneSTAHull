package capstonezz.Database;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since May 9, 2016
 */

@Entity
@Table(name = "business")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Business.findAll", query = "SELECT b FROM Business b"),
    @NamedQuery(name = "Business.findByPropertyID", query = "SELECT b FROM Business b WHERE b.businessPK.propertyID = :propertyID"),
    @NamedQuery(name = "Business.findBySName", query = "SELECT b FROM Business b WHERE b.businessPK.sName = :sName"),
    @NamedQuery(name = "Business.findByOpenDate", query = "SELECT b FROM Business b WHERE b.openDate = :openDate"),
    @NamedQuery(name = "Business.findByClosureDate", query = "SELECT b FROM Business b WHERE b.closureDate = :closureDate"),
    @NamedQuery(name = "Business.findByPhone", query = "SELECT b FROM Business b WHERE b.phone = :phone")})
public class Business implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BusinessPK businessPK;
    @Basic(optional = false)
    @Column(name = "Open_Date")
    @Temporal(TemporalType.DATE)
    private Date openDate;
    @Basic(optional = false)
    @Column(name = "Closure_Date")
    @Temporal(TemporalType.DATE)
    private Date closureDate;
    @Basic(optional = false)
    @Column(name = "Phone")
    private String phone;
    @JoinColumn(name = "Property_ID", referencedColumnName = "Property_ID", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Property property;
    @JoinColumn(name = "Permit_Code", referencedColumnName = "Permit_Code")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Permits permitCode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "business", fetch = FetchType.EAGER)
    private List<Contact> contactList;

    public Business() {
    }

    public Business(BusinessPK businessPK) {
        this.businessPK = businessPK;
    }

    public Business(BusinessPK businessPK, Date openDate, Date closureDate, String phone) {
        this.businessPK = businessPK;
        this.openDate = openDate;
        this.closureDate = closureDate;
        this.phone = phone;
    }

    public Business(int propertyID, String sName) {
        this.businessPK = new BusinessPK(propertyID, sName);
    }

    public BusinessPK getBusinessPK() {
        return businessPK;
    }

    public void setBusinessPK(BusinessPK businessPK) {
        this.businessPK = businessPK;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getClosureDate() {
        return closureDate;
    }

    public void setClosureDate(Date closureDate) {
        this.closureDate = closureDate;
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

    public Permits getPermitCode() {
        return permitCode;
    }

    public void setPermitCode(Permits permitCode) {
        this.permitCode = permitCode;
    }

    @XmlTransient
    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessPK != null ? businessPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Business)) {
            return false;
        }
        Business other = (Business) object;
        if ((this.businessPK == null && other.businessPK != null) || (this.businessPK != null && !this.businessPK.equals(other.businessPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonezz.Database.Business[ businessPK=" + businessPK + " ]";
    }

}
