package com.berkaykaanedikli.yazilihazirlik_2d1y;

public class Singleton {
    private String sifre;

    private String sifreOnay;
    private static Singleton singleton;

    public String getsifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getSifreOnay() {
        return sifreOnay;
    }

    public void setSifreOnay(String sifreOnay) {
        this.sifreOnay = sifreOnay;
    }
    public static Singleton getInstance(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
