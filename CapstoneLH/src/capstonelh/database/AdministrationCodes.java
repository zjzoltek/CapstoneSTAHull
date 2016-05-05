/**
 * AdministrationCodes: 
 * @author Lucas Hall
 * @version May 3, 2016
 */

package capstonelh.database;

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
@Table(name = "administration_codes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdministrationCodes.findAll", query = "SELECT a FROM AdministrationCodes a"),
    @NamedQuery(name = "AdministrationCodes.findByAdminCode", query = "SELECT a FROM AdministrationCodes a WHERE a.adminCode = :adminCode"),
    @NamedQuery(name = "AdministrationCodes.findByDescription", query = "SELECT a FROM AdministrationCodes a WHERE a.description = :description")})
public class AdministrationCodes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Admin_Code")
    private String adminCode;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;

    public AdministrationCodes() {
    }

    public AdministrationCodes(String adminCode) {
        this.adminCode = adminCode;
    }

    public AdministrationCodes(String adminCode, String description) {
        this.adminCode = adminCode;
        this.description = description;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
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
        hash += (adminCode != null ? adminCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdministrationCodes)) {
            return false;
        }
        AdministrationCodes other = (AdministrationCodes) object;
        if ((this.adminCode == null && other.adminCode != null) || (this.adminCode != null && !this.adminCode.equals(other.adminCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonelh.database.AdministrationCodes[ adminCode=" + adminCode + " ]";
    }

}
