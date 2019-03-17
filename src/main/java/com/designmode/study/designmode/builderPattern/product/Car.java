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


	public Body getCarBody() {
		return carBody;
	}


	public void setCarBody(Body carBody) {
		this.carBody = carBody;
	}


	public Engine getCarEngine() {
		return carEngine;
	}


	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}


	public Wheel getCarWheel() {
		return carWheel;
	}


	public void setCarWheel(Wheel carWheel) {
		this.carWheel = carWheel;
	}

}
