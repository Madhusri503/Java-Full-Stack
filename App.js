import logo from './logo.svg';
import './App.css';
import Intro from './Intro';
function App() {
  return (
    <div className="App">
      <header className="App-header">
        
        <img src={"https://www.sviet.edu.in/wp-content/uploads/2023/06/SVIET-LOGO-Edited-1.png"} className="App-logo" alt="logo" />
        <p>
         sri vasavi institute of engineering and technology
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <Intro/>
      </header>
    </div>
  );
}

export default App;
