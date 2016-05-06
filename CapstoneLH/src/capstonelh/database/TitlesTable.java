/**
 * TitlesTable: 
 * @author Lucas Hall
 * @version May 6, 2016
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
@Table(name = "titles_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TitlesTable.findAll", query = "SELECT t FROM TitlesTable t"),
    @NamedQuery(name = "TitlesTable.findByTitle", query = "SELECT t FROM TitlesTable t WHERE t.title = :title")})
public class TitlesTable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Title")
    private String title;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "title")
    private List<Contact> contactList;

    public TitlesTable() {
    }

    public TitlesTable(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlTransient
    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (title != null ? title.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TitlesTable)) {
            return false;
        }
        TitlesTable other = (TitlesTable) object;
        if ((this.title == null && other.title != null) || (this.title != null && !this.title.equals(other.title))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonelh.database.TitlesTable[ title=" + title + " ]";
    }

}
