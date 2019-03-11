package com.designmode.study.designmode.builderPattern.director;

import com.designmode.study.designmode.builderPattern.builder.CarBuilder;
import com.designmode.study.designmode.builderPattern.concreteBuilder.BuilderAudi;
import com.designmode.study.designmode.builderPattern.product.Car;
import lombok.Data;

/***
 * @ClassName: Constrcut
 * @Description:TODO 指挥者
 * @author: chenling
 * @Date: 2019/3/11 10:53
 * @version : V1.0.0
 */
@Data
public class Director { // 将一个复杂的构建过程与其表示相分离
    private CarBuilder builder;// 针对接口编程，而不是针对实现编程


    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public  void productCar(){
        // 控制（定义）一个复杂的构建过程
        // 提示：如果想在运行过程中替换构建算法，可以考虑结合策略模式。
        builder.BuildBody();
        builder.BuildEngine();
        builder.BuildWheel();
    }


    public static void main(String[] args) {

        CarBuilder audi  = new BuilderAudi();//建造者
        Director director = new Director(audi);//监工
        director.productCar();//建造实例(监工负责监督，建造者实际建造)
        Car car = audi.CreateCar();//获取最终生成结果
        System.out.println(car);

    }



}
