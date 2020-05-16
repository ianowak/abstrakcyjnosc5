package com.company;

public class Main {

    public static void main(String[] args) {

        int[] tab = {10, 20, 30, 10, 20};
        int x = 30;

        WyszukiwanieRownych wyszukiwanie = new WyszukiwanieRownych();
        int index = wyszukiwanie.szukaj(tab, x);

        if (index == -1) System.out.println("nie znaleziono");
        else System.out.println("Znaleziono w indeksie nr: " + index);

    }
}

abstract class Wyszukiwanie {

    public abstract boolean porownaj(int a, int b);

    public int szukaj(int[] a, int ele) {
        for (int i = 0; i < a.length; i++) {
            if (porownaj(a[i], ele)) {
                return i;
            }
        }
        return -1;

    }
}


class WyszukiwanieRownych extends Wyszukiwanie {

    @Override
    public boolean porownaj(int a, int b) {
        return a == b;
    }
}

class WyszukiwanieNierownych extends Wyszukiwanie {

    @Override
    public boolean porownaj(int a, int b) {
        return a != b;
    }
}