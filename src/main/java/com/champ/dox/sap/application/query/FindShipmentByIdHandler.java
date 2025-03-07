package com.champ.dox.sap.application.query;

import com.champ.dox.sap.domain.Shipment;
import com.champ.dox.sap.domain.repository.Shipments;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindShipmentByIdHandler implements FindShipmentByIdQuery {

    private final Shipments shipments;

    @Override
    public Shipment handle(FindShipmentById query) {
        return shipments.findById(query.shipmentId())
                .orElseThrow(() -> new ShipmentNotFoundException("Shipment not found with id: " + query.shipmentId()));
    }
}
