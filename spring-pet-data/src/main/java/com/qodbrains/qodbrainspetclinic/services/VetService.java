package com.qodbrains.qodbrainspetclinic.services;

import com.qodbrains.qodbrainspetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
