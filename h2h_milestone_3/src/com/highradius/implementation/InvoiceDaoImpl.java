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
        List<Invoice> invoices = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(SELECT_ALL_INVOICES);
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Invoice invoice = new Invoice();
                invoice.setId(resultSet.getInt("Sl_no"));
                invoice.setCustomerOrderId(resultSet.getInt("CUSTOMER_ORDER_ID"));
                invoice.setSalesOrg(resultSet.getInt("SALES_ORG"));
                invoice.setDistributionChannel(resultSet.getString("DISTRIBUTION_CHANNEL"));
                invoice.setDivision(resultSet.getString("DIVISION"));
                invoice.setReleasedCreditValue(resultSet.getDouble("RELEASED_CREDIT_VALUE"));
                invoice.setPurchaseOrderType(resultSet.getString("PURCHASE_ORDER_TYPE"));
                invoice.setCompanyCode(resultSet.getInt("COMPANY_CODE"));
                invoice.setOrderCreationDate(resultSet.getString("ORDER_CREATION_DATE"));
                invoice.setOrderCreationTime(resultSet.getString("ORDER_CREATION_TIME"));
                invoice.setCreditControlArea(resultSet.getString("CREDIT_CONTROL_AREA"));
                invoice.setSoldToParty(resultSet.getInt("SOLD_TO_PARTY"));
                invoice.setOrderAmount(resultSet.getDouble("ORDER_AMOUNT"));
                invoice.setRequestedDeliveryDate(resultSet.getString("REQUESTED_DELIVERY_DATE"));
                invoice.setOrderCurrency(resultSet.getString("ORDER_CURRENCY"));
                invoice.setCreditStatus(resultSet.getString("CREDIT_STATUS"));
                invoice.setCustomerNumber(resultSet.getInt("CUSTOMER_NUMBER"));
                invoice.setAmountInUSD(resultSet.getDouble("AMOUNT_IN_USD"));
                invoice.setUniqueCustId(resultSet.getLong("UNIQUE_CUST_ID"));

                invoices.add(invoice);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return invoices;
    }

    @Override
    public void addInvoice(Invoice invoice) {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT_INVOICE)) {
    
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
    
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInvoice'");
    }

    @Override
    public void deleteInvoice(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteInvoice'");
    }
