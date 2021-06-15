package com.company;

public class Main {

    public static void main(String[] args) {
        Skate carrin = new Skate();
        carrin.setMarcaShape("Primitive").setTamanhoShape(8).setMarcaTruck("Phantom").setTamanhoTruck(139).setMarcaRoda("Spitfire").setDurezaRoda("100A").setTamanhoRoda(54);

        System.out.printf("skate construído:\nShape: %s %d polegadas\nTruck: %s %d mm\nRoda %s %d mm, dureza %s", carrin.getMarcaShape(), carrin.getTamanhoShape(), carrin.getMarcaTruck(), carrin.getTamanhoTruck(), carrin.getMarcaRoda(), carrin.getTamanhoRoda(), carrin.getDurezaRoda());
    }
}