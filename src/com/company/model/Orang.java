package com.company.model;

import static com.company.model.Main.sc;

public class Orang extends Person {
    public Orang() {
        System.out.println();
        System.out.println("username");
        username=sc.nextLine();
        System.out.println("pass");
        password=sc.nextLine();
        System.out.println("nama");
        nama=sc.nextLine();
        System.out.println("jabatan");
        jabatan=sc.nextLine();
        System.out.println("Data sudah terinput");
    }

    public Orang(Person person) {
        super(person);
    }

    public void orangShow(){
        System.out.println(nama);
        System.out.println(jabatan);
        System.out.println(username);
        System.out.println(password);
    }
}
