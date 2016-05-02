/**
 * LossReductionProgramPK: 
 * @author Lucas Hall
 * @version May 2, 2016
 */

package databasetest;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Embeddable
public class LossReductionProgramPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Property_ID")
    private int propertyID;
    @Basic(optional = false)
    @Column(name = "LR_dt")
    @Temporal(TemporalType.DATE)
    private Date lRdt;

    public LossReductionProgramPK() {
    }

    public LossReductionProgramPK(int propertyID, Date lRdt) {
        this.propertyID = propertyID;
        this.lRdt = lRdt;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public Date getLRdt() {
        return lRdt;
    }

    public void setLRdt(Date lRdt) {
        this.lRdt = lRdt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) propertyID;
        hash += (lRdt != null ? lRdt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LossReductionProgramPK)) {
            return false;
        }
        LossReductionProgramPK other = (LossReductionProgramPK) object;
        if (this.propertyID != other.propertyID) {
            return false;
        }
        if ((this.lRdt == null && other.lRdt != null) || (this.lRdt != null && !this.lRdt.equals(other.lRdt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databasetest.LossReductionProgramPK[ propertyID=" + propertyID + ", lRdt=" + lRdt + " ]";
    }

}
