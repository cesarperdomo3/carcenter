package com.proyecto.carcenter.Repository;

import com.proyecto.carcenter.Model.Cliente;
import com.proyecto.carcenter.Services.ClienteDTO;
import com.proyecto.carcenter.Services.ClienteRepository;
import com.proyecto.carcenter.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final EntityManager entityManager;

    @Autowired
    public ClienteServiceImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void registrarCliente(ClienteDTO clienteDTO) {
        StoredProcedureQuery storedProcedure = entityManager.createNamedStoredProcedureQuery("registrarcliente");

        storedProcedure.setParameter("PAR_TIPO_DOCUMENTO", clienteDTO.getTipoDocumento());
        storedProcedure.setParameter("PAR_DOCUMENTO", clienteDTO.getDocumento());
        storedProcedure.setParameter("PAR_PRIMER_NOMBRE", clienteDTO.getPrimerNombre());
        storedProcedure.setParameter("PAR_SEGUNDO_NOMBRE", clienteDTO.getSegundoNombre());
        storedProcedure.setParameter("PAR_PRIMER_APELLIDO", clienteDTO.getPrimerApellido());
        storedProcedure.setParameter("PAR_SEGUNDO_APELLIDO", clienteDTO.getSegundoApellido());
        storedProcedure.setParameter("PAR_CELULAR", clienteDTO.getCelular());
        storedProcedure.setParameter("PAR_CORREO", clienteDTO.getCorreo());
        storedProcedure.setParameter("PAR_DIRECCION", clienteDTO.getDireccion());

        storedProcedure.execute();

        String codigoRespuesta = (String) storedProcedure.getOutputParameterValue("PAR_CODIGO_RESPUESTA");
        String mensajeRespuesta = (String) storedProcedure.getOutputParameterValue("PAR_MENSAJE_RESPUESTA");

    }
}