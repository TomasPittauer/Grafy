package day_24_9;

import java.util.Arrays;

enum Rasizmus{
    Bila,
    Cerna,
    Zluta,
    Hneda
}

class neco{

    public static void main(String[] args) {
        Rasizmus[] barvy = { Rasizmus.Bila, Rasizmus.Cerna };

        System.out.println(Arrays.toString(barvy));

    }}