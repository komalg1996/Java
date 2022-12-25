import React from 'react'

export default function Football() {
    const shoot=(a)=>{
        alert(a);
    }

  return (
    <button onClick={()=>shoot("Goal!!")}>Take a shot</button>
  );
}
