/**
 * Permits: 
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
@Table(name = "permits")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permits.findAll", query = "SELECT p FROM Permits p"),
    @NamedQuery(name = "Permits.findByPermitCode", query = "SELECT p FROM Permits p WHERE p.permitCode = :permitCode"),
    @NamedQuery(name = "Permits.findByDescription", query = "SELECT p FROM Permits p WHERE p.description = :description")})
public class Permits implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Permit_Code")
    private String permitCode;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;

    public Permits() {
    }

    public Permits(String permitCode) {
        this.permitCode = permitCode;
    }

    public Permits(String permitCode, String description) {
        this.permitCode = permitCode;
        this.description = description;
    }

    public String getPermitCode() {
        return permitCode;
    }

    public void setPermitCode(String permitCode) {
        this.permitCode = permitCode;
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
        hash += (permitCode != null ? permitCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permits)) {
            return false;
        }
        Permits other = (Permits) object;
        if ((this.permitCode == null && other.permitCode != null) || (this.permitCode != null && !this.permitCode.equals(other.permitCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databasetest.Permits[ permitCode=" + permitCode + " ]";
    }

}
