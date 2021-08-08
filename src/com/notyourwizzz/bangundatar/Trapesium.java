package com.notyourwizzz.bangundatar;

public class Trapesium implements BangunDatar{

    int c;
    Trapesium(){
    }
    @Override
    public double luas(int s1, int s2) {
        return 0;
    }
    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }
    public double luas(int s, int s1, int s2) { //metode overload
        return ((s + s1) / 2 * s2);
    }
    public double keliling(int s, int s1, int s2) { //methode overload
        c = s - s1;
        return (s + s1 + s2 + Math.sqrt((c * c) + (s2 * s2)));
    }
}
