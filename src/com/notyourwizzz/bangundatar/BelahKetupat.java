package com.notyourwizzz.bangundatar;

public class BelahKetupat implements BangunDatar{

    int a,b;
    BelahKetupat(){
    }
    @Override
    public double luas(int s1, int s2) {
        return (s1 * s2 / 2);
    }
    @Override
    public double keliling(int s1, int s2) {
        a = s1 / 2;
        b = s2 / 2;
        return (Math.sqrt((a * a) + (b * b)) * 4);
    }
}
