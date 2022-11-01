package com.pattern.creation.factory;

import java.math.BigDecimal;

/**
 * @Author:zdd
 * @Date： 2022/11/1 15:05
 */
public class SimpleFactory {

    public static  Car getCarPrice(String carName){

        if (carName.equals("CarBMW")){
            return new CarBMW();
        }else if (carName.equals("CarSUV")){
            return new CarSUV();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        Car carBMW = SimpleFactory.getCarPrice("CarBMW");
        BigDecimal carPrice = carBMW.getCarPrice();
        System.out.println(carPrice);
    }
}

abstract class Car{

    private String carName;

    private String carPrice;

    abstract BigDecimal getCarPrice();
}

class CarBMW extends Car{

    @Override
    BigDecimal getCarPrice() {
        return BigDecimal.valueOf(24);
    }
}

class CarSUV extends Car{
    @Override
    BigDecimal getCarPrice() {
        return BigDecimal.valueOf(42);
    }
}