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
@Table(name = "property")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Property.findAll", query = "SELECT p FROM Property p"),
    @NamedQuery(name = "Property.findByQuadrant", query = "SELECT p FROM Property p WHERE p.propertyPK.quadrant = :quadrant"),
    @NamedQuery(name = "Property.findBySNumber", query = "SELECT p FROM Property p WHERE p.propertyPK.sNumber = :sNumber"),
    @NamedQuery(name = "Property.findByStreet", query = "SELECT p FROM Property p WHERE p.propertyPK.street = :street"),
    @NamedQuery(name = "Property.findBySuiteUnit", query = "SELECT p FROM Property p WHERE p.propertyPK.suiteUnit = :suiteUnit"),
    @NamedQuery(name = "Property.findByLastInspofIR", query = "SELECT p FROM Property p WHERE p.lastInspofIR = :lastInspofIR"),
    @NamedQuery(name = "Property.findByLastInspofLR", query = "SELECT p FROM Property p WHERE p.lastInspofLR = :lastInspofLR"),
    @NamedQuery(name = "Property.findByPropertyID", query = "SELECT p FROM Property p WHERE p.propertyID = :propertyID")})
public class Property implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PropertyPK propertyPK;
    @Basic(optional = false)
    @Column(name = "Last_Insp_of_IR")
    @Temporal(TemporalType.DATE)
    private Date lastInspofIR;
    @Basic(optional = false)
    @Column(name = "Last_Insp_of_LR")
    @Temporal(TemporalType.DATE)
    private Date lastInspofLR;
    @Column(name = "Property_ID")
    private Integer propertyID;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "property", fetch = FetchType.EAGER)
    private Business business;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "property", fetch = FetchType.EAGER)
    private List<LossReductionProgram> lossReductionProgramList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "property", fetch = FetchType.EAGER)
    private Contact contact;
    @JoinColumn(name = "Zipcode", referencedColumnName = "Zipcode")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private ZipcodeTable zipcode;
    @JoinColumn(name = "Admin_Code", referencedColumnName = "Admin_Code")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private AdministrationCodes adminCode;
    @JoinColumn(name = "Occupancy_Code", referencedColumnName = "Occupancy_Code")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private OccupancyClassCodes occupancyCode;
    @JoinColumn(name = "Quadrant", referencedColumnName = "Quadrant", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Quadrant quadrant1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "property", fetch = FetchType.EAGER)
    private List<InspectionReport> inspectionReportList;

    public Property() {
    }

    public Property(PropertyPK propertyPK) {
        this.propertyPK = propertyPK;
    }

    public Property(PropertyPK propertyPK, Date lastInspofIR, Date lastInspofLR) {
        this.propertyPK = propertyPK;
        this.lastInspofIR = lastInspofIR;
        this.lastInspofLR = lastInspofLR;
    }

    public Property(String quadrant, int sNumber, String street, int suiteUnit) {
        this.propertyPK = new PropertyPK(quadrant, sNumber, street, suiteUnit);
    }

    public PropertyPK getPropertyPK() {
        return propertyPK;
    }

    public void setPropertyPK(PropertyPK propertyPK) {
        this.propertyPK = propertyPK;
    }

    public Date getLastInspofIR() {
        return lastInspofIR;
    }

    public void setLastInspofIR(Date lastInspofIR) {
        this.lastInspofIR = lastInspofIR;
    }

    public Date getLastInspofLR() {
        return lastInspofLR;
    }

    public void setLastInspofLR(Date lastInspofLR) {
        this.lastInspofLR = lastInspofLR;
    }

    public Integer getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(Integer propertyID) {
        this.propertyID = propertyID;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    @XmlTransient
    public List<LossReductionProgram> getLossReductionProgramList() {
        return lossReductionProgramList;
    }

    public void setLossReductionProgramList(List<LossReductionProgram> lossReductionProgramList) {
        this.lossReductionProgramList = lossReductionProgramList;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public ZipcodeTable getZipcode() {
        return zipcode;
    }

    public void setZipcode(ZipcodeTable zipcode) {
        this.zipcode = zipcode;
    }

    public AdministrationCodes getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(AdministrationCodes adminCode) {
        this.adminCode = adminCode;
    }

    public OccupancyClassCodes getOccupancyCode() {
        return occupancyCode;
    }

    public void setOccupancyCode(OccupancyClassCodes occupancyCode) {
        this.occupancyCode = occupancyCode;
    }

    public Quadrant getQuadrant1() {
        return quadrant1;
    }

    public void setQuadrant1(Quadrant quadrant1) {
        this.quadrant1 = quadrant1;
    }

    @XmlTransient
    public List<InspectionReport> getInspectionReportList() {
        return inspectionReportList;
    }

    public void setInspectionReportList(List<InspectionReport> inspectionReportList) {
        this.inspectionReportList = inspectionReportList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyPK != null ? propertyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Property)) {
            return false;
        }
        Property other = (Property) object;
        if ((this.propertyPK == null && other.propertyPK != null) || (this.propertyPK != null && !this.propertyPK.equals(other.propertyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonezz.Database.Property[ propertyPK=" + propertyPK + " ]";
    }

}
