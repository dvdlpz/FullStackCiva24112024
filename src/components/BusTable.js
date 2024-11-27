import React from 'react';

const BusTable = ({ buses }) => {
    return (
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Número de Bus</th>
                    <th>Placa</th>
                    <th>Características</th>
                    <th>Marca</th>
                    <th>Activo</th>
                </tr>
            </thead>
            <tbody>
                {buses.map(bus => (
                    <tr key={bus.id}>
                        <td>{bus.id}</td>
                        <td>{bus.numeroBus}</td>
                        <td>{bus.placa}</td>
                        <td>{bus.caracteristicas}</td>
                        <td>{bus.marca}</td>
                        <td>{bus.activo ? 'Sí' : 'No'}</td>
                    </tr>
                ))}
            </tbody>
        </table>
    );
};

export default BusTable;
