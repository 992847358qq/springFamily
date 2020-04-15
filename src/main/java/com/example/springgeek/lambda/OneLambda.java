package com.example.springgeek.lambda;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/4/12 11:58
 **/
public class OneLambda {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x ->x>60;
        Map<String,Integer> map = new HashMap<>();
        map.put("id",70);
        System.out.println("大于60的id:"+predicate.test(map.get("id")));

        Consumer<String> consumer = System.out::println;
        consumer.accept("我命由我不由天");

        Supplier<Integer> supplier =
                () -> Integer.valueOf(BigDecimal.TEN.toString());
        System.out.println(supplier.get());

        BinaryOperator<Integer> operator = (x, y) -> x * y;
        Integer integer = operator.apply(2, 3);
        System.out.println(integer);

        test(() -> "我是一个演示的函数式接口");
    }

    /**
     * 演示自定义函数式接口使用
     *
     * @param worker
     */
    public static void test(Worker worker) {
        String work = worker.work();
        System.out.println(work);
    }

    public interface Worker {
        String work();
    }
}
