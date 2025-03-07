package com.champ.dox.sap.infra;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaShipmentRepository extends JpaRepository<ShipmentEntity, Long> {
}
