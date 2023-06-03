package com.highradius.servlets;

import com.highradius.implementation.InvoiceDao;
import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.model.Invoice;
import java.io.IOException;

public class AddServlet {
    private InvoiceDao invoiceDao;

    public void init() {
        invoiceDao = new InvoiceDaoImpl();
    }

    public void addInvoice(Invoice invoice) throws IOException {
        invoiceDao.insertInvoice(invoice);
    }

}
