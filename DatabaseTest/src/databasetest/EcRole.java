/**
 * EcRole: 
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
@Table(name = "ec_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcRole.findAll", query = "SELECT e FROM EcRole e"),
    @NamedQuery(name = "EcRole.findByECRole", query = "SELECT e FROM EcRole e WHERE e.eCRole = :eCRole"),
    @NamedQuery(name = "EcRole.findByDescription", query = "SELECT e FROM EcRole e WHERE e.description = :description")})
public class EcRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EC_Role")
    private String eCRole;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;

    public EcRole() {
    }

    public EcRole(String eCRole) {
        this.eCRole = eCRole;
    }

    public EcRole(String eCRole, String description) {
        this.eCRole = eCRole;
        this.description = description;
    }

    public String getECRole() {
        return eCRole;
    }

    public void setECRole(String eCRole) {
        this.eCRole = eCRole;
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
        hash += (eCRole != null ? eCRole.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcRole)) {
            return false;
        }
        EcRole other = (EcRole) object;
        if ((this.eCRole == null && other.eCRole != null) || (this.eCRole != null && !this.eCRole.equals(other.eCRole))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databasetest.EcRole[ eCRole=" + eCRole + " ]";
    }

}
