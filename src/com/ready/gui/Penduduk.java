package com.ready.gui;

public class Penduduk {
    private String Nama;
    private String NIK;

    public Penduduk() {
    }

    public Penduduk(String nama, String NIK) {
        Nama = nama;
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return "Penduduk{" +
                "Nama='" + Nama + '\'' +
                ", NIK='" + NIK + '\'' +
                '}';
    }
}
