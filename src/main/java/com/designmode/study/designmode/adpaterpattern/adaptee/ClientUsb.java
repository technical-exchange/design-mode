package com.designmode.study.designmode.adpaterpattern.adaptee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @ClassName ClientUsb
 * @Description:TODO
 * @Author TANGHJ
 * @Date 2019/3/17 12:43
 * @Version 1.0
 **/
public class ClientUsb implements  InterfaceB{
    private  static  volatile Log log= LogFactory.getLog(ClientUsb.class);
    @Override
    public void usb3() {
        log.debug("USB3");
    }
}
