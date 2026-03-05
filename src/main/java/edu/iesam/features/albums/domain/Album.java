package edu.iesam.features.albums.domain;

public class Album {

    private String Id;
    private String descripcion;
    private String fecha;

    public Album(String id, String descripcion, String fecha) {
        this.Id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
