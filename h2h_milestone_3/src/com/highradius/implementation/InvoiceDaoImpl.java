package com.highradius.implementation;

import com.highradius.connection.DatabaseConnection;
import com.highradius.model.Invoice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class InvoiceDaoImpl implements InvoiceDao {
    private static final String SELECT_ALL_INVOICES = "SELECT * FROM h2h_oap";
    private static final String INSERT_INVOICE = "INSERT INTO h2h_oap (CUSTOMER_ORDER_ID, SALES_ORG, DISTRIBUTION_CHANNEL, DIVISION, RELEASED_CREDIT_VALUE, PURCHASE_ORDER_TYPE, COMPANY_CODE, ORDER_CREATION_DATE, ORDER_CREATION_TIME, CREDIT_CONTROL_AREA, SOLD_TO_PARTY, ORDER_AMOUNT, REQUESTED_DELIVERY_DATE, ORDER_CURRENCY, CREDIT_STATUS, CUSTOMER_NUMBER, AMOUNT_IN_USD, UNIQUE_CUST_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_INVOICE = "UPDATE h2h_oap SET CUSTOMER_ORDER_ID=?, SALES_ORG=?, DISTRIBUTION_CHANNEL=?, DIVISION=?, RELEASED_CREDIT_VALUE=?, PURCHASE_ORDER_TYPE=?, COMPANY_CODE=?, ORDER_CREATION_DATE=?, ORDER_CREATION_TIME=?, CREDIT_CONTROL_AREA=?, SOLD_TO_PARTY=?, ORDER_AMOUNT=?, REQUESTED_DELIVERY_DATE=?, ORDER_CURRENCY=?, CREDIT_STATUS=?, CUSTOMER_NUMBER=?, AMOUNT_IN_USD=?, UNIQUE_CUST_ID=? WHERE Sl_no=?";
    private static final String DELETE_INVOICE = "DELETE FROM h2h_oap WHERE Sl_no=?";

    @Override
    public List<Invoice> getAllInvoices() {
        // Implementation of getAllInvoices() method
    }

    @Override
    public void addInvoice(Invoice invoice) {
        // Implementation of addInvoice() method
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(UPDATE_INVOICE)) {

            statement.setInt(1, invoice.getCustomerOrderId());
            statement.setInt(2, invoice.getSalesOrg());
            statement.setString(3, invoice.getDistributionChannel());
            statement.setString(4, invoice.getDivision());
            statement.setDouble(5, invoice.getReleasedCreditValue());
            statement.setString(6, invoice.getPurchaseOrderType());
            statement.setInt(7, invoice.getCompanyCode());
            statement.setString(8, invoice.getOrderCreationDate());
            statement.setString(9, invoice.getOrderCreationTime());
            statement.setString(10, invoice.getCreditControlArea());
            statement.setInt(11, invoice.getSoldToParty());
            statement.setDouble(12, invoice.getOrderAmount());
            statement.setString(13, invoice.getRequestedDeliveryDate());
            statement.setString(14, invoice.getOrderCurrency());
            statement.setString(15, invoice.getCreditStatus());
            statement.setInt(16, invoice.getCustomerNumber());
            statement.setDouble(17, invoice.getAmountInUSD());
            statement.setLong(18, invoice.getUniqueCustId());
            statement.setInt(19, invoice.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteInvoice(int id) {
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(DELETE_INVOICE)) {

            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
