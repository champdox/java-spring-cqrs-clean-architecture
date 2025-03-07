package com.champ.dox.sap.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Shipment {

    private Long id;
    private String item;
    private String status;
    private String origin;
    private String destination;

    public Shipment() {
    }

    public Shipment(Long id, String item, String status, String origin, String destination) {
        this.id = id;
        this.item = item;
        this.status = status;
        this.origin = origin;
        this.destination = destination;
    }

}
