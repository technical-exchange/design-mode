package com.designmode.study.designmode.builderPattern.concreteBuilder;

import com.designmode.study.designmode.builderPattern.builder.CarBuilder;
import com.designmode.study.designmode.builderPattern.product.Body;
import com.designmode.study.designmode.builderPattern.product.Car;
import com.designmode.study.designmode.builderPattern.product.Engine;
import com.designmode.study.designmode.builderPattern.product.Wheel;

/***
 * @ClassName: BuilderBenz
 * @Description:TODO 奔驰汽车生产商
 * @author: chenling
 * @Date: 2019/3/11 10:49
 * @version : V1.0.0
 */
public class BuilderBenz implements CarBuilder {

    private Car car = new Car();

    @Override
    public void BuildBody() {
        Body body = new Body();
        body.setDescription("奔驰汽车车身组装完成");
        car.setCarBody(body);
    }

    @Override
    public void BuildEngine() {
        Engine engine = new Engine();
        engine.setDescription("奔驰汽车发动机组装完成");
        car.setCarEngine(engine);
    }

    @Override
    public void BuildWheel() {
        Wheel wheel = new Wheel();
        wheel.setDescription("奔驰汽车车轮组装完成");
        car.setCarWheel(wheel);

    }

    @Override
    public Car CreateCar() {
        System.out.println("奔驰车安装完成。。。");
        return car;
    }
}
