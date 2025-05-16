package com.example.demo1;



public class LampController {
    int lane = 0;
    int cycle = 0;
    int totalCars = 0;
    int[] laneDuration = new int[4];

    public int getLaneDuration(int i) {
        return laneDuration[i];
    }

    public int getLane() {
        return lane;
    }

    private void durationCalculator(int[] carsOnLane, int lane) throws ArithmeticException{
        int duration = 0;
        for(int cars : carsOnLane) {
            totalCars += cars;
        }
        //120 sn'de 20 araba geçecek şekilde yazıldı, yani her bir araba 6 saniyeye sahip.
        for(int i = 0; i < lane; i++){
            laneDuration[i] = (int) ((carsOnLane[i]/totalCars)*120);
        }
    }

    public int laneChoser(int[] carsOnLane){
            return cycle%4;
        }
        //laneChoser clasından veri gelecek, keza durationCalculatordan da süre gelecek
        public void activateLane(int[] laneDuration, int lane) throws InterruptedException {
            if(TrafficLamp.isGreen == false){
                TrafficLamp.isGreen = true;
                TrafficLamp.lighten(getLaneDuration(lane), TrafficLamp.lampColors.GREEN);
                while (laneDuration[lane] > 0){
                    System.out.println("It's green for :"+ getLaneDuration(lane));;
                    laneDuration[lane]--;
                }
                TrafficLamp.isGreen = false;
                cycle++;
            }
        }
    }