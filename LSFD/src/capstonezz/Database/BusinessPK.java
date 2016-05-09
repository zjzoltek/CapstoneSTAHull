package capstonezz.Database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since May 9, 2016
 */

@Embeddable
public class BusinessPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Property_ID")
    private int propertyID;
    @Basic(optional = false)
    @Column(name = "SName")
    private String sName;

    public BusinessPK() {
    }

    public BusinessPK(int propertyID, String sName) {
        this.propertyID = propertyID;
        this.sName = sName;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) propertyID;
        hash += (sName != null ? sName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusinessPK)) {
            return false;
        }
        BusinessPK other = (BusinessPK) object;
        if (this.propertyID != other.propertyID) {
            return false;
        }
        if ((this.sName == null && other.sName != null) || (this.sName != null && !this.sName.equals(other.sName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonezz.Database.BusinessPK[ propertyID=" + propertyID + ", sName=" + sName + " ]";
    }

}
