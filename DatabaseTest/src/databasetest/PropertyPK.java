/**
 * PropertyPK: 
 * @author Lucas Hall
 * @version May 2, 2016
 */

package databasetest;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class PropertyPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Quadrant")
    private String quadrant;
    @Basic(optional = false)
    @Column(name = "sNumber")
    private int sNumber;
    @Basic(optional = false)
    @Column(name = "Street")
    private String street;
    @Basic(optional = false)
    @Column(name = "Suite_Unit")
    private int suiteUnit;

    public PropertyPK() {
    }

    public PropertyPK(String quadrant, int sNumber, String street, int suiteUnit) {
        this.quadrant = quadrant;
        this.sNumber = sNumber;
        this.street = street;
        this.suiteUnit = suiteUnit;
    }

    public String getQuadrant() {
        return quadrant;
    }

    public void setQuadrant(String quadrant) {
        this.quadrant = quadrant;
    }

    public int getSNumber() {
        return sNumber;
    }

    public void setSNumber(int sNumber) {
        this.sNumber = sNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getSuiteUnit() {
        return suiteUnit;
    }

    public void setSuiteUnit(int suiteUnit) {
        this.suiteUnit = suiteUnit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quadrant != null ? quadrant.hashCode() : 0);
        hash += (int) sNumber;
        hash += (street != null ? street.hashCode() : 0);
        hash += (int) suiteUnit;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropertyPK)) {
            return false;
        }
        PropertyPK other = (PropertyPK) object;
        if ((this.quadrant == null && other.quadrant != null) || (this.quadrant != null && !this.quadrant.equals(other.quadrant))) {
            return false;
        }
        if (this.sNumber != other.sNumber) {
            return false;
        }
        if ((this.street == null && other.street != null) || (this.street != null && !this.street.equals(other.street))) {
            return false;
        }
        if (this.suiteUnit != other.suiteUnit) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databasetest.PropertyPK[ quadrant=" + quadrant + ", sNumber=" + sNumber + ", street=" + street + ", suiteUnit=" + suiteUnit + " ]";
    }

}
