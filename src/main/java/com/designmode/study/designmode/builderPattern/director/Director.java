package com.designmode.study.designmode.builderPattern.director;

import com.designmode.study.designmode.builderPattern.builder.CarBuilder;
import com.designmode.study.designmode.builderPattern.concreteBuilder.BuilderAudi;
import com.designmode.study.designmode.builderPattern.product.Car;

/***
 * @ClassName: Constrcut
 * @Description:TODO 指挥者
 * @author: chenling
 * @Date: 2019/3/11 10:53
 * @version : V1.0.0
 */
public class Director {


    public static void productCar(CarBuilder builder){
        builder.BuildBody();
        builder.BuildEngine();
        builder.BuildWheel();
    }


    public static void main(String[] args) {

        CarBuilder audi  = new BuilderAudi();
        productCar(audi);
        Car car = audi.CreateCar();
        System.out.println(car);

    }



}
