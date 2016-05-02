/**
 * OccupancyClassCodes: 
 * @author Lucas Hall
 * @version May 2, 2016
 */

package databasetest;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "occupancy_class_codes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OccupancyClassCodes.findAll", query = "SELECT o FROM OccupancyClassCodes o"),
    @NamedQuery(name = "OccupancyClassCodes.findByOccupancyCode", query = "SELECT o FROM OccupancyClassCodes o WHERE o.occupancyCode = :occupancyCode"),
    @NamedQuery(name = "OccupancyClassCodes.findByDescription", query = "SELECT o FROM OccupancyClassCodes o WHERE o.description = :description")})
public class OccupancyClassCodes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Occupancy_Code")
    private String occupancyCode;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;

    public OccupancyClassCodes() {
    }

    public OccupancyClassCodes(String occupancyCode) {
        this.occupancyCode = occupancyCode;
    }

    public OccupancyClassCodes(String occupancyCode, String description) {
        this.occupancyCode = occupancyCode;
        this.description = description;
    }

    public String getOccupancyCode() {
        return occupancyCode;
    }

    public void setOccupancyCode(String occupancyCode) {
        this.occupancyCode = occupancyCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (occupancyCode != null ? occupancyCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OccupancyClassCodes)) {
            return false;
        }
        OccupancyClassCodes other = (OccupancyClassCodes) object;
        if ((this.occupancyCode == null && other.occupancyCode != null) || (this.occupancyCode != null && !this.occupancyCode.equals(other.occupancyCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databasetest.OccupancyClassCodes[ occupancyCode=" + occupancyCode + " ]";
    }

}
