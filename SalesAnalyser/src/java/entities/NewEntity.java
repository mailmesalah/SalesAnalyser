/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Sely
 */
@Entity
public class NewEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id    
    @Column
    private Long id;
    @Column
    private String FirstEntity;
    @Column
    private String AnotherField;

    public Long getId() {
        return id;
    }

    public String getFirstEntity() {
        return FirstEntity;
    }

    public void setFirstEntity(String FirstEntity) {
        this.FirstEntity = FirstEntity;
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
        if (!(object instanceof NewEntity)) {
            return false;
        }
        NewEntity other = (NewEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.NewEntity[ id=" + id + " ]";
    }

    public String getAnotherField() {
        return AnotherField;
    }

    public void setAnotherField(String AnotherField) {
        this.AnotherField = AnotherField;
    }
    
}
