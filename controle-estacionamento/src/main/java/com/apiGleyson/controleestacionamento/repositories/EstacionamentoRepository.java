package com.apiGleyson.controleestacionamento.repositories;

import com.apiGleyson.controleestacionamento.model.EstacionamentoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository /* Interface Repositório - Padrão MVC*/
public interface EstacionamentoRepository extends JpaRepository<EstacionamentoModel, UUID> {

    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByBlockAndApartment(String block, String apartment);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    Page<EstacionamentoModel> findAll(Pageable pageable);
}
