package com.champ.dox.sap.presentation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
public class ShipmentDto {

    private Long id;
    private String item;
    private String status;
    private String origin;
    private String destination;
}
