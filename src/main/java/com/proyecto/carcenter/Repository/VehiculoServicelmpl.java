package com.proyecto.carcenter.Repository;

import com.proyecto.carcenter.Services.ClienteDTO;
import com.proyecto.carcenter.Services.ClienteService;
import com.proyecto.carcenter.Services.VehiculoDTO;
import com.proyecto.carcenter.Services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

@Service

public class VehiculoServicelmpl implements VehiculoService {

    private final EntityManager entityManager;

    @Autowired
    public VehiculoServicelmpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void registrarVehiculo(VehiculoDTO vehiculoDTO) {
        StoredProcedureQuery storedProcedure = entityManager.createNamedStoredProcedureQuery("registrarvehiculo");

        storedProcedure.setParameter("PAR_TIPO_DOCUMENTO", vehiculoDTO.getTipoDocumento());
        storedProcedure.setParameter("PAR_DOCUMENTO", vehiculoDTO.getDocumento());
        storedProcedure.setParameter("PAR_PLACA", vehiculoDTO.getPlaca());
        storedProcedure.setParameter("PAR_COLOR", vehiculoDTO.getColor());
        storedProcedure.setParameter("PAR_MARCA", vehiculoDTO.getMarca());


        storedProcedure.execute();

        String codigoRespuesta = (String) storedProcedure.getOutputParameterValue("PAR_CODIGO_RESPUESTA");
        String mensajeRespuesta = (String) storedProcedure.getOutputParameterValue("PAR_MENSAJE_RESPUESTA");

    }
}
