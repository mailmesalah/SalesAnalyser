/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class PromotionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @ManyToOne(targetEntity=AgencyEntity.class)
    //@JoinColumn(name="AgencyId",referencedColumnName="id",nullable=false,insertable=false, updatable=false)
    private AgencyEntity agency;
    @Id
    private Long id;
    protected String promoBeginDate;
    protected String promoCategory;
    protected Integer promoCategoryId;
    protected BigDecimal promoCost;
    protected String promoEndDate;
    protected Integer promoId;
    protected String promoName;
    protected String promoSubcategory;
    protected Integer promoSubcategoryId;
    protected String promoTotal;
    protected Integer promoTotalId;

    public PromotionEntity() {
    }

    public PromotionEntity(AgencyEntity agency, Long id, String promoBeginDate, String promoCategory, Integer promoCategoryId, BigDecimal promoCost, String promoEndDate, Integer promoId, String promoName, String promoSubcategory, Integer promoSubcategoryId, String promoTotal, Integer promoTotalId) {
        this.agency = agency;
        this.id = id;
        this.promoBeginDate = promoBeginDate;
        this.promoCategory = promoCategory;
        this.promoCategoryId = promoCategoryId;
        this.promoCost = promoCost;
        this.promoEndDate = promoEndDate;
        this.promoId = promoId;
        this.promoName = promoName;
        this.promoSubcategory = promoSubcategory;
        this.promoSubcategoryId = promoSubcategoryId;
        this.promoTotal = promoTotal;
        this.promoTotalId = promoTotalId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AgencyEntity getAgency() {
        return agency;
    }

    public void setAgency(AgencyEntity agency) {
        this.agency = agency;
    }

    public String getPromoBeginDate() {
        return promoBeginDate;
    }

    public void setPromoBeginDate(String promoBeginDate) {
        this.promoBeginDate = promoBeginDate;
    }

    public String getPromoCategory() {
        return promoCategory;
    }

    public void setPromoCategory(String promoCategory) {
        this.promoCategory = promoCategory;
    }

    public Integer getPromoCategoryId() {
        return promoCategoryId;
    }

    public void setPromoCategoryId(Integer promoCategoryId) {
        this.promoCategoryId = promoCategoryId;
    }

    public BigDecimal getPromoCost() {
        return promoCost;
    }

    public void setPromoCost(BigDecimal promoCost) {
        this.promoCost = promoCost;
    }

    public String getPromoEndDate() {
        return promoEndDate;
    }

    public void setPromoEndDate(String promoEndDate) {
        this.promoEndDate = promoEndDate;
    }

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public String getPromoSubcategory() {
        return promoSubcategory;
    }

    public void setPromoSubcategory(String promoSubcategory) {
        this.promoSubcategory = promoSubcategory;
    }

    public Integer getPromoSubcategoryId() {
        return promoSubcategoryId;
    }

    public void setPromoSubcategoryId(Integer promoSubcategoryId) {
        this.promoSubcategoryId = promoSubcategoryId;
    }

    public String getPromoTotal() {
        return promoTotal;
    }

    public void setPromoTotal(String promoTotal) {
        this.promoTotal = promoTotal;
    }

    public Integer getPromoTotalId() {
        return promoTotalId;
    }

    public void setPromoTotalId(Integer promoTotalId) {
        this.promoTotalId = promoTotalId;
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
        if (!(object instanceof PromotionEntity)) {
            return false;
        }
        PromotionEntity other = (PromotionEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PromotionEntity[ id=" + id + " ]";
    }
}
