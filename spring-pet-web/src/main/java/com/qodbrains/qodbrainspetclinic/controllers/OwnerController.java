package com.qodbrains.qodbrainspetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
    @RequestMapping({"owner", "owner.html"})
    public String ownerIndex(){
        return "owner/owner";
    }
}
