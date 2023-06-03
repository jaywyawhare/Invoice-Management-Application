# AI-Enabled FinTech B2B Invoice Management Application

## Business Overview

In the B2B (Business-to-Business) world, businesses engage with other businesses on credit terms. When a buyer places an order with a seller, the seller issues an invoice containing details of the goods purchased and the payment terms. This is known as "Accounts Receivable" in accounting terminology.

The objective of the Tech Track project is to develop an AI-Enabled FinTech B2B Invoice Management Application using Java and React-Js. This application aims to streamline invoice management for businesses by providing features such as credit validation, order verification, inventory check, and predicting order amounts.

## Problem Statement

The objective of the Web Application Development internship project is to build a Full-stack Invoice Management Application using React Js, JDBC, and Java Servlets. The application should include the following mandatory and optional features:

## Mandatory Features

- <b> UI Creation</b> : Develop a user interface for the application.
- <b> Grid Creation</b> : Create a grid to display invoice data.
- <b> Grid Data Loading</b> : Load invoice data from a database into the grid.
- <b> CRUD Operation</b> : Enable add, edit, and delete operations on the grid.
- <b> Pagination</b> : Implement pagination functionality for the grid.
- <b> Shortcut search button on Grid for Customer Order Id</b> : Allow users to search invoices by customer order ID.
- <b> Predict Button activation with Grid Data</b> : Enable prediction of order amounts based on selected invoice data.
- <b> View - Analytics</b> : Provide analytics view with bar graph and pie chart.

## Optional Features

- <b> Advanced Search </b>: Implement advanced search functionality.
- <b> UI Enhancements </b>: Add additional user interface enhancements for extra credit.

## Application Overview

The application consists of the following major components:

- Data Loading in DB
- Import the provided Invoices database into MySQL.
- Use the provided SQL file for the order amount prediction dataset.
- UI Representation of the data
- Build a responsive user interface to display the loaded invoice data.
- Implement search and pagination features.
- Enable editing of selected fields, adding new rows, and deleting rows from the grid.
- AI Support in the application
- Integrate AI capabilities to predict the order amount for one or more invoices.

## Milestones

1. <b> Milestone 1 </b> - Using Collections Framework for Read Write Operations

- Create a Java project named h2h_milestone_1.
- Create the following packages:
  - com.highradius.connection
  - com.highradius.implementation
  - com.highradius.model
  - com.highradius.servlets
- Implement the Invoice class in the <b>com.highradius.model</b> package with a parameterized constructor and getter/setter methods.
- Create the DatabaseConnection class in the <b>com.highradius.connection</b> package with methods for getting and adding invoices.
- Implement the InvoiceDao interface and the InvoiceDaoImpl class in the <b>com.highradius.implementation</b> package.
- Create the AddServlet and DataLoadingServlet classes in the <b>com.highradius.servlets</b> package to handle API calls for adding and retrieving invoice data.

2. <b>Milestone 2</b> - Connecting Database using JDBC

- Import the provided SQL database into MySQL.
- Create a Java project to fetch data from the database using JDBC.
- Use the provided JDBC jar for MySQL connection.

3. <b>Milestone 3</b> - API call using Servlets

- Create different servlets for different functionalities such as read, add, edit, and delete.
- Implement API calls for loading data into the grid and adding data.

4. <b>Milestone 4</b> - Create Table using HTML and CSS

- Create an HTML table with static data.
- Apply CSS styles to the table for a visually appealing appearance.

5. <b>Milestone 5</b> - Create data grid using React JS Components

- Use React JS class or functional components to create a table with static data.

6. <b>Milestone 6</b> - Creation of Grid using Material UI

- Implement a data grid using Material UI components.

## Usage

1. Clone the repository to your local machine.

   ```bash
   git clone https://github.com/jaywyawhare/Invoice-Management-Application.git
   ```

1. Ensure that you have the required dependencies installed. You can use the setup.sh script provided in the repository to check and install the requirements. Run the script using the following command:

   ```bash
   bash setup.sh
   ```

1. Navigate to the <b>h2h_milestone_5</b> folder and run the following command to start the server:

   ```bash
   npm start
   ```

1. Navigate to http://localhost:3000/ to view the application.

## Conclusion

The AI-Enabled FinTech B2B Invoice Management Application aims to simplify and streamline the process of managing invoices in a B2B environment. By providing features such as grid display, CRUD operations, pagination, search functionality, and AI-based prediction, the application empowers businesses to effectively manage their invoices and make informed decisions.

By following the milestones and utilizing the provided technologies (Java, React JS, JDBC, Java Servlets), you can build a robust and user-friendly invoice management system. Feel free to customize and enhance the application further based on your specific requirements and preferences.
