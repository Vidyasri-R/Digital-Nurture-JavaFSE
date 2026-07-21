import React, { Component } from 'react';

class CurrencyConvertor extends Component {
    constructor(props) {
        super(props);
        this.state = {
            amount: '',
            currency: ''
        };
        this.handleAmountChange = this.handleAmountChange.bind(this);
        this.handleCurrencyChange = this.handleCurrencyChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }
    handleAmountChange(e) {
        this.setState({ amount: e.target.value });
    }
    handleCurrencyChange(e) {
        this.setState({ currency: e.target.value });
    }
    handleSubmit(e) {
        e.preventDefault();
        const amount = parseFloat(this.state.amount);
        const convertedAmount = amount * 80;
        alert("Converting to " + this.state.currency + " Amount is " + convertedAmount);
    }
    render() {
        return (
            <div>
                <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
                <form onSubmit={this.handleSubmit}>
                    <label>Amount: </label>
                    <input type="text" value={this.state.amount} onChange={this.handleAmountChange} /><br />
                    <label>Currency: </label>
                    <input type="text" value={this.state.currency} onChange={this.handleCurrencyChange} /><br /><br />
                    <button type="submit">Submit</button>
                </form>
            </div>
        );
    }
}
export default CurrencyConvertor;
