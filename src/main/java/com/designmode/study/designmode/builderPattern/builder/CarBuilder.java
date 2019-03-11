package com.designmode.study.designmode.builderPattern.builder;


import com.designmode.study.designmode.builderPattern.product.Car;

/***
 * @ClassName: CarBuilder
 * @Description:TODO 汽车抽象建造者
 * @author: chenling
 * @Date: 2019/3/11 10:43
 * @version : V1.0.0
 */
public interface CarBuilder {

    //汽车身体
    void BuildBody();
    //汽车发动机
    void BuildEngine();
    //汽车车轮
    void BuildWheel();
    //构建汽车
    Car CreateCar();


}
