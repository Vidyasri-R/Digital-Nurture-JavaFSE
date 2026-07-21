import React from 'react';
import sr from './office.jpg';

function App() {
    const element = "Office Space";
    const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" />;
    const ItemName = { Name: "DBS", Rent: 50000, Address: "Chennai" };
    const officeList = [
        { Name: "DBS", Rent: 50000, Address: "Chennai" },
        { Name: "TCS", Rent: 75000, Address: "Bangalore" },
        { Name: "Infosys", Rent: 45000, Address: "Hyderabad" },
        { Name: "Wipro", Rent: 80000, Address: "Mumbai" }
    ];
    return (
        <div>
            <h1>{element} , at Affordable Range </h1>
            {jsxatt}
            <h1>Name: {ItemName.Name}</h1>
            <h3 style={{ color: ItemName.Rent <= 60000 ? 'red' : 'green' }}>
                Rent: Rs. {ItemName.Rent}
            </h3>
            <h3>Address: {ItemName.Address}</h3>
            <hr />
            <h1>Available Office Spaces</h1>
            {officeList.map((item, index) => {
                let colors = [];
                if (item.Rent <= 60000) {
                    colors.push('textRed');
                }
                else {
                    colors.push('textGreen');
                }
                return (
                    <div key={index}>
                        <h2>Name: {item.Name}</h2>
                        <h3 style={{ color: colors[0] === 'textRed' ? 'red' : 'green' }}>
                            Rent: Rs. {item.Rent}
                        </h3>
                        <h3>Address: {item.Address}</h3>
                        <hr />
                    </div>
                )
            })}
        </div>
    );
}
export default App;
