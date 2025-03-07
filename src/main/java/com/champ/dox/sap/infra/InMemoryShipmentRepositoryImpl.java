package com.champ.dox.sap.infra;

import com.champ.dox.sap.domain.Shipment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryShipmentRepositoryImpl implements InMemoryShipmentRepository {

    private final Map<Long, Shipment> shipmentMap = new ConcurrentHashMap<>();

    @Override
    public Optional<Shipment> findById(Long id) {
        return Optional.ofNullable(shipmentMap.get(id));
    }

    @Override
    public List<Shipment> findAll() {
        return new ArrayList<>(shipmentMap.values());
    }

    @Override
    public Shipment save(Shipment shipment) {
        shipmentMap.put(shipment.getId(), shipment);
        return shipment;
    }

    @Override
    public void deleteById(Long id) {
        shipmentMap.remove(id);
    }

    @Override
    public Shipment update(Long id, Shipment shipment) {
        if (shipmentMap.containsKey(id)) {
            shipmentMap.put(id, shipment);
            return shipment;
        }
        return null;
    }
}