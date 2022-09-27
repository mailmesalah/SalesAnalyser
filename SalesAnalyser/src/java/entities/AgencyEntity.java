/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Sely
 */
@Entity
public class AgencyEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String AgencyName;

    public AgencyEntity() {
    }

    public AgencyEntity(Long id, String AgencyName) {
        this.id = id;
        this.AgencyName = AgencyName;
    }

    public String getAgencyName() {
        return AgencyName;
    }

    public void setAgencyName(String AgencyName) {
        this.AgencyName = AgencyName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgencyEntity)) {
            return false;
        }
        AgencyEntity other = (AgencyEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AgenyEntity[ id=" + id + " ]";
    }
    
}
