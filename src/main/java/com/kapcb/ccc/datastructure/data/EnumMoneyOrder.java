package com.kapcb.ccc.datastructure.data;

/**
 * @author kapcb
 * @version 1.0.0
 * @classname EnumMoneyOrder
 * @description 
 * @date 2020/10/22 16:21
 */
public class EnumMoneyOrder {
    public static void main(String[] args) {
        EnumMoney[] values = EnumMoney.values();
        for (EnumMoney value : values) {
            System.out.println("Index: " + value.ordinal() + ", value: " + value);
        }
    }
}
