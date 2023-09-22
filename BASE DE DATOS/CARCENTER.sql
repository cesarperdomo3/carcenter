--------------------------------------------------------
-- Archivo creado  - viernes-septiembre-22-2023   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Package CARCENTER
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE PACKAGE "CESAR_PERDOMO"."CARCENTER" 
AS  

PROCEDURE GUARDAR_LOG_ERROR(PAR_NOMBRE_PACKAGE IN LOG_ERRORES.NOMBRE_PACKAGE%TYPE,   
                            PAR_NOMBRE_PROCEDIMIENTO IN LOG_ERRORES.NOMBRE_PROCEDIMIENTO%TYPE,   
                            PAR_PARAMETROS IN LOG_ERRORES.PARAMETROS%TYPE,
                            PAR_CODIGO_RESPUESTA IN LOG_ERRORES.CODIGO_RESPUESTA%TYPE,
							PAR_MENSAJE_RESPUESTA IN LOG_ERRORES.MENSAJE_RESPUESTA%TYPE);
                            
                            
PROCEDURE REGISTRAR_CLIENTE(PAR_TIPO_DOCUMENTO IN CLIENTE.TIPO_DOCUMENTO%TYPE,   
                        PAR_DOCUMENTO IN CLIENTE.DOCUMENTO%TYPE,   
                        PAR_PRIMER_NOMBRE IN CLIENTE.PRIMER_NOMBRE%TYPE,   
                        PAR_SEGUNDO_NOMBRE IN CLIENTE.SEGUNDO_NOMBRE%TYPE,   
                        PAR_PRIMER_APELLIDO IN CLIENTE.PRIMER_APELLIDO%TYPE,   
                        PAR_SEGUNDO_APELLIDO IN CLIENTE.SEGUNDO_APELLIDO%TYPE,   
                        PAR_CELULAR IN CLIENTE.CELULAR%TYPE,     
                        PAR_CORREO IN CLIENTE.CORREO%TYPE,     
                        PAR_DIRECCION IN CLIENTE.DIRECCION%TYPE,
                        PAR_CODIGO_RESPUESTA OUT VARCHAR2,
                        PAR_MENSAJE_RESPUESTA OUT VARCHAR2);     
                        
PROCEDURE CONSULTAR_MARCAS(
                        PAR_MARCA OUT SYS_REFCURSOR,   
                        PAR_CODIGO_RESPUESTA OUT VARCHAR2,
                        PAR_MENSAJE_RESPUESTA OUT VARCHAR2);   
                        


PROCEDURE CONSULTAR_SERVICIOS(
                        PAR_SERVICIOS OUT SYS_REFCURSOR,   
                        PAR_CODIGO_RESPUESTA OUT VARCHAR2,
                        PAR_MENSAJE_RESPUESTA OUT VARCHAR2);    
                        
PROCEDURE CREAR_MANTENIMIENTO(
                        PAR_SERVICIOS IN VARCHAR2,
                        PAR_PLACA IN VEHICULOS.PLACA%TYPE,
                        PAR_CODIGO_RESPUESTA OUT VARCHAR2,
                        PAR_MENSAJE_RESPUESTA OUT VARCHAR2);
                        
PROCEDURE ASIGNAR_MECANICO(
                        PAR_MANTENIMIENTO IN MANTENIMIENTOS.PK_MANTENIMIENTOS%TYPE,
                        PAR_TIPO_DOCUMENTO IN MANTENIMIENTOS.MEC_TIPO_DOCUMENTO%TYPE,
                        PAR_DOCUMENTO IN MANTENIMIENTOS.MEC_DOCUMENTO%TYPE,
                        PAR_CODIGO_RESPUESTA OUT VARCHAR2,
                        PAR_MENSAJE_RESPUESTA OUT VARCHAR2);                        
END CARCENTER;

/
