package com.notyourwizzz.bangundatar;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*Kamus*/
        PersegiPanjang opersegipanjang;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        Persegi opersegi;
        Trapesium otrapesium;
        BelahKetupat obelahketupat;
        int s1, s2, r, s;

        opersegipanjang = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();
        opersegi = new Persegi();
        otrapesium = new Trapesium();
        obelahketupat = new BelahKetupat();

        /*Program*/
        //panggil metode
        mainMenu();
        //kondisional untuk pilihan menu yang dimasukan
        switch(pilihan){
            case '1':{
                System.out.println("\n=====================");
                System.out.println("|| PERSEGI PANJANG ||");
                System.out.println("=====================\n");
                System.out.print("Masukan panjang persegi panjang: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi panjang: ");
                s2 = scanner.nextInt();
                System.out.println("\nLuas persegi panjang: " + opersegipanjang.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " + opersegipanjang.keliling(s1,s2));
                break;
            }
            case '2':{
                System.out.println("\n==============");
                System.out.println("|| SEGITIGA SIKU ||");
                System.out.println("==============\n");
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("\nLuas segitiga siku: " + osegitiga.luas(s1,s2));
                System.out.println("Keliling segitiga siku: " + osegitiga.keliling(s1,s2));
                break;
            }
            case '3':{
                System.out.println("\n===============");
                System.out.println("|| LINGKARAN ||");
                System.out.println("===============\n");
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("\nLuas lingkaran: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + olingkaran.keliling(r));
                break;
            }
            case '4':{
                System.out.println("\n=============");
                System.out.println("|| PERSEGI ||");
                System.out.println("=============\n");
                System.out.print("Masukan sisi persegi: ");
                s = scanner.nextInt();
                System.out.println("\nLuas persegi: " + opersegi.luas(s));
                System.out.println("Keliling persegi: " + opersegi.keliling(s));
                break;
            }
            case '5':{
                System.out.println("\n====================");
                System.out.println("|| TRAPESIUM SIKU ||");
                System.out.println("====================\n");
                System.out.print("Masukan alas a trapesium siku: ");
                s = scanner.nextInt();
                System.out.print("Masukan alas b trapesium siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi trapesium siku: ");
                s2 = scanner.nextInt();
                System.out.println("\nLuas persegi siku: " + otrapesium.luas(s,s1,s2));
                System.out.println("Keliling persegi siku: " + otrapesium.keliling(s,s1,s2));
                break;
            }
            case '6': {
                System.out.println("\n===================");
                System.out.println("|| BELAH KETUPAT ||");
                System.out.println("===================\n");
                System.out.print("Masukan diagonal 1: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan diagonal 2: ");
                s2 = scanner.nextInt();
                System.out.println("\nLuas persegi siku: " + obelahketupat.luas(s1, s2));
                System.out.println("Keliling persegi siku: " + obelahketupat.keliling(s1, s2));
                break;
            }
            default :{
                System.out.println("tidak ada pilihan");
                break;
            }
        }
    }

    private static void mainMenu(){
        //pilihan menu
        System.out.println("====================================");
        System.out.println("|| LUAS DAN KELILING BANGUN DATAR ||");
        System.out.println("====================================\n");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Persegi");
        System.out.println("5. Trapesium");
        System.out.println("6. Belah Ketupat");
        System.out.print("\nMasukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}