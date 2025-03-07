package com.champ.dox.sap.presentation;

import com.champ.dox.sap.application.query.FindShipmentById;
import com.champ.dox.sap.application.query.FindShipmentByIdQuery;
import com.champ.dox.sap.domain.Shipment;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/shipment")
@Slf4j
@RequiredArgsConstructor
public class ShipmentController {

    private final FindShipmentByIdQuery queryService;

    @GetMapping(
            path = "{shipmentId}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ShipmentDto> getBankAccount(@PathVariable Long shipmentId) {

        final Shipment result = queryService.handle(new FindShipmentById(shipmentId));

        log.info("Get bank account result: {}", result);
        return ResponseEntity.ok(ShipmentDto.builder()
                .id(result.getId())
                .item(result.getItem())
                .status(result.getStatus())
                .build());
    }

}
