package com.champ.dox.sap.domain.repository;

import com.champ.dox.sap.domain.Shipment;

import java.util.List;
import java.util.Optional;

public interface Shipments {
    Optional<Shipment> findById(Long id);

    List<Shipment> findAllShipments();

    Shipment save(Shipment Shipment);

    void deleteById(Long id);

    Shipment update(Long id, Shipment Shipment);
}
