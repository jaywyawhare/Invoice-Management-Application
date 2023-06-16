import React, { useState } from 'react';
import './App.css';

function App() {
  const [searchResults] = useState([
    {
      "Sl. No": 1,
      "Customer Order id": 963432061,
      "Sales Org": 3449,
      "Distribution Channel": "Martinique",
      "Company Code": 3220,
      "Order Creating Date": "01-01-2022",
      "Order Amount": 787.36,
      "Order Currency": "EUR",
      "Customer Number": 12311807,
      "Amount in USD": 892.525
    },
    {
      "Sl. No": 2,
      "Customer Order id": 971991639,
      "Sales Org": 3238,
      "Distribution Channel": "Mildova",
      "Company Code": 3260,
      "Order Creating Date": "01-01-2022",
      "Order Amount": 67493.46,
      "Order Currency": "EUR",
      "Customer Number": 12118758,
      "Amount in USD": 76508.336
    },
    {
      "Sl. No": 3,
      "Customer Order id": 754349803,
      "Sales Org": 3911,
      "Distribution Channel": "United Arab Emirates",
      "Company Code": 3290,
      "Order Creating Date": "01-01-2022",
      "Order Amount": 1405.54,
      "Order Currency": "EUR",
      "Customer Number": 1210499770,
      "Amount in USD": 1593.273
    },
    {
      "Sl. No": 4,
      "Customer Order id": 930253442,
      "Sales Org": 2381,
      "Distribution Channel": "Greece",
      "Company Code": 3290,
      "Order Creating Date": "01-01-2022",
      "Order Amount": 0,
      "Order Currency": "EUR",
      "Customer Number": 1210351400,
      "Amount in USD": 0
    },
    {
      "Sl. No": 5,
      "Customer Order id": 819741436,
      "Sales Org": 3605,
      "Distribution Channel": "Argentina",
      "Company Code": 3290,
      "Order Creating Date": "01-01-2022",
      "Order Amount": 1065.33,
      "Order Currency": "EUR",
      "Customer Number": 1210124309,
      "Amount in USD": 1207.62
    },
    {
      "Sl. No": 6,
      "Customer Order id": 881355361,
      "Sales Org": 3645,
      "Distribution Channel": "Armenia",
      "Company Code": 3470,
      "Order Creating Date": "02-01-2022",
      "Order Amount": 302.85,
      "Order Currency": "EUR",
      "Customer Number": 12311152,
      "Amount in USD": 343.593
    },

  
  ]);

  const [selectedItems, setSelectedItems] = useState<number[]>([]);

  const handleCheckboxChange = (event: React.ChangeEvent<HTMLInputElement>, slNo: number) => {
    if (event.target.checked) {
      setSelectedItems([...selectedItems, slNo]);
    } else {
      setSelectedItems(selectedItems.filter(item => item !== slNo));
    }
  };

  return (
    <div className="App">
      <header className="App-header">
        <table>
          <thead>
            <tr>
              <th></th>
              <th>Sl. No</th>
              <th>Customer Order id</th>
              <th>Sales Org</th>
              <th>Distribution Channel</th>
              <th>Company Code</th>
              <th>Order Creating Date</th>
              <th>Order Amount</th>
              <th>Order Currency</th>
              <th>Customer Number</th>
              <th>Amount in USD</th>
            </tr>
          </thead>
          <tbody>
            {searchResults.map((item) => (
              <React.Fragment key={item["Sl. No"]}>
                <tr>
                  <td>
                    <input
                      type="checkbox"
                      checked={selectedItems.includes(item["Sl. No"])}
                      onChange={(event) => handleCheckboxChange(event, item["Sl. No"])}
                    />
                  </td>
                  <td>{item["Sl. No"]}</td>
                  <td>{item["Customer Order id"]}</td>
                  <td>{item["Sales Org"]}</td>
                  <td>{item["Distribution Channel"]}</td>
                  <td>{item["Company Code"]}</td>
                  <td>{item["Order Creating Date"]}</td>
                  <td>{item["Order Amount"]}</td>
                  <td>{item["Order Currency"]}</td>
                  <td>{item["Customer Number"]}</td>
                  <td>{item["Amount in USD"]}</td>
                </tr>
                <tr>
                  <td colSpan={11} className="horizontal-line"></td>
                </tr>
              </React.Fragment>
            ))}
          </tbody>
        </table>
      </header>
    </div>
  );
}

export default App;
