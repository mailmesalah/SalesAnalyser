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
public class ProductEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @ManyToOne(targetEntity=AgencyEntity.class)
    //@JoinColumn(name="AgencyId",referencedColumnName="id",nullable=false,insertable=false, updatable=false)
    private AgencyEntity agency;
    @Id
    private Long id;
    private String prodCategory;
    private String prodCategoryDesc;
    private Integer prodCategoryId;
    private String prodDesc;
    private String prodEffFrom;
    private String prodEffTo;
    private Integer prodId;
    protected BigDecimal prodListPrice;
    protected BigDecimal prodMinPrice;
    protected String prodName;
    protected String prodPackSize;
    protected Integer prodSrcId;
    protected String prodStatus;
    protected String prodSubcategory;
    protected String prodSubcategoryDesc;
    protected Integer prodSubcategoryId;
    protected String prodTotal;
    protected Integer prodTotalId;
    protected String prodUnitOfMeasure;
    protected String prodValid;
    protected Integer prodWeightClass;
    protected Integer supplierId;

    public ProductEntity() {
    }

    public ProductEntity(AgencyEntity agency, Long id, String prodCategory, String prodCategoryDesc, Integer prodCategoryId, String prodDesc, String prodEffFrom, String prodEffTo, Integer prodId, BigDecimal prodListPrice, BigDecimal prodMinPrice, String prodName, String prodPackSize, Integer prodSrcId, String prodStatus, String prodSubcategory, String prodSubcategoryDesc, Integer prodSubcategoryId, String prodTotal, Integer prodTotalId, String prodUnitOfMeasure, String prodValid, Integer prodWeightClass, Integer supplierId) {
        this.agency = agency;
        this.id = id;
        this.prodCategory = prodCategory;
        this.prodCategoryDesc = prodCategoryDesc;
        this.prodCategoryId = prodCategoryId;
        this.prodDesc = prodDesc;
        this.prodEffFrom = prodEffFrom;
        this.prodEffTo = prodEffTo;
        this.prodId = prodId;
        this.prodListPrice = prodListPrice;
        this.prodMinPrice = prodMinPrice;
        this.prodName = prodName;
        this.prodPackSize = prodPackSize;
        this.prodSrcId = prodSrcId;
        this.prodStatus = prodStatus;
        this.prodSubcategory = prodSubcategory;
        this.prodSubcategoryDesc = prodSubcategoryDesc;
        this.prodSubcategoryId = prodSubcategoryId;
        this.prodTotal = prodTotal;
        this.prodTotalId = prodTotalId;
        this.prodUnitOfMeasure = prodUnitOfMeasure;
        this.prodValid = prodValid;
        this.prodWeightClass = prodWeightClass;
        this.supplierId = supplierId;
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

    public String getProdCategory() {
        return prodCategory;
    }

    public void setProdCategory(String prodCategory) {
        this.prodCategory = prodCategory;
    }

    public String getProdCategoryDesc() {
        return prodCategoryDesc;
    }

    public void setProdCategoryDesc(String prodCategoryDesc) {
        this.prodCategoryDesc = prodCategoryDesc;
    }

    public Integer getProdCategoryId() {
        return prodCategoryId;
    }

    public void setProdCategoryId(Integer prodCategoryId) {
        this.prodCategoryId = prodCategoryId;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public String getProdEffFrom() {
        return prodEffFrom;
    }

    public void setProdEffFrom(String prodEffFrom) {
        this.prodEffFrom = prodEffFrom;
    }

    public String getProdEffTo() {
        return prodEffTo;
    }

    public void setProdEffTo(String prodEffTo) {
        this.prodEffTo = prodEffTo;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public BigDecimal getProdListPrice() {
        return prodListPrice;
    }

    public void setProdListPrice(BigDecimal prodListPrice) {
        this.prodListPrice = prodListPrice;
    }

    public BigDecimal getProdMinPrice() {
        return prodMinPrice;
    }

    public void setProdMinPrice(BigDecimal prodMinPrice) {
        this.prodMinPrice = prodMinPrice;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdPackSize() {
        return prodPackSize;
    }

    public void setProdPackSize(String prodPackSize) {
        this.prodPackSize = prodPackSize;
    }

    public Integer getProdSrcId() {
        return prodSrcId;
    }

    public void setProdSrcId(Integer prodSrcId) {
        this.prodSrcId = prodSrcId;
    }

    public String getProdStatus() {
        return prodStatus;
    }

    public void setProdStatus(String prodStatus) {
        this.prodStatus = prodStatus;
    }

    public String getProdSubcategory() {
        return prodSubcategory;
    }

    public void setProdSubcategory(String prodSubcategory) {
        this.prodSubcategory = prodSubcategory;
    }

    public String getProdSubcategoryDesc() {
        return prodSubcategoryDesc;
    }

    public void setProdSubcategoryDesc(String prodSubcategoryDesc) {
        this.prodSubcategoryDesc = prodSubcategoryDesc;
    }

    public Integer getProdSubcategoryId() {
        return prodSubcategoryId;
    }

    public void setProdSubcategoryId(Integer prodSubcategoryId) {
        this.prodSubcategoryId = prodSubcategoryId;
    }

    public String getProdTotal() {
        return prodTotal;
    }

    public void setProdTotal(String prodTotal) {
        this.prodTotal = prodTotal;
    }

    public Integer getProdTotalId() {
        return prodTotalId;
    }

    public void setProdTotalId(Integer prodTotalId) {
        this.prodTotalId = prodTotalId;
    }

    public String getProdUnitOfMeasure() {
        return prodUnitOfMeasure;
    }

    public void setProdUnitOfMeasure(String prodUnitOfMeasure) {
        this.prodUnitOfMeasure = prodUnitOfMeasure;
    }

    public String getProdValid() {
        return prodValid;
    }

    public void setProdValid(String prodValid) {
        this.prodValid = prodValid;
    }

    public Integer getProdWeightClass() {
        return prodWeightClass;
    }

    public void setProdWeightClass(Integer prodWeightClass) {
        this.prodWeightClass = prodWeightClass;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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
        if (!(object instanceof ProductEntity)) {
            return false;
        }
        ProductEntity other = (ProductEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProductEntity[ id=" + id + " ]";
    }
}
