package com.salaboy.invoice.service.mapper;

import com.salaboy.invoice.domain.Invoice;
import com.salaboy.invoice.service.dto.InvoiceDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Invoice} and its DTO {@link InvoiceDTO}.
 */
@Mapper(componentModel = "spring")
public interface InvoiceMapper extends EntityMapper<InvoiceDTO, Invoice> {}
