package com.highradius.servlets;

import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.model.Invoice;
import com.highradius.util.ServletUtility;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the form data
        int customerOrderId = Integer.parseInt(request.getParameter("customerOrderId"));
        int salesOrg = Integer.parseInt(request.getParameter("salesOrg"));
        String distributionChannel = request.getParameter("distributionChannel");
        String division = request.getParameter("division");
        double releasedCreditValue = Double.parseDouble(request.getParameter("releasedCreditValue"));
        String purchaseOrderType = request.getParameter("purchaseOrderType");
        int companyCode = Integer.parseInt(request.getParameter("companyCode"));
        String orderCreationDate = request.getParameter("orderCreationDate");
        String orderCreationTime = request.getParameter("orderCreationTime");
        String creditControlArea = request.getParameter("creditControlArea");
        int soldToParty = Integer.parseInt(request.getParameter("soldToParty"));
        double orderAmount = Double.parseDouble(request.getParameter("orderAmount"));
        String requestedDeliveryDate = request.getParameter("requestedDeliveryDate");
        String orderCurrency = request.getParameter("orderCurrency");
        String creditStatus = request.getParameter("creditStatus");
        int customerNumber = Integer.parseInt(request.getParameter("customerNumber"));
        double amountInUSD = Double.parseDouble(request.getParameter("amountInUSD"));
        long uniqueCustId = Long.parseLong(request.getParameter("uniqueCustId"));

        // Create the invoice object
        Invoice invoice = new Invoice(customerOrderId, salesOrg, distributionChannel, division,
                releasedCreditValue, purchaseOrderType, companyCode, orderCreationDate, orderCreationTime,
                creditControlArea, soldToParty, orderAmount, requestedDeliveryDate, orderCurrency,
                creditStatus, customerNumber, amountInUSD, uniqueCustId);

        // Add the invoice to the database
        InvoiceDaoImpl invoiceDao = new InvoiceDaoImpl();
        invoiceDao.addInvoice(invoice);

        // Redirect to the data loading page
        ServletUtility.redirect(response, "DataLoadingServlet");
    }
}
