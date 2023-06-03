package com.highradius.servlets;

import com.highradius.implementation.InvoiceDao;
import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.model.Invoice;
import java.io.IOException;
import java.util.List;

public class DataLoadingServlet {
    private InvoiceDao invoiceDao;

    public void init() {
        invoiceDao = new InvoiceDaoImpl();
    }

    public List<Invoice> getInvoice() throws IOException {
        return invoiceDao.getInvoice();
    }
}
