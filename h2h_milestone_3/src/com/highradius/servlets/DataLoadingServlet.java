package com.highradius.servlets;

import com.google.gson.Gson;
import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.model.Invoice;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DataLoadingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve all invoices from the database
        InvoiceDaoImpl invoiceDao = new InvoiceDaoImpl();
        List<Invoice> invoices = invoiceDao.getAllInvoices();

        // Convert invoices to JSON
        Gson gson = new Gson();
        String jsonInvoices = gson.toJson(invoices);

        // Set the response content type to JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Send the JSON response
        PrintWriter out = response.getWriter();
        out.print(jsonInvoices);
        out.flush();
    }
}
