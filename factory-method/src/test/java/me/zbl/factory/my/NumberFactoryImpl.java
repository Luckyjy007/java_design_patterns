package me.zbl.factory.my;

import java.math.BigDecimal;

public class NumberFactoryImpl implements NumberFactory {


    @Override
    public Number parse(String str) {

        return new BigDecimal(str);
    }
}
