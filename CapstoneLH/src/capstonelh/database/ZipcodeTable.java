/**
 * ZipcodeTable: 
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
@Table(name = "zipcode_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZipcodeTable.findAll", query = "SELECT z FROM ZipcodeTable z"),
    @NamedQuery(name = "ZipcodeTable.findByZipcode", query = "SELECT z FROM ZipcodeTable z WHERE z.zipcode = :zipcode"),
    @NamedQuery(name = "ZipcodeTable.findByCity", query = "SELECT z FROM ZipcodeTable z WHERE z.city = :city"),
    @NamedQuery(name = "ZipcodeTable.findByState", query = "SELECT z FROM ZipcodeTable z WHERE z.state = :state")})
public class ZipcodeTable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Zipcode")
    private Integer zipcode;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @Column(name = "State")
    private String state;

    public ZipcodeTable() {
    }

    public ZipcodeTable(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public ZipcodeTable(Integer zipcode, String city, String state) {
        this.zipcode = zipcode;
        this.city = city;
        this.state = state;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zipcode != null ? zipcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZipcodeTable)) {
            return false;
        }
        ZipcodeTable other = (ZipcodeTable) object;
        if ((this.zipcode == null && other.zipcode != null) || (this.zipcode != null && !this.zipcode.equals(other.zipcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonelh.database.ZipcodeTable[ zipcode=" + zipcode + " ]";
    }

}
