/**
 * Signator: 
 * @author Lucas Hall
 * @version May 3, 2016
 */

package capstonelh.database;

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
@Table(name = "signator")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Signator.findAll", query = "SELECT s FROM Signator s"),
    @NamedQuery(name = "Signator.findByLastName", query = "SELECT s FROM Signator s WHERE s.signatorPK.lastName = :lastName"),
    @NamedQuery(name = "Signator.findByFirstName", query = "SELECT s FROM Signator s WHERE s.signatorPK.firstName = :firstName")})
public class Signator implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SignatorPK signatorPK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "respSignFName")
    private List<LossReductionProgram> lossReductionProgramList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "respSignLName")
    private List<LossReductionProgram> lossReductionProgramList1;

    public Signator() {
    }

    public Signator(SignatorPK signatorPK) {
        this.signatorPK = signatorPK;
    }

    public Signator(String lastName, String firstName) {
        this.signatorPK = new SignatorPK(lastName, firstName);
    }

    public SignatorPK getSignatorPK() {
        return signatorPK;
    }

    public void setSignatorPK(SignatorPK signatorPK) {
        this.signatorPK = signatorPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (signatorPK != null ? signatorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Signator)) {
            return false;
        }
        Signator other = (Signator) object;
        if ((this.signatorPK == null && other.signatorPK != null) || (this.signatorPK != null && !this.signatorPK.equals(other.signatorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonelh.database.Signator[ signatorPK=" + signatorPK + " ]";
    }

}
