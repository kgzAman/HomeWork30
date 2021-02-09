package com.company;

import java.util.*;

public class Animation  {

    public void getCars() {
        Random rnd = new Random();
        List<Car> cars = new ArrayList<>(200);
        int number = 4000;
        for (int i = 1; i <200; i++) {
            cars.add(new Car (number++));
        }

        for (Car s : cars){
           int x =  rnd.nextInt(100)+1;
            if (x<=20 && x >=1){
                s.setState(s.changeOnParking());
            }
            System.out.println(s);

        }
    }

}






