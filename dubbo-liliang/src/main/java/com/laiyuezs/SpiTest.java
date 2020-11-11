package com.laiyuezs;

import com.laiyuezs.service.Car;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @Author liliang
 * @Date 2020/11/11 17:11
 * @Description
 **/
public class SpiTest {

    public static void main(String[] args) {
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);

        Car car = extensionLoader.getExtension("car");

        car.move();
    }
}
