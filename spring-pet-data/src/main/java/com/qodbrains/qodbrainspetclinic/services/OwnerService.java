package com.qodbrains.qodbrainspetclinic.services;

import com.qodbrains.qodbrainspetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
