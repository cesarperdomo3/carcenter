package com.proyecto.carcenter.Repository;

import com.proyecto.carcenter.Services.ClienteService;
import com.proyecto.carcenter.Services.MantenimientoDTO;
import com.proyecto.carcenter.Services.MantenimientoService;
import com.proyecto.carcenter.Services.VehiculoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

@Service
public class MantenimientoServicelmpl implements MantenimientoService {

    private final EntityManager entityManager;

    @Autowired
    public MantenimientoServicelmpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void registrarMantenimiento(MantenimientoDTO mantenimientoDTO) {
        StoredProcedureQuery storedProcedure = entityManager.createNamedStoredProcedureQuery("registrarmantenimiento");

        storedProcedure.setParameter("PAR_SERVICIOS", mantenimientoDTO.getServicios());
        storedProcedure.setParameter("PAR_PLACA", mantenimientoDTO.getPlaca());



        storedProcedure.execute();

        String codigoRespuesta = (String) storedProcedure.getOutputParameterValue("PAR_CODIGO_RESPUESTA");
        String mensajeRespuesta = (String) storedProcedure.getOutputParameterValue("PAR_MENSAJE_RESPUESTA");

    }

}
