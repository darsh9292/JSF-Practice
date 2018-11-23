package com.darshan.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Darshan Patel
 */
public class ShipmentProxy {
    
    private Long id;
    private boolean status;
    private String name;
    private List<ShipmentRow> shipmentRowList = new ArrayList<ShipmentRow>();

    public ShipmentProxy(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ShipmentRow> getShipmentRowList() {
        return shipmentRowList;
    }

    public void setShipmentRowList(List<ShipmentRow> shipmentRowList) {
        this.shipmentRowList = shipmentRowList;
    }

}
