package com.laiyuezs.service;

import org.apache.dubbo.common.extension.SPI;

/**
 * @Author liliang
 * @Date 2020/11/11 17:11
 * @Description
 **/
@SPI("car")
public interface Car {

    public void move();
}
