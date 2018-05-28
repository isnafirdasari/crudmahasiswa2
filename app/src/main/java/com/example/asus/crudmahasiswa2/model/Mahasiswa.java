package com.example.asus.crudmahasiswa2.model;

public class Mahasiswa {
    private String nama, nim, email, foto;

    public Mahasiswa (){}

    public Mahasiswa(String nama, String nim, String email, String foto) { //alt+insert > constructor
        this.nama = nama;
        this.nim = nim;
        this.email = email;
        this.foto = foto;
    }

    //alt + insert > getter and setter
    //mendapatkan variabel nama
    public String getNama() {
        return nama;
    }

    //mengisi variabel nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFoto() {
        return Integer.parseInt(foto);
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }




}
