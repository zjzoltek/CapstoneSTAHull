package capstonezz.Database;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since May 9, 2016
 */

@Entity
@Table(name = "quadrant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quadrant.findAll", query = "SELECT q FROM Quadrant q"),
    @NamedQuery(name = "Quadrant.findByQuadrant", query = "SELECT q FROM Quadrant q WHERE q.quadrant = :quadrant"),
    @NamedQuery(name = "Quadrant.findByDescription", query = "SELECT q FROM Quadrant q WHERE q.description = :description")})
public class Quadrant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Quadrant")
    private String quadrant;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quadrant1", fetch = FetchType.EAGER)
    private List<Property> propertyList;

    public Quadrant() {
    }

    public Quadrant(String quadrant) {
        this.quadrant = quadrant;
    }

    public Quadrant(String quadrant, String description) {
        this.quadrant = quadrant;
        this.description = description;
    }

    public String getQuadrant() {
        return quadrant;
    }

    public void setQuadrant(String quadrant) {
        this.quadrant = quadrant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quadrant != null ? quadrant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quadrant)) {
            return false;
        }
        Quadrant other = (Quadrant) object;
        if ((this.quadrant == null && other.quadrant != null) || (this.quadrant != null && !this.quadrant.equals(other.quadrant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonezz.Database.Quadrant[ quadrant=" + quadrant + " ]";
    }

}
