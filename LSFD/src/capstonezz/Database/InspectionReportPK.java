package capstonezz.Database;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since May 9, 2016
 */

@Embeddable
public class InspectionReportPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Property_ID")
    private int propertyID;
    @Basic(optional = false)
    @Column(name = "Insp_Dt")
    @Temporal(TemporalType.DATE)
    private Date inspDt;

    public InspectionReportPK() {
    }

    public InspectionReportPK(int propertyID, Date inspDt) {
        this.propertyID = propertyID;
        this.inspDt = inspDt;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public Date getInspDt() {
        return inspDt;
    }

    public void setInspDt(Date inspDt) {
        this.inspDt = inspDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) propertyID;
        hash += (inspDt != null ? inspDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InspectionReportPK)) {
            return false;
        }
        InspectionReportPK other = (InspectionReportPK) object;
        if (this.propertyID != other.propertyID) {
            return false;
        }
        if ((this.inspDt == null && other.inspDt != null) || (this.inspDt != null && !this.inspDt.equals(other.inspDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonezz.Database.InspectionReportPK[ propertyID=" + propertyID + ", inspDt=" + inspDt + " ]";
    }

}
