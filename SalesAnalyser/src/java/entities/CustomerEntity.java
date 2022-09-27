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
public class CustomerEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @ManyToOne(targetEntity=AgencyEntity.class)
    //@JoinColumn(name="AgencyId",referencedColumnName="id",nullable=false,insertable=false, updatable=false)
    private AgencyEntity agency;
    @Id
    private Long id;
    private Long countryId;
    private String custCity;
    private Integer custCityId;
    private Integer custCreditLimit;
    private String custEffFrom;
    private String custEffTo;
    private String custEmail;
    private String custFirstName;
    private String custGender;
    private Integer custId;
    private String custIncomeLevel;
    private String custLastName;
    private String custMainPhoneNumber;
    private String custMaritalStatus;
    private String custPostalCode;
    private Integer custSrcId;
    private String custStateProvince;
    private Integer custStateProvinceId;
    private String custStreetAddress;
    private String custTotal;
    private Integer custTotalId;
    private String custValid;
    private Integer custYearOfBirth;

    public CustomerEntity() {
    }

    public CustomerEntity(AgencyEntity agency, Long id, Long countryId, String custCity, Integer custCityId, Integer custCreditLimit, String custEffFrom, String custEffTo, String custEmail, String custFirstName, String custGender, Integer custId, String custIncomeLevel, String custLastName, String custMainPhoneNumber, String custMaritalStatus, String custPostalCode, Integer custSrcId, String custStateProvince, Integer custStateProvinceId, String custStreetAddress, String custTotal, Integer custTotalId, String custValid, Integer custYearOfBirth) {
        this.agency = agency;
        this.id = id;
        this.countryId = countryId;
        this.custCity = custCity;
        this.custCityId = custCityId;
        this.custCreditLimit = custCreditLimit;
        this.custEffFrom = custEffFrom;
        this.custEffTo = custEffTo;
        this.custEmail = custEmail;
        this.custFirstName = custFirstName;
        this.custGender = custGender;
        this.custId = custId;
        this.custIncomeLevel = custIncomeLevel;
        this.custLastName = custLastName;
        this.custMainPhoneNumber = custMainPhoneNumber;
        this.custMaritalStatus = custMaritalStatus;
        this.custPostalCode = custPostalCode;
        this.custSrcId = custSrcId;
        this.custStateProvince = custStateProvince;
        this.custStateProvinceId = custStateProvinceId;
        this.custStreetAddress = custStreetAddress;
        this.custTotal = custTotal;
        this.custTotalId = custTotalId;
        this.custValid = custValid;
        this.custYearOfBirth = custYearOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public Integer getCustCityId() {
        return custCityId;
    }

    public void setCustCityId(Integer custCityId) {
        this.custCityId = custCityId;
    }

    public Integer getCustCreditLimit() {
        return custCreditLimit;
    }

    public void setCustCreditLimit(Integer custCreditLimit) {
        this.custCreditLimit = custCreditLimit;
    }

    public String getCustEffFrom() {
        return custEffFrom;
    }

    public void setCustEffFrom(String custEffFrom) {
        this.custEffFrom = custEffFrom;
    }

    public String getCustEffTo() {
        return custEffTo;
    }

    public void setCustEffTo(String custEffTo) {
        this.custEffTo = custEffTo;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustGender() {
        return custGender;
    }

    public void setCustGender(String custGender) {
        this.custGender = custGender;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustIncomeLevel() {
        return custIncomeLevel;
    }

    public void setCustIncomeLevel(String custIncomeLevel) {
        this.custIncomeLevel = custIncomeLevel;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public String getCustMainPhoneNumber() {
        return custMainPhoneNumber;
    }

    public void setCustMainPhoneNumber(String custMainPhoneNumber) {
        this.custMainPhoneNumber = custMainPhoneNumber;
    }

    public String getCustMaritalStatus() {
        return custMaritalStatus;
    }

    public void setCustMaritalStatus(String custMaritalStatus) {
        this.custMaritalStatus = custMaritalStatus;
    }

    public String getCustPostalCode() {
        return custPostalCode;
    }

    public void setCustPostalCode(String custPostalCode) {
        this.custPostalCode = custPostalCode;
    }

    public Integer getCustSrcId() {
        return custSrcId;
    }

    public void setCustSrcId(Integer custSrcId) {
        this.custSrcId = custSrcId;
    }

    public String getCustStateProvince() {
        return custStateProvince;
    }

    public void setCustStateProvince(String custStateProvince) {
        this.custStateProvince = custStateProvince;
    }

    public Integer getCustStateProvinceId() {
        return custStateProvinceId;
    }

    public void setCustStateProvinceId(Integer custStateProvinceId) {
        this.custStateProvinceId = custStateProvinceId;
    }

    public String getCustStreetAddress() {
        return custStreetAddress;
    }

    public void setCustStreetAddress(String custStreetAddress) {
        this.custStreetAddress = custStreetAddress;
    }

    public String getCustTotal() {
        return custTotal;
    }

    public void setCustTotal(String custTotal) {
        this.custTotal = custTotal;
    }

    public Integer getCustTotalId() {
        return custTotalId;
    }

    public void setCustTotalId(Integer custTotalId) {
        this.custTotalId = custTotalId;
    }

    public String getCustValid() {
        return custValid;
    }

    public void setCustValid(String custValid) {
        this.custValid = custValid;
    }

    public Integer getCustYearOfBirth() {
        return custYearOfBirth;
    }

    public void setCustYearOfBirth(Integer custYearOfBirth) {
        this.custYearOfBirth = custYearOfBirth;
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
        if (!(object instanceof CustomerEntity)) {
            return false;
        }
        CustomerEntity other = (CustomerEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CustomerEntity[ id=" + id + " ]";
    }

    public AgencyEntity getAgency() {
        return agency;
    }

    public void setAgency(AgencyEntity agency) {
        this.agency = agency;
    }
}
