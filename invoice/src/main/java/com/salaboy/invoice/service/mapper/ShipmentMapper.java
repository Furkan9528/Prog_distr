package com.salaboy.invoice.service.mapper;

import com.salaboy.invoice.domain.Invoice;
import com.salaboy.invoice.domain.Shipment;
import com.salaboy.invoice.service.dto.InvoiceDTO;
import com.salaboy.invoice.service.dto.ShipmentDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Shipment} and its DTO {@link ShipmentDTO}.
 */
@Mapper(componentModel = "spring")
public interface ShipmentMapper extends EntityMapper<ShipmentDTO, Shipment> {
    @Mapping(target = "invoice", source = "invoice", qualifiedByName = "invoiceCode")
    ShipmentDTO toDto(Shipment s);

    @Named("invoiceCode")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "code", source = "code")
    InvoiceDTO toDtoInvoiceCode(Invoice invoice);
}
