package com.example.ms_venta.service;

import com.example.ms_venta.entity.Venta;
import java.util.List;

public interface VentaService {
    List<Venta> listar();
    Venta obtenerPorId(Integer id);
    Venta guardar(Venta venta);
    Venta actualizar(Integer id, Venta venta);
    void eliminar(Integer id);
}
