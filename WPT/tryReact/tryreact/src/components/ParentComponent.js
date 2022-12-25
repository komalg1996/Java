import React, { Component } from 'react'
import ChildComponent from './ChildComponent'

class ParentComponent extends Component {
constructor(props) {
  super(props)

  this.state = {
     parentName: 'Parent'
  }
  this.greetParent = this.greetParent.bind(this)
}

greetParent(childName){
    alert(`Hello ${this.state.parentName} from ${childName}`)
}
  render() {
    return (
      <ChildComponent greetHandler={this.greetParent}></ChildComponent>  
    //   <div><button onClick={this.greetParent}>Click</button></div>
    )
  }
}

export default ParentComponent