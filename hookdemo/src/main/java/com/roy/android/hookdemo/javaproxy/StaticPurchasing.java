package com.roy.android.hookdemo.javaproxy;

/**
 * 代理类- 静态
 */
public class StaticPurchasing  implements  IShop{

    private IShop mIShop;

    public StaticPurchasing(IShop IShop) {
        mIShop = IShop;
    }

    @Override
    public void buy() {
        mIShop.buy();
    }
}
