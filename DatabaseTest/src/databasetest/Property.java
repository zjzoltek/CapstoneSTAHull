/**
 * Property: 
 * @author Lucas Hall
 * @version May 2, 2016
 */

package databasetest;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "property")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Property.findAll", query = "SELECT p FROM Property p"),
    @NamedQuery(name = "Property.findByQuadrant", query = "SELECT p FROM Property p WHERE p.propertyPK.quadrant = :quadrant"),
    @NamedQuery(name = "Property.findBySNumber", query = "SELECT p FROM Property p WHERE p.propertyPK.sNumber = :sNumber"),
    @NamedQuery(name = "Property.findByStreet", query = "SELECT p FROM Property p WHERE p.propertyPK.street = :street"),
    @NamedQuery(name = "Property.findBySuiteUnit", query = "SELECT p FROM Property p WHERE p.propertyPK.suiteUnit = :suiteUnit"),
    @NamedQuery(name = "Property.findByZipcode", query = "SELECT p FROM Property p WHERE p.zipcode = :zipcode"),
    @NamedQuery(name = "Property.findByLastInspofIR", query = "SELECT p FROM Property p WHERE p.lastInspofIR = :lastInspofIR"),
    @NamedQuery(name = "Property.findByLastInspofLR", query = "SELECT p FROM Property p WHERE p.lastInspofLR = :lastInspofLR"),
    @NamedQuery(name = "Property.findByPropertyID", query = "SELECT p FROM Property p WHERE p.propertyID = :propertyID"),
    @NamedQuery(name = "Property.findByAdminCode", query = "SELECT p FROM Property p WHERE p.adminCode = :adminCode"),
    @NamedQuery(name = "Property.findByOccupancyCode", query = "SELECT p FROM Property p WHERE p.occupancyCode = :occupancyCode")})
public class Property implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "property")
    private List<LossReductionProgram> lossReductionProgramList;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PropertyPK propertyPK;
    @Basic(optional = false)
    @Column(name = "Zipcode")
    private int zipcode;
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
    @Basic(optional = false)
    @Column(name = "Admin_Code")
    private String adminCode;
    @Basic(optional = false)
    @Column(name = "Occupancy_Code")
    private String occupancyCode;

    public Property() {
    }

    public Property(PropertyPK propertyPK) {
        this.propertyPK = propertyPK;
    }

    public Property(PropertyPK propertyPK, int zipcode, Date lastInspofIR, Date lastInspofLR, String adminCode, String occupancyCode) {
        this.propertyPK = propertyPK;
        this.zipcode = zipcode;
        this.lastInspofIR = lastInspofIR;
        this.lastInspofLR = lastInspofLR;
        this.adminCode = adminCode;
        this.occupancyCode = occupancyCode;
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

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
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

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getOccupancyCode() {
        return occupancyCode;
    }

    public void setOccupancyCode(String occupancyCode) {
        this.occupancyCode = occupancyCode;
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
        return "databasetest.Property[ propertyPK=" + propertyPK + " ]";
    }

    @XmlTransient
    public List<LossReductionProgram> getLossReductionProgramList() {
        return lossReductionProgramList;
    }

    public void setLossReductionProgramList(List<LossReductionProgram> lossReductionProgramList) {
        this.lossReductionProgramList = lossReductionProgramList;
    }

}
