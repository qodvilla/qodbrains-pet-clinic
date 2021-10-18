package com.qodbrains.qodbrainspetclinic.services;

import com.qodbrains.qodbrainspetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
