package com.proyecto.carcenter.Repository;

import com.proyecto.carcenter.Services.MecanicoDTO;
import com.proyecto.carcenter.Services.MecanicoService;
import com.proyecto.carcenter.Services.VehiculoDTO;
import com.proyecto.carcenter.Services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;




@Service
public class MecanicoServicelmpl implements MecanicoService {

    private final EntityManager entityManager;

    @Autowired
    public MecanicoServicelmpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void asignarMecanico(MecanicoDTO mecanicoDTO) {
        StoredProcedureQuery storedProcedure = entityManager.createNamedStoredProcedureQuery("asignarmecanico");

        storedProcedure.setParameter("PAR_TIPO_DOCUMENTO", mecanicoDTO.getTipoDocumento());
        storedProcedure.setParameter("PAR_DOCUMENTO", mecanicoDTO.getDocumento());
        storedProcedure.setParameter("PAR_MANTENIMIENTO", mecanicoDTO.getMantenimiento());



        storedProcedure.execute();

        String codigoRespuesta = (String) storedProcedure.getOutputParameterValue("PAR_CODIGO_RESPUESTA");
        String mensajeRespuesta = (String) storedProcedure.getOutputParameterValue("PAR_MENSAJE_RESPUESTA");

    }
}
