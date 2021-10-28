package com.example.tugas4_1918069;

public class Lagu {
    private String judul,penyanyi,tahun;
    private int cover_album;
    public Lagu(String judul, String penyanyi, String tahun, int cover_album){
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.tahun = tahun;
        this.cover_album = cover_album;
    }



    public String getJudul(){
        return judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getTahun(){ return tahun; }
    public void setTahun(String tahun){
        this.tahun = tahun;
    }
    public String getPenyanyi(){
        return penyanyi;
    }
    public void setPenyanyi(String penyanyi){
        this.penyanyi = penyanyi;
    }

    public int getFoto() { return cover_album; }
    public void setFoto(int cover_album) { this.cover_album = cover_album; }

}
