package com.ms.msdemo.dto;

public class RespuestaHttp {
    private String mensaje;

    public RespuestaHttp(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
