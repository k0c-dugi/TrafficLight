package com.example.demo1;

public class TrafficLamp {
    
    int gDuration, rDuration, cycle = 0, totalCars = 0;
    protected int totalDuration = 120;
    
    protected enum lampColors {
        GREEN, YELLOW, RED;

        public lampColors next() {
            lampColors[] colors = values();
            return colors[(this.ordinal() + 1) % colors.length];
        }
    }

    private lampColors currentColor = lampColors.RED; // Kırmızı ile başlıyoruz

    public lampColors changeColor() {
        currentColor = currentColor.next();
        return currentColor;
    }

    public int durationCalculator(int[] carsOnLane){

        for(int cars : carsOnLane) {
            totalCars += cars;
        }
        //120 sn'de 20 araba geçecek?

        for(int i = 0; i < 3; i++){

        }

        //10-60 sn için bu hesaplama yapılmıştır. Bundan kaynaklı olarak rework yapılmalı
       /* for(int i = 0; i < 4; i++){
        if(carsOnLane[i]/totalCars <= 8.33/100){
            duration = 10;
            totalDuration = totalDuration-duration;
        }
        else if(carsOnLane[i]/totalCars >= 1.0/2){
            duration = 60;
            totalDuration = totalDuration-duration;
        }
        else{
            duration = carsOnLane[i]/totalCars*120;
            totalDuration = totalDuration-duration;
            }
        }*/
        cycle++;
        return 1;
    }
}
