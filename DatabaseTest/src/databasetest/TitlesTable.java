/**
 * TitlesTable: 
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
        return "databasetest.TitlesTable[ title=" + title + " ]";
    }

}
