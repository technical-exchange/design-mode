package com.designmode.study.designmode.builderPattern.product;

import lombok.Data;

/***
 * @ClassName: Engine
 * @Description:TODO 汽车发动机:产品角色
 * @author: chenling
 * @Date: 2019/3/11 10:51
 * @version : V1.0.0
 */
@Data
public class Engine {
    private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
