package com.s222102506.recyclerviewb;

public class MahasiswaModel {
    private String NIM, Nama, JenisKelamin, JP;

    public MahasiswaModel() {

    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public String getJP() {
        return JP;
    }

    public void setJP(String JP) {
        this.JP = JP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
}
