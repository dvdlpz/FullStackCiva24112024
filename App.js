import React, { useState, useEffect } from 'react';
import BusTable from './components/BusTable';

const App = () => {
    const [buses, setBuses] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8081/bus') 
            .then(response => response.json())
            .then(data => setBuses(data))
            .catch(error => console.error('Error al obtener los buses:', error));
    }, []);

    return (
        <div>
            <h1>Lista de Buses</h1>
            <BusTable buses={buses} />
        </div>
    );
};

export default App;
