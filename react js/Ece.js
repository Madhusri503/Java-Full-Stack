    import {useState} from "react";
    function Ece() {
       const [Message, setMessage]=useState('Hello'); 
    const Ece=() =>{
        
        if(Message==='Hello'){
            setMessage('Welcome to React!')
        }
        else{
            setMessage('Hello');
        }
    }

return (
    <div>
        <h2>{Message}</h2>
        <button onClick={Ece}>click</button>
    </div>
);
};
export default Ece;