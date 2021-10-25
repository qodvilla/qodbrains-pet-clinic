package com.qodbrains.qodbrainspetclinic.bootstrap;

import com.qodbrains.qodbrainspetclinic.model.Owner;
import com.qodbrains.qodbrainspetclinic.model.Vet;
import com.qodbrains.qodbrainspetclinic.services.OwnerService;
import com.qodbrains.qodbrainspetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner vince = new Owner();
        vince.setFirstName("Vincent");
        vince.setId(1L);
        vince.setLastName("Mpenyana");

        ownerService.save(vince);

        Owner lerato = new Owner();
        lerato.setFirstName("Lerato");
        lerato.setId(2L);
        lerato.setLastName("Mohlala");

        ownerService.save(lerato);


        Vet melinda = new Vet();
        melinda.setFirstName("Melinda");
        melinda.setLastName("Bill");
        melinda.setId(1L);

        vetService.save(melinda);

        Vet musk = new Vet();
        musk.setFirstName("Elon");
        musk.setId(2L);
        musk.setLastName("Gates");

        vetService.save(musk);

        System.out.println(vetService.findById(2L).toString());
    }
}
