package com.salaboy.invoice.service.mapper;

import org.junit.jupiter.api.BeforeEach;

class InvoiceMapperTest {

    private InvoiceMapper invoiceMapper;

    @BeforeEach
    public void setUp() {
        invoiceMapper = new InvoiceMapperImpl();
    }
}
