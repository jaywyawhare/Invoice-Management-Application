package com.highradius.implementation;

import com.highradius.model.Invoice;

import java.util.List;

public interface InvoiceDao {
    List<Invoice> getAllInvoices();

    void addInvoice(Invoice invoice);

    void updateInvoice(Invoice invoice);

    void deleteInvoice(int id);
}
