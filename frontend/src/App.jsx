import React from 'react'

export default function App(){
  // Load the original HTML inside an iframe so its scripts run normally
  // This preserves the login/modal flow present in the template.
  return (
    <div style={{width: '100%', height: '100vh', margin: 0, padding: 0}}>
      <iframe
        title="template-preview"
        src="/template.html"
        style={{border: 'none', width: '100%', height: '100%'}}
      />
    </div>
  )
}
