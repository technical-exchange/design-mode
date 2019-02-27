package com.designmode.study.designmode.simplefactory.factory;

import com.designmode.study.designmode.simplefactory.product.AutoCar;
import com.designmode.study.designmode.simplefactory.product.BinLiCar;
import com.designmode.study.designmode.simplefactory.product.Car;

/***
 * @ClassName: ProductFactory
 * @Description:TODO
 * @author: chenling
 * @Date: 2019/2/27 21:50
 * @version : V1.0.0
 */
public class SimpleFactory {

        public static void buy(String car){

            if("奥迪".equals(car)){
                Car auto = new AutoCar();
                auto.run();
            }else if("宾利".equals(car)){
                Car auto = new BinLiCar();
                auto.run();
            }else{
                throw  new RuntimeException("未找到指定车型！");
            }
        }

}
