/**
 * InspectionCodes: 
 * @author Lucas Hall
 * @version May 3, 2016
 */

package capstonelh.database;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "inspection_codes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InspectionCodes.findAll", query = "SELECT i FROM InspectionCodes i"),
    @NamedQuery(name = "InspectionCodes.findByInspectionCode", query = "SELECT i FROM InspectionCodes i WHERE i.inspectionCode = :inspectionCode"),
    @NamedQuery(name = "InspectionCodes.findByDescription", query = "SELECT i FROM InspectionCodes i WHERE i.description = :description")})
public class InspectionCodes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Inspection_Code")
    private String inspectionCode;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inspectionCode")
    private List<LossReductionProgram> lossReductionProgramList;

    public InspectionCodes() {
    }

    public InspectionCodes(String inspectionCode) {
        this.inspectionCode = inspectionCode;
    }

    public InspectionCodes(String inspectionCode, String description) {
        this.inspectionCode = inspectionCode;
        this.description = description;
    }

    public String getInspectionCode() {
        return inspectionCode;
    }

    public void setInspectionCode(String inspectionCode) {
        this.inspectionCode = inspectionCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public List<LossReductionProgram> getLossReductionProgramList() {
        return lossReductionProgramList;
    }

    public void setLossReductionProgramList(List<LossReductionProgram> lossReductionProgramList) {
        this.lossReductionProgramList = lossReductionProgramList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inspectionCode != null ? inspectionCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InspectionCodes)) {
            return false;
        }
        InspectionCodes other = (InspectionCodes) object;
        if ((this.inspectionCode == null && other.inspectionCode != null) || (this.inspectionCode != null && !this.inspectionCode.equals(other.inspectionCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonelh.database.InspectionCodes[ inspectionCode=" + inspectionCode + " ]";
    }

}
