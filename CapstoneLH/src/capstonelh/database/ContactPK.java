/**
 * ContactPK: 
 * @author Lucas Hall
 * @version May 3, 2016
 */

package capstonelh.database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class ContactPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Property_ID")
    private int propertyID;
    @Basic(optional = false)
    @Column(name = "Bus_Name")
    private String busName;

    public ContactPK() {
    }

    public ContactPK(int propertyID, String busName) {
        this.propertyID = propertyID;
        this.busName = busName;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) propertyID;
        hash += (busName != null ? busName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactPK)) {
            return false;
        }
        ContactPK other = (ContactPK) object;
        if (this.propertyID != other.propertyID) {
            return false;
        }
        if ((this.busName == null && other.busName != null) || (this.busName != null && !this.busName.equals(other.busName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonelh.database.ContactPK[ propertyID=" + propertyID + ", busName=" + busName + " ]";
    }

}
