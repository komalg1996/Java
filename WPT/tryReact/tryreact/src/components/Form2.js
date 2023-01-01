import React from 'react'
import {useState} from 'react' 
function Form2() {
    const [name, setName2] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();
    alert(`The name you entered was: ${name}`)
  }
  return (
    <form onSubmit={handleSubmit}>
      <label>Enter your name:
        <input 
          type="text" 
          value={name}
          onChange={(e) => setName2(e.target.value)}
        />
      </label>
      <input type="submit" />
    </form>
  )
  
}
export default Form2