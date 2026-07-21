import React, { Component } from 'react';

class EventExamples extends Component {
    constructor(props) {
        super(props);
        this.state = {
            counter: 0
        };
        this.increment = this.increment.bind(this);
        this.decrement = this.decrement.bind(this);
        this.sayHello = this.sayHello.bind(this);
        this.sayWelcome = this.sayWelcome.bind(this);
        this.onPress = this.onPress.bind(this);
    }
    increment() {
        this.setState({ counter: this.state.counter + 1 });
    }
    sayHello() {
        alert("Hello! Member!");
    }
    decrement() {
        this.setState({ counter: this.state.counter - 1 });
    }
    sayWelcome(message) {
        alert(message);
    }
    onPress(e) {
        alert("I was clicked");
    }
    handleIncrement = () => {
        this.increment();
        this.sayHello();
    }
    render() {
        return (
            <div>
                <h3>{this.state.counter}</h3>
                <button onClick={this.handleIncrement}>Increment</button><br />
                <button onClick={this.decrement}>Decrement</button><br />
                <button onClick={() => this.sayWelcome("welcome")}>Say welcome</button><br />
                <button onClick={this.onPress}>Click on me</button>
            </div>
        );
    }
}
export default EventExamples;
