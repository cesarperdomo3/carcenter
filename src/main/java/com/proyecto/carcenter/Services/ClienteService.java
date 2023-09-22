package com.proyecto.carcenter.Services;

import com.proyecto.carcenter.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteService extends JpaRepository<Cliente, Long> {
    void registrarCliente(ClienteDTO clienteDTO);

}