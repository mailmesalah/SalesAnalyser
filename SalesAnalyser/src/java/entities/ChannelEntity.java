/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Sely
 */
@Entity
public class ChannelEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @ManyToOne(targetEntity=AgencyEntity.class)
    //@JoinColumn(name="AgencyId",referencedColumnName="id",nullable=false,insertable=false, updatable=false)
    private AgencyEntity agency;
    @Id
    private Long id;
    private String channelClass;
    private Integer channelClassId;
    private String channelDesc;
    private Integer channelId;
    private String channelTotal;
    private Integer channelTotalId;

    public ChannelEntity() {
    }

    public ChannelEntity(AgencyEntity agency, Long id, String channelClass, Integer channelClassId, String channelDesc, Integer channelId, String channelTotal, Integer channelTotalId) {
        this.agency = agency;
        this.id = id;
        this.channelClass = channelClass;
        this.channelClassId = channelClassId;
        this.channelDesc = channelDesc;
        this.channelId = channelId;
        this.channelTotal = channelTotal;
        this.channelTotalId = channelTotalId;
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
        if (!(object instanceof ChannelEntity)) {
            return false;
        }
        ChannelEntity other = (ChannelEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ChannelEntity[ id=" + id + " ]";
    }

    public String getChannelClass() {
        return channelClass;
    }

    public void setChannelClass(String channelClass) {
        this.channelClass = channelClass;
    }

    public Integer getChannelClassId() {
        return channelClassId;
    }

    public void setChannelClassId(Integer channelClassId) {
        this.channelClassId = channelClassId;
    }

    public String getChannelDesc() {
        return channelDesc;
    }

    public void setChannelDesc(String channelDesc) {
        this.channelDesc = channelDesc;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getChannelTotal() {
        return channelTotal;
    }

    public void setChannelTotal(String channelTotal) {
        this.channelTotal = channelTotal;
    }

    public Integer getChannelTotalId() {
        return channelTotalId;
    }

    public void setChannelTotalId(Integer channelTotalId) {
        this.channelTotalId = channelTotalId;
    }

    public AgencyEntity getAgency() {
        return agency;
    }

    public void setAgency(AgencyEntity agency) {
        this.agency = agency;
    }
}
