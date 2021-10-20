package com.qodbrains.qodbrainspetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    @RequestMapping({"vet", "vet.html"})
    public String vetIndex(){
        return "vet/vet";
    }
}
