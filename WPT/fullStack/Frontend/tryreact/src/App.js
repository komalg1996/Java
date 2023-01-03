import React from 'react'
import Expense from './components/Expense'
function App() {
  let expense = [
    {
      id: 'e1',
      title: 'School Fee',
      price: 250,
      date: new Date(2022, 5, 20)
    },
    {
      id: 'e2',
      title: 'House Rent',
      price: 2500,
      date: new Date(2022, 9, 15)
    },
    {
      id: 'e3',
      title: 'Books',
      price: 500,
      date: new Date(2022, 2, 9)
    },
  ]
  return (
    <div>
      <Expense item={expense} />
    </div>
  )
}


export default App