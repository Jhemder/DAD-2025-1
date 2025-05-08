package com.example.ms_venta.entity;

public class Venta {
    private Integer id;
    private Integer clienteId;
    private Integer categoriaId;

    public Venta() {
    }

    public Venta(Integer id, Integer clienteId, Integer categoriaId) {
        this.id = id;
        this.clienteId = clienteId;
        this.categoriaId = categoriaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }
}
