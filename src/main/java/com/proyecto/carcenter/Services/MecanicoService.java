package com.proyecto.carcenter.Services;

import com.proyecto.carcenter.Model.Cliente;
import com.proyecto.carcenter.Model.Mecanico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MecanicoService extends JpaRepository<Mecanico, Long> {

    void asignarMecanico(MecanicoDTO mecanicoDTO);
}
