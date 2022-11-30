package com.pattern.creation.factory;

import java.math.BigDecimal;

/**
 * @Author:zdd
 * @Date： 2022/11/1 15:05
 * 简单工厂类 内部是通过if 判断要生产的具体的实例对象
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
/**
 * @author zdd
 * @createTime 2022/11/30 10:05
 * @desc 定义了一个抽象类，规定了某哥类的属性和方法
 * @Param
 * @return
 */
abstract class Car{

    private String carName;

    private String carPrice;

    abstract BigDecimal getCarPrice();
}

/**
 * @author zdd
 * @createTime 2022/11/30 10:05
 * @desc 这是具体要生产的产品类，实现了具体的方法
 * @Param
 * @return
 */
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