package com.company;

/**
 * Created by Win7 on 5/19/2015.
 */
public class Lingkaran {
    int jari;
    int diameter;

    public void CetakKeLayar()
    {
        System.out.println("Jari-Jari:" + jari);
        System.out.println("diameter:" + diameter);
    }

    public void ubahProperty(int jariBaru, int diameterBaru)
    {
        jari = jariBaru;
        diameter = diameterBaru;
    }
    public double hitungLuas()
    {
        double luas;
        luas= 3.14 * jari * jari;
        return luas;
    }

    public double hitungKeliling()
    {
        double Keliling;
        Keliling = 3.14 * diameter;
        return Keliling;
    }

}
