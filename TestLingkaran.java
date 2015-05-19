package com.company;

/**
 * Created by Win7 on 5/19/2015.
 */
public class TestLingkaran {
    public static void main(String[] args) {
    Lingkaran bangun = new Lingkaran();

        bangun.jari= 20;
        bangun.diameter= 40;

        bangun.CetakKeLayar();
        System.out.println("Luas: " + bangun.hitungLuas());
        System.out.println("Keliling" + bangun.hitungKeliling());
    }
}
