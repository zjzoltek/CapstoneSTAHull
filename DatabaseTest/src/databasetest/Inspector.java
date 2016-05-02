/**
 * Inspector: 
 * @author Lucas Hall
 * @version May 2, 2016
 */

package databasetest;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "inspector")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inspector.findAll", query = "SELECT i FROM Inspector i"),
    @NamedQuery(name = "Inspector.findByLastName", query = "SELECT i FROM Inspector i WHERE i.inspectorPK.lastName = :lastName"),
    @NamedQuery(name = "Inspector.findByFirstName", query = "SELECT i FROM Inspector i WHERE i.inspectorPK.firstName = :firstName")})
public class Inspector implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inspectorFName")
    private List<LossReductionProgram> lossReductionProgramList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inspectorLName")
    private List<LossReductionProgram> lossReductionProgramList1;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InspectorPK inspectorPK;

    public Inspector() {
    }

    public Inspector(InspectorPK inspectorPK) {
        this.inspectorPK = inspectorPK;
    }

    public Inspector(String lastName, String firstName) {
        this.inspectorPK = new InspectorPK(lastName, firstName);
    }

    public InspectorPK getInspectorPK() {
        return inspectorPK;
    }

    public void setInspectorPK(InspectorPK inspectorPK) {
        this.inspectorPK = inspectorPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inspectorPK != null ? inspectorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inspector)) {
            return false;
        }
        Inspector other = (Inspector) object;
        if ((this.inspectorPK == null && other.inspectorPK != null) || (this.inspectorPK != null && !this.inspectorPK.equals(other.inspectorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databasetest.Inspector[ inspectorPK=" + inspectorPK + " ]";
    }

    @XmlTransient
    public List<LossReductionProgram> getLossReductionProgramList() {
        return lossReductionProgramList;
    }

    public void setLossReductionProgramList(List<LossReductionProgram> lossReductionProgramList) {
        this.lossReductionProgramList = lossReductionProgramList;
    }

    @XmlTransient
    public List<LossReductionProgram> getLossReductionProgramList1() {
        return lossReductionProgramList1;
    }

    public void setLossReductionProgramList1(List<LossReductionProgram> lossReductionProgramList1) {
        this.lossReductionProgramList1 = lossReductionProgramList1;
    }

}
