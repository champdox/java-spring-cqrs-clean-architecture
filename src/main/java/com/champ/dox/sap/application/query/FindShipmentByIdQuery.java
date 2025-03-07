package com.champ.dox.sap.application.query;

import com.champ.dox.sap.domain.Shipment;

public interface FindShipmentByIdQuery {
    Shipment handle(FindShipmentById query);
}
