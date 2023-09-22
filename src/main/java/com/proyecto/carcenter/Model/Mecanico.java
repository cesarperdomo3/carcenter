package com.proyecto.carcenter.Model;


import javax.persistence.*;

@Entity
@NamedStoredProcedureQuery(
        name = "asignarmecanico",
        procedureName = "CARCENTER.ASIGNAR_MECANICO",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "PAR_MANTENIMIENTO", type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "PAR_TIPO_DOCUMENTO", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "PAR_DOCUMENTO", type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.OUT, name = "PAR_CODIGO_RESPUESTA", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.OUT, name = "PAR_MENSAJE_RESPUESTA", type = String.class),
        }
)



@Table(name = "VEHICULO", schema = "CESAR_PERDOMO")
public class Mecanico {

    @Id
    @Column(name = "DOCUMENTO")
    private Long documento;

    @Column(name = "TIPO_DOCUMENTO", nullable = false)
    private String tipoDocumento;

    @Column(name = "PRIMER_NOMBRE", nullable = false)
    private String primerNombre;

    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;

    @Column(name = "PRIMER_APELLIDO", nullable = false)
    private String primerApellido;

    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;

    @Column(name = "CELULAR")
    private String celular;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "CORREO")
    private String correo;

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}