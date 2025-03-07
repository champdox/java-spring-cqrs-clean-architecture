package com.champ.dox.sap.infra;

import com.champ.dox.sap.domain.Shipment;
import com.champ.dox.sap.domain.repository.Shipments;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ShipmentStore implements Shipments {

    private final InMemoryShipmentRepository shipmentRepository;
    private final JpaShipmentRepository jpaShipmentRepository;

    @Override
    public Optional<Shipment> findById(Long id) {

//        Optional<ShipmentEntity> entity = jpaShipmentRepository.findById(id);
//
//        if (entity.isPresent()) {
//            return Optional.of(new Shipment(entity.get().getId(),
//                    entity.get().getItem(),
//                    entity.get().getStatus(),
//                    entity.get().getOrigin(),
//                    entity.get().getDestination()));
//        }

        return shipmentRepository.findById(id);
    }

    @Override
    public List<Shipment> findAllShipments() {
        return shipmentRepository.findAll();
    }

    @Override
    public Shipment save(Shipment shipment) {
        shipmentRepository.save(shipment);
        return shipment;
    }

    @Override
    public void deleteById(Long id) {
        shipmentRepository.deleteById(id);
    }

    @Override
    public Shipment update(Long id, Shipment shipment) {
        return shipmentRepository.update(id, shipment);

    }
}
