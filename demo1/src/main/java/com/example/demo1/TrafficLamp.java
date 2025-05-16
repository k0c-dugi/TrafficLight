package com.example.demo1;

public class TrafficLamp {
    
    int duration,gDuration, rDuration, cycle = 0, totalCars = 0;
    protected final int totalDuration = 120;
    public static boolean isGreen = false;
    private static lampColors currentColor = lampColors.RED; // Kırmızı ile başlıyoruz
    
    protected enum lampColors {
         RED, GREEN, YELLOW;

        public lampColors next() {
            lampColors[] colors = values();
            return colors[(this.ordinal() + 1) % colors.length];
        }
    }

    public static lampColors changeColor() {
        currentColor = currentColor.next();
        return currentColor;
    }

    public static void lighten(int duration, lampColors currentColor) throws InterruptedException {
        while(duration > 0){
            System.out.println(currentColor);
            Thread.sleep(100);
            duration--;
         }
        changeColor();
        System.out.println(currentColor);
        Thread.sleep(300);
        changeColor();
    }
}
