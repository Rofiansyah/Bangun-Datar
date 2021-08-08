package com.notyourwizzz.bangundatar;

public class Persegi implements BangunDatar{

    Persegi(){
    }
    @Override
    public double luas(int s1, int s2) {
        return 0;
    }
    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }
    public double luas(int s) { //metode overload
        return (s * s);
    }
    public double keliling(int s) { //methode overload
        return (4 * s);
    }
}
