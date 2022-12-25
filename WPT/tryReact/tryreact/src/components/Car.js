import React from 'react'

function Car(props) {
  return (
    <div>
        <h2>I am {props.brand}</h2>
    </div>
  )
}
export function Garage(){
    const carname="Ford"
    return(
        <>
        <h1>Who lives in my garage</h1>
        <Car brand={carname}></Car>
        </>
    )
}
// export default Garage