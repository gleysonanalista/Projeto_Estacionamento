package com.apiGleyson.controleestacionamento.services;

import com.apiGleyson.controleestacionamento.model.EstacionamentoModel;
import com.apiGleyson.controleestacionamento.repositories.EstacionamentoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EstacionamentoService {

    final  EstacionamentoRepository estacionamentoRepository;

    public EstacionamentoService(EstacionamentoRepository estacionamentoRepository) {
        this.estacionamentoRepository = estacionamentoRepository;
    }

    @Transactional
    public EstacionamentoModel save(EstacionamentoModel estacionamentoModelo) {
        return estacionamentoRepository.save(estacionamentoModelo);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return estacionamentoRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return estacionamentoRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public List<EstacionamentoModel> findAll() {
        return estacionamentoRepository.findAll();
    }

    public Optional<EstacionamentoModel> findById(UUID id) {
        return estacionamentoRepository.findById(id);
    }
    @Transactional
    public void delete(EstacionamentoModel estacionamentoModel) {
        estacionamentoRepository.delete(estacionamentoModel);
    }

   /* public boolean existsByApartamentAndBlock(String apartment, String block) {
        return estacionamentoRepository.existsByApartamentAndBlock(apartment , block);
    }*/
}
