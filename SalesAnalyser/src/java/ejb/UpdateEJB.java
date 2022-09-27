/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import com.supsellers.us.sales.export.Sale;
import com.supsellers.us.sales.export.SalesExportService;
import entities.AgencyEntity;
import entities.ChannelEntity;
import entities.CustomerEntity;
import entities.NewEntity;
import entities.ProductEntity;
import entities.PromotionEntity;
import entities.SaleEntity;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Sely
 */
@Stateless
public class UpdateEJB {
    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/SalesExportService.wsdl")
    private SalesExportService service;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @EJB
    private DatabaseManipulationEJB dm;    

    public UpdateEJB() {
    }

    public UpdateEJB(SalesExportService service) {
        this.service = service;
    }

    public void clearDataBase() {
    }

    public void updateFromWSDLServer() {
        List<com.supsellers.us.sales.export.Sale> sales;
        Iterator it;
        // TODO process result here

        try {
            sales = getFranceSales();
            com.supsellers.us.sales.export.Sale rSale;

            AgencyEntity agency = new AgencyEntity();
            agency.setAgencyName("France");
            agency.setId((long) 1);
            ChannelEntity channel = new ChannelEntity();
            CustomerEntity customer = new CustomerEntity();
            ProductEntity product = new ProductEntity();
            PromotionEntity promotion = new PromotionEntity();
            SaleEntity sale = new SaleEntity();

            it = sales.iterator();
            while (it.hasNext()) {
                try {
                    rSale = (Sale) it.next();

                    channel.setAgency(agency);
                    channel.setChannelClass(rSale.getChannel().getChannelClass());
                    channel.setChannelClassId(rSale.getChannel().getChannelClassId());
                    channel.setChannelDesc(rSale.getChannel().getChannelDesc());
                    channel.setChannelId(rSale.getChannel().getChannelId());
                    channel.setChannelTotal(rSale.getChannel().getChannelTotal());
                    channel.setChannelTotalId(rSale.getChannel().getChannelTotalId());
                    channel.setId(rSale.getChannel().getChannelId().longValue());

                    customer.setAgency(agency);
                    customer.setCountryId(rSale.getCustomer().getCountryId());
                    customer.setCustCity(rSale.getCustomer().getCustCity());
                    customer.setCustCityId(rSale.getCustomer().getCustCityId());
                    customer.setCustCreditLimit(rSale.getCustomer().getCustCreditLimit());
                    customer.setCustEffFrom(rSale.getCustomer().getCustEffFrom() + "EffFrom");
                    customer.setCustEffTo(rSale.getCustomer().getCustEffTo() + "EffTo");

                    customer.setCustEmail(rSale.getCustomer().getCustEmail());
                    customer.setCustFirstName(rSale.getCustomer().getCustFirstName());
                    customer.setCustGender(rSale.getCustomer().getCustGender());
                    customer.setCustId(rSale.getCustomer().getCustId());
                    customer.setCustIncomeLevel(rSale.getCustomer().getCustIncomeLevel());
                    customer.setCustLastName(rSale.getCustomer().getCustLastName());
                    customer.setCustMainPhoneNumber(rSale.getCustomer().getCustMainPhoneNumber());
                    customer.setCustMaritalStatus(rSale.getCustomer().getCustMaritalStatus());
                    customer.setCustPostalCode(rSale.getCustomer().getCustPostalCode());
                    customer.setCustSrcId(rSale.getCustomer().getCustSrcId());
                    customer.setCustStateProvince(rSale.getCustomer().getCustStateProvince());
                    customer.setCustStateProvinceId(rSale.getCustomer().getCustStateProvinceId());
                    customer.setCustStreetAddress(rSale.getCustomer().getCustStreetAddress());
                    customer.setCustTotal(rSale.getCustomer().getCustTotal());
                    customer.setCustTotalId(rSale.getCustomer().getCustTotalId());
                    customer.setCustValid(rSale.getCustomer().getCustValid());
                    customer.setCustYearOfBirth(rSale.getCustomer().getCustYearOfBirth());
                    customer.setId(rSale.getCustomer().getCustId().longValue());

                    product.setAgency(agency);
                    product.setId(rSale.getProduct().getProdId().longValue());
                    product.setProdCategory(rSale.getProduct().getProdCategory());
                    product.setProdCategoryDesc(rSale.getProduct().getProdCategoryDesc());
                    product.setProdCategoryId(rSale.getProduct().getProdCategoryId());
                    product.setProdDesc(rSale.getProduct().getProdDesc());
                    product.setProdEffFrom(rSale.getProduct().getProdEffFrom() + "ff");
                    product.setProdEffTo(rSale.getProduct().getProdEffTo() + "ff");
                    product.setProdId(rSale.getProduct().getProdId());
                    product.setProdListPrice(rSale.getProduct().getProdListPrice());
                    product.setProdMinPrice(rSale.getProduct().getProdMinPrice());
                    product.setProdName(rSale.getProduct().getProdName());
                    product.setProdPackSize(rSale.getProduct().getProdPackSize());
                    product.setProdSrcId(rSale.getProduct().getProdSrcId());
                    product.setProdStatus(rSale.getProduct().getProdStatus());
                    product.setProdSubcategory(rSale.getProduct().getProdSubcategory());
                    product.setProdSubcategoryDesc(rSale.getProduct().getProdSubcategoryDesc());
                    product.setProdSubcategoryId(rSale.getProduct().getProdCategoryId());
                    product.setProdTotal(rSale.getProduct().getProdTotal());
                    product.setProdTotalId(rSale.getProduct().getProdTotalId());
                    product.setProdUnitOfMeasure(rSale.getProduct().getProdUnitOfMeasure());
                    product.setProdValid(rSale.getProduct().getProdValid());
                    product.setProdWeightClass(rSale.getProduct().getProdWeightClass());
                    product.setSupplierId(rSale.getProduct().getSupplierId());

                    promotion.setAgency(agency);
                    promotion.setId(rSale.getPromotion().getPromoId().longValue());
                    promotion.setPromoBeginDate(rSale.getPromotion().getPromoBeginDate());
                    promotion.setPromoCategory(rSale.getPromotion().getPromoCategory());
                    promotion.setPromoCategoryId(rSale.getPromotion().getPromoCategoryId());
                    promotion.setPromoCost(rSale.getPromotion().getPromoCost());
                    promotion.setPromoEndDate(rSale.getPromotion().getPromoEndDate());
                    promotion.setPromoId(rSale.getPromotion().getPromoId());
                    promotion.setPromoName(rSale.getPromotion().getPromoName());
                    promotion.setPromoSubcategory(rSale.getPromotion().getPromoSubcategory());
                    promotion.setPromoSubcategoryId(rSale.getPromotion().getPromoSubcategoryId());
                    promotion.setPromoTotal(rSale.getPromotion().getPromoTotal());
                    promotion.setPromoTotalId(rSale.getPromotion().getPromoTotalId());

                    sale.setAgency(agency);
                    sale.setAmountSold(rSale.getAmountSold());
                    sale.setChannel(channel);
                    sale.setCustomer(customer);
                    sale.setId(rSale.getSaleId().longValue());
                    sale.setProduct(product);
                    sale.setPromotion(promotion);
                    sale.setTimeId(rSale.getTimeId());

                    /**
                     * Persisting to Database
                     */
                    System.out.println("1hello testing");
                    dm.addAgency(agency);
                    System.out.println("2hello testing");
                    //dm.addChannel(channel);                     
                    //dm.addCustomer(customer);                     
                    //dm.addProduct(product);
                    //dm.addPromotion(promotion);                     
                    //dm.addSale(sale);    
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage() + "hello testing");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private java.util.List<com.supsellers.us.sales.export.Sale> getFranceSales() {
        com.supsellers.us.sales.export.SalesExport port = service.getSalesExportPort();
        return port.getFranceSales();
    }

    public void updateData() {
        try {
            NewEntity ne = new NewEntity();
            ne.setId((long) 123);
            System.out.println("1");
            ne.setFirstEntity("First");
            System.out.println("2");
            ne.setAnotherField("another");
            System.out.println("3");
            dm.addNewEntity(ne);
            System.out.println("4");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
