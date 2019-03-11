package com.designmode.study.designmode.builderPattern.product;

import lombok.Data;

/***
 * @ClassName: Car
 * @Description:TODO 汽车:产品角色
 * @author: chenling
 * @Date: 2019/3/11 10:50
 * @version : V1.0.0
 */
@Data
public class Car {

    private Body carBody;


    private Engine carEngine;


    private Wheel carWheel;

}
