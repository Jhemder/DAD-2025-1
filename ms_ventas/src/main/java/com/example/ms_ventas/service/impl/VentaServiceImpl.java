package com.example.ms_venta.service.impl;

import com.example.ms_venta.entity.Venta;
import com.example.ms_venta.repository.VentaRepository;
import com.example.ms_venta.service.VentaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaServiceImpl implements VentaService {

    private final VentaRepository ventaRepository;

    public VentaServiceImpl(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    @Override
    public List<Venta> listar() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta obtenerPorId(Integer id) {
        Optional<Venta> venta = ventaRepository.findById(id);
        return venta.orElse(null);
    }

    @Override
    public Venta guardar(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public Venta actualizar(Integer id, Venta venta) {
        venta.setId(id);
        return ventaRepository.save(venta);
    }

    @Override
    public void eliminar(Integer id) {
        ventaRepository.deleteById(id);
    }
}
