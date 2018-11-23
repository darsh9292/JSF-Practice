package com.darshan.jsf;

import com.darshan.proxy.ShipmentProxy;
import com.darshan.proxy.ShipmentRow;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Darshan Patel
 */
@ManagedBean
@ViewScoped
public class PostOffer implements Serializable {

    private List<ShipmentProxy> shipmentTerms = new ArrayList<ShipmentProxy>();

    public PostOffer() {
    }

    @PostConstruct
    public void init() {
        System.out.println("init called");
        shipmentTerms.add(new ShipmentProxy(1l, "Yard Pickup"));
        shipmentTerms.add(new ShipmentProxy(2l, "FAS Port"));
        shipmentTerms.add(new ShipmentProxy(3l, "CFR Port"));
        shipmentTerms.add(new ShipmentProxy(4l, "CIF Port"));
        shipmentTerms.add(new ShipmentProxy(5l, "Delivered"));
        shipmentTerms.add(new ShipmentProxy(6l, "FOB"));
    }
    
    public void processPriceDiffChoice(ShipmentRow row) {
        if (row.getPriceChoice().equals("Above Price")) {
            row.setPriceEnable(false);
        } else {
            row.setPriceEnable(true);
        }
    }

    public void addShipmentTermsRow(ShipmentProxy proxy) {
        if (proxy.isStatus()) {
            proxy.getShipmentRowList().add(new ShipmentRow());
        } else {
            proxy.getShipmentRowList().clear();
        }
    }

    public void removeShipmentTermsRow(ShipmentProxy proxy,ShipmentRow row) {
        proxy.getShipmentRowList().remove(row);
    }

    public List<ShipmentProxy> getShipmentTerms() {
        return shipmentTerms;
    }

    public void setShipmentTerms(List<ShipmentProxy> shipmentTerms) {
        this.shipmentTerms = shipmentTerms;
    }

}
