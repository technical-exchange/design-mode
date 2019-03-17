package com.designmode.study.designmode.adpaterpattern.adapter;

import com.designmode.study.designmode.adpaterpattern.adaptee.ClientUsb;
import com.designmode.study.designmode.adpaterpattern.targettest.InterfaceA;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @ClassName UsbAdapter
 * @Description:TODO
 * @Author TANGHJ
 * @Date 2019/3/17 12:45
 * @Version 1.0
 **/
public class UsbAdapter  extends ClientUsb implements InterfaceA{
    private  static  volatile Log log = LogFactory.getLog(UsbAdapter.class);
    @Override
    public void usb2() {
    log.debug("USB2");
    }
}
