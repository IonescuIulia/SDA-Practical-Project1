package com.sda.practicalproject1.service;

import com.sda.practicalproject1.model.Vet;
import com.sda.practicalproject1.repository.exception.EntityUpdateFailedException;
import com.sda.practicalproject1.service.exception.EntitiyNotFoundException;

import java.util.List;
import java.util.Optional;

public interface VetService {

    void addVet(
           String firstName,
           String lastName,
           String address,
           String speciality
    ) throws EntityUpdateFailedException;

    List<Vet> getAllVets();

    void updateVet(long id, String lastName, String address, String speciality) throws EntityUpdateFailedException, EntitiyNotFoundException;
    Optional <Vet> findVetbyId(long id);

    void deleteVetById(long id) throws EntityUpdateFailedException, EntitiyNotFoundException;
}

