package org.example;

import org.reflections.ReflectionUtils;

import java.lang.reflect.Modifier;

import static org.reflections.ReflectionUtils.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new EnumUtil().enumBelongsTo(TestEnum.class, "One"));
        System.out.println(new EnumUtil().enumBelongsTo(TestEnum.class, "Two"));
        System.out.println(new EnumUtil().enumBelongsTo(TestEnum.class, "Three"));
    }
}