package com.company;

/**
 * Created by Win7 on 5/19/2015.
 */
public class TestSegitiga {
    public static void main(String[] args)
    {
        Segitiga bangun = new Segitiga();

        bangun.alas = 20;
        bangun.tinggi = 20;
        bangun.sisimiring = 40;

        bangun.CetakKeLayar();

        System.out.println("Luas: " + bangun.hitungLuas());
        System.out.println("Keliling: " + bangun.hitungkeliling());
    }
}
