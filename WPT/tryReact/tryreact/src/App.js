import React, { Component } from 'react'
import './App.css';
import List from './components/List'
import Car from './components/Car';
import { Garage } from './components/Car';
import Football from './components/Football';
import MyForm from './components/MyForm';
import Form2 from './components/Form2';

class App extends Component {
  render() {
    return (
      <div className="App">
        {/* <Car.Garage></Car.Garage> */}
       {/* <MyForm></MyForm> */}
      <Form2></Form2>
      </div>
    )
  }
}

export default App;
