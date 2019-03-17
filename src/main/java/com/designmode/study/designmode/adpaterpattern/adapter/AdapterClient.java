package com.designmode.study.designmode.adpaterpattern.adapter;
import com.designmode.study.designmode.adpaterpattern.adaptee.AbstractAdpater;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @ClassName AdapterClient
 * @Description:TODO
 * @Author TANGHJ
 * @Date 2019/3/17 12:56
 * @Version 1.0
 **/
public class AdapterClient  extends AbstractAdpater{
    private  static  volatile Log log = LogFactory.getLog(AdapterClient.class);
    @Override
    public  void test1(){
        log.debug("test1");
    }
    @Override
    public  void test2(){
        log.debug("test2");
    }
}
