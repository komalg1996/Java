import React, { Component } from 'react'
import './App.css';
import List from './components/List'
import Car from './components/Car';
import { Garage } from './components/Car';
import Football from './components/Football';
import MyForm from './components/MyForm';
import Form2 from './components/Form2';
import Header from './components/Mystyle';
import Mystyle from './components/Mystyle';

class App extends Component {
  render() {
    return (
      <div className="App">
        {/* <Car.Garage></Car.Garage> */}
       {/* <MyForm></MyForm> */}
      {/* <Form2></Form2> */}
      {/* <Mystyle></Mystyle> */}
      <Header></Header>
      </div>
    )
  }
}

export default App;
