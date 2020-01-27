package com.company.model;

import static com.company.model.Main.sc;

public abstract class Person {
    public String username ;
    public String password ;
    public String nama ;
    public String jabatan ;

    public Person(Person person) {
        this.username = person.username;
        this.password = person.password;
        this.nama = person.nama;
        this.jabatan = person.jabatan;
    }
    public Person() {
    }

}
