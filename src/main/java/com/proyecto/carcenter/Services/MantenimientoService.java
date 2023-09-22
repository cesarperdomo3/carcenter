package com.proyecto.carcenter.Services;

import com.proyecto.carcenter.Model.Cliente;
import com.proyecto.carcenter.Model.Mantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MantenimientoService extends JpaRepository<Mantenimiento, Long> {

    void registrarMantenimiento(MantenimientoDTO mantenimientoDTO);
}
