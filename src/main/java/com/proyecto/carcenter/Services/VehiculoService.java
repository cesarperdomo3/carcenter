package com.proyecto.carcenter.Services;

import com.proyecto.carcenter.Model.Cliente;
import com.proyecto.carcenter.Model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoService extends JpaRepository<Vehiculo, Long> {

    void registrarVehiculo(VehiculoDTO vehiculoDTO);

}
