/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leadspring.sfgpetclinic.model;

import java.time.LocalDate;

/**
 *
 * @author Olawale Ogunbayo
 */
public class Pet {
   private LocalDate birthDate;
    private Owner owner;
    private PetType type;

    public Pet(LocalDate birthDate, Owner owner, PetType type) {
        this.birthDate = birthDate;
        this.owner = owner;
        this.type = type;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }
    
    
}
