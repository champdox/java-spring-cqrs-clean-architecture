package com.champ.dox.sap.infra;

import com.champ.dox.sap.domain.Shipment;

import java.util.List;
import java.util.Optional;

public interface InMemoryShipmentRepository {
    Optional<Shipment> findById(Long id);
    List<Shipment> findAll();
    Shipment save(Shipment shipment);
    void deleteById(Long id);
    Shipment update(Long id, Shipment shipment);
}
