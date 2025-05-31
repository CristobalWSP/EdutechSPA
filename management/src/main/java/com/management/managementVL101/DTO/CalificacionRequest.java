package com.management.managementVL101.DTO;

public class CalificacionRequest {
    private Long idUsuario;
    private Long idCurso;
    private int puntuacion;
    private String resena;

    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public Long getIdCurso() { return idCurso; }
    public void setIdCurso(Long idCurso) { this.idCurso = idCurso; }

    public int getPuntuacion() { return puntuacion; }
    public void setPuntuacion(int puntuacion) { this.puntuacion = puntuacion; }

    public String getResena() { return resena; }
    public void setResena(String resena) { this.resena = resena; }
}
