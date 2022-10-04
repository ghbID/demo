package com.example.demo.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author Nikki
 * @create 2022-09-03 10:28
 */

/*
 ABA 转账问题，X 给 Y 转账，系统卡顿点击了两次转账按钮，X 原来是 300，
 正常是转完账（100元） 还剩下200，第⼀次转账成功之后变成了 200，此时 Z 给 X 转了 100 元，
 余额又变回了 300，第⼆次CAS 判断（300，300，200）成功，于是又扣了X 100 元，X直接亏了100元。

即: 第一次完成后才点击第二次，但是这里是第一次还没完成，第二次就开始转账了。
解决方法代码如下
https://blog.csdn.net/m0_59140023/article/details/124482102
 */
public class AtomicIntegerTest {

    private static final AtomicStampedReference<Integer> money = new AtomicStampedReference<>(300, 0);

    public static void main(String[] args) throws InterruptedException {
        // 第一次转账点击按钮（-100）
        Thread t1 = new Thread(() -> {
            // 先得到余额
            int oldMoney = money.getReference();
            // 得到版本号
            int version = money.getStamp();
            // 执行耗时 2s
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money.compareAndSet(oldMoney, oldMoney - 100, version, version + 1);
        });
        t1.start();

        // 第二次点击按钮（-100）（不小心点击的，因为第一次点击完没反应，所以又点了一次）
        Thread t2 = new Thread(() -> {
            int oldMoney = money.getReference();
            int version = money.getStamp();
            boolean b = money.compareAndSet(oldMoney, oldMoney - 100, version, version + 1);
            System.out.println("b:" + b);
        });
        t2.start();

        // 给账户 +100
        Thread t3 = new Thread(() -> {
            int oldMoney = money.getReference();
            int version = money.getStamp();
            // 执行耗时 1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money.compareAndSet(oldMoney, oldMoney + 100, version, version + 1);
        });
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.println("最终余额：" + money.getReference());
    }
}
