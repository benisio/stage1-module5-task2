package com.epam.mjc;

import java.util.List;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> list.stream().map(i -> i/3).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var interfaceCreator = new InterfaceCreator();
        System.out.println(interfaceCreator.divideBy(3).apply(List.of(30, 60, 90, 100)));
    }
}
