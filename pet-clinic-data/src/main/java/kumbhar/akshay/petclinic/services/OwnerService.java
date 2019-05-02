package kumbhar.akshay.petclinic.services;

import kumbhar.akshay.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
