package com.example.dwimahdini;

public class Isi {
    String nama;
    String nim;
    int picture;

    public Isi(String name, String nim, int image) {
        this.nama = name;
        this.nim = nim;
        this.picture = image;
    }

    public String getName() {
        return nama;
    }

    public void setName(String name) {
        this.nama = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getImage() {
        return picture;
    }

    public void setImage(int image) {
        this.picture = image;
    }
}