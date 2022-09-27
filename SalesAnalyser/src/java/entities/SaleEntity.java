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
public class SaleEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @ManyToOne(targetEntity=AgencyEntity.class)
    @JoinColumn(name="AgencyId",referencedColumnName="id",nullable=false,insertable=false, updatable=false)
    private AgencyEntity agency;
    @Id
    private Long id;
    private BigDecimal amountSold;
    @ManyToOne
    @JoinColumn(name="ChannelId",referencedColumnName="id",nullable=false,insertable=false, updatable=false)
    private ChannelEntity channel;
    @ManyToOne
    @JoinColumn(name="CustomerId",referencedColumnName="id",nullable=false,insertable=false, updatable=false)
    private CustomerEntity customer;
    @ManyToOne
    @JoinColumn(name="ProductId",referencedColumnName="id",nullable=false,insertable=false, updatable=false)
    private ProductEntity product;
    @ManyToOne
    @JoinColumn(name="PromotionId",referencedColumnName="id",nullable=false,insertable=false, updatable=false)
    private PromotionEntity promotion;
    private BigDecimal quantitySold;
    private Integer saleId;
    private String timeId;

    public SaleEntity() {
    }

    public SaleEntity(AgencyEntity agency, Long id, BigDecimal amountSold, CustomerEntity customer, ProductEntity product, PromotionEntity promotion, BigDecimal quantitySold, Integer saleId, String timeId) {
        this.agency = agency;
        this.id = id;
        this.amountSold = amountSold;
        this.customer = customer;
        this.product = product;
        this.promotion = promotion;
        this.quantitySold = quantitySold;
        this.saleId = saleId;
        this.timeId = timeId;
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

    public BigDecimal getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(BigDecimal amountSold) {
        this.amountSold = amountSold;
    }

    public ChannelEntity getChannel() {
        return channel;
    }

    public void setChannel(ChannelEntity channel) {
        this.channel = channel;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public PromotionEntity getPromotion() {
        return promotion;
    }

    public void setPromotion(PromotionEntity promotion) {
        this.promotion = promotion;
    }

    public BigDecimal getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(BigDecimal quantitySold) {
        this.quantitySold = quantitySold;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public String getTimeId() {
        return timeId;
    }

    public void setTimeId(String timeId) {
        this.timeId = timeId;
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
        if (!(object instanceof SaleEntity)) {
            return false;
        }
        SaleEntity other = (SaleEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.SaleEntity[ id=" + id + " ]";
    }
}
