/**
 * InspectorPK: 
 * @author Lucas Hall
 * @version May 3, 2016
 */

package capstonelh.database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class InspectorPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Last_Name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "First_Name")
    private String firstName;

    public InspectorPK() {
    }

    public InspectorPK(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lastName != null ? lastName.hashCode() : 0);
        hash += (firstName != null ? firstName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InspectorPK)) {
            return false;
        }
        InspectorPK other = (InspectorPK) object;
        if ((this.lastName == null && other.lastName != null) || (this.lastName != null && !this.lastName.equals(other.lastName))) {
            return false;
        }
        if ((this.firstName == null && other.firstName != null) || (this.firstName != null && !this.firstName.equals(other.firstName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonelh.database.InspectorPK[ lastName=" + lastName + ", firstName=" + firstName + " ]";
    }

}
